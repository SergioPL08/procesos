/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo10;

import java.security.SecureRandom;

/**
 *
 * @author Sergio
 */
public class Proveedor implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer bufferCompartido;

    public Proveedor(Buffer buffeCompartido) {
        this.bufferCompartido = buffeCompartido;
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
