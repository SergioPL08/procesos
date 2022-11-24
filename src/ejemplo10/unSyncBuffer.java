/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo10;
/**
 *
 * @author Sergio
 */
public class unSyncBuffer implements Buffer{
    private int buffer = -1;
    
    public void blockingPut(int value) throws InterruptedException{
            System.out.printf("Proveedor \t%2d",value);
            buffer = value;
    }
    
    public int blockingGet() throws InterruptedException{
        System.out.printf("Cliente lee \t%2d",buffer);
        return buffer;
    }
    
    
}
