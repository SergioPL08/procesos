package ejemplo11;

import ejemplo10.*;
import java.security.SecureRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
                bufferCompartido.blockingPut(count);
                sum+=count;
                System.out.printf("\b2d%n",sum);
            }
            catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("------------------------------------------------------------------------------------------");
        System.out.printf("%n%s %d%n%s%n","| La suma total en cliente es ",sum, "Terminando cliente");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
