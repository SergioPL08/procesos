/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo11;

import ejemplo10.Cliente;
import ejemplo10.Proveedor;
import ejemplo11.Buffer;
import ejemplo11.SynBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sergio
 */
public class ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService exService = Executors.newCachedThreadPool();
        Buffer bufferCompartido = new SynBuffer();
        System.out.printf("%-10%s%s\t\t%s%n%-40%s%s%n%n","Operacion","Buffer","Ocupado","---------","-------\t\t-------");
        
        exService.execute(new Proveedor(bufferCompartido));
        exService.execute(new Cliente(bufferCompartido));
        exService.shutdown();
        try {
            exService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
