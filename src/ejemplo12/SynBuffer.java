/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo12;

import ejemplo11.*;

/**
 *
 * @author Sergio
 */
public class SynBuffer implements Buffer{
    private int buffer = -1;
    private boolean ocupado = false;
    
    public synchronized void blockingPut(int value) throws InterruptedException{
        while(ocupado){
            System.out.println("Servidor intenta escribir");
            displayState("Buffer lleno, toca esperar");
            wait();
        }
        buffer = value;
        ocupado = true;
        displayState("Servidor escribe "+buffer);
        notifyAll();
    }
    
    public synchronized int blockingGet() throws InterruptedException{
        while(!ocupado){
            System.out.println("Cliente lee");
            displayState("Buffer vacío, el cliente espera");
            wait();
        }
        ocupado = false;
        displayState("Cliente lee "+buffer);
        notifyAll();
        return buffer;
    }
    
    private synchronized void displayState(String operacion){
        System.out.printf("%n%-40s%d\t\t%d%n%n", operacion, buffer, ocupado);
    }

}
