/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo12;

import ejemplo11.Buffer;
import java.security.SecureRandom;

/**
 *
 * @author Sergio
 */
public class Cliente implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer bufferCompartido; //Referencia al buffer compoartido

    public Cliente(Buffer bf){
        this.bufferCompartido=bf;
    }
    
    @Override
    public void run() {
        int sum = 0;
        for(int count=1;count<=10;count++){
            try{
                Thread.sleep(generator.nextInt(3000));
                sum+=bufferCompartido.blockingGet();;
            }
            catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%n%s %d%n%s%n", "| La suma total del cliente es ",sum," |Terminando cliente");
    }
}
