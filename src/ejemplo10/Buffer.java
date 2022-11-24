/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejemplo10;

/**
 *
 * @author Sergio
 */
public interface Buffer {
    //Escribe un valor de tipo entero en el Buffer
    public void blockingPut(int value) throws InterruptedException;
    
    //Lee un valor de tipo entero en el Buffer
    public int blockingGet() throws InterruptedException;
}
