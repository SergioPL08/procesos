/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sergio
 */
public class ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService exService = Executors.newCachedThreadPool();
        Buffer bufferCompartido = new unSyncBuffer();
        
        System.out.println("Action\t\tValor\tSuma Proveedor\tSuma Cliente");
        System.out.printf("------\t\t------\t------------\t------------%n%n");
        
        exService.execute(new Proveedor(bufferCompartido));
        exService.execute(new Cliente(bufferCompartido));
        exService.shutdown();;
        try{
            exService.awaitTermination(1, TimeUnit.MINUTES);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
}
