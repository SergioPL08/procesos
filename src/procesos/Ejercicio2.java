/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static procesos.Pruebas.printSon;

/**
 *
 * @author Sergio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        
        try{
            Process process = runtime.exec("powershell.exe  C:\\Users\\Sergio\\Desktop\\ey.ps1");
            process.getOutputStream().close();
            BufferedReader read = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = read.readLine();
            int contador=5;
            do{
                //System.out.println(line);
                
                while((line = read.readLine())!=null){  
                    System.out.println(line);
                    contador--;
                    if(contador==0){
                        System.out.println("Proceso: "+process.isAlive());
                        contador=5;
                    }
                }
            } while ((line) != null);
            System.out.println("Proceso: "+process.isAlive());
        }
        catch(IOException ex){
            System.err.println("Error");
        }
    }
        
}


