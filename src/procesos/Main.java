/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.io.IOException;
import java.lang.InterruptedException;

/**
 *
 * @author sergio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RunTime, exec
        //ProcessBuilder
        //Process
        try{
            String [] lanzaNotepad = {"cmd", "Start"};
            Process p = Runtime.getRuntime().exec(lanzaNotepad);
            int codigo = p.waitFor();
            if(codigo!=0){
                System.out.println("Codigo creado correctamente");
            }
            else{
                System.out.println("Cagaste");
            }
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
       }
    }
    
}
