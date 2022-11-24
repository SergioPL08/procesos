/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Sergio
 */
public class SynBufferLockCondi implements Buffer{
    private final Lock candado = new ReentrantLock();
    private final Condition puedoEscribir = candado.newCondition();
    private final Condition puedoLeer = candado.newCondition();
    private int buffer = -1;
    private boolean lleno = false;
    public void blockingPut(int value) throws InterruptedException{
        candado.lock();
        try {
            while(lleno){
                System.out.println("Servidor intenta escribir");
                displayState("Buffer lleno. Servidor espera");
                puedoEscribir.await();
            }
            buffer=value;
            lleno=true;
            displayState("Servidor está escribiendo "+buffer);
            puedoLeer.signalAll();
            
        } finally {
            candado.unlock();
        }
    }
    
    public int blockingGet() throws InterruptedException{
        int readValue=0;
        candado.lock();
        try{
            while(!lleno){
                System.out.println("Cliente intenta leer");
                displayState("Buffer vacío. Cliente espera");
                puedoLeer.await();
            }
            lleno=false;
            readValue=buffer;
            displayState("Cliente está leyendo "+readValue);
            puedoEscribir.signalAll();
        }finally{
            candado.unlock();
        }
        return readValue;
    }
    
    private void displayState(String operacion){
        try{
            candado.lock();
            System.out.printf("%-40s%d\t\t%b%n%n",operacion,buffer,lleno);
        }
        finally{
            candado.unlock();
        }
    }

    
}
