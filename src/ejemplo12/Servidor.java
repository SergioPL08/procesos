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
public class Servidor implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final ejemplo11.Buffer bufferCompartido;

    public Servidor(Buffer bufferCompartido) {
        this.bufferCompartido = bufferCompartido;
    }

    
    
    @Override
    public void run() {
        int sum = 0;
        for(int count=1;count<=10;count++){
            try {
                Thread.sleep(generator.nextInt(3000));
                bufferCompartido.blockingPut(count);
                sum+=count;
                System.out.printf("\t%d%n",sum);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
