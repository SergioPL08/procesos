/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sergio
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra por pantalla el directorio actual del proceso. 
        try{
            ProcessBuilder pb = new ProcessBuilder();
            pb.command("cmd.exe", "/C", "dir");
            Process p = pb.start();
            InputStreamReader SReader = new InputStreamReader(p.getInputStream());
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line="";
            while((line=read.readLine())!=null){
                System.out.println(line);
            }
            
            int codigo = p.waitFor();
            System.out.println(codigo);
            read.close();
        }
        catch(IOException | InterruptedException ex){
            System.out.println("Error"+ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        //¿Qué ha mostrado el comando dir ejecutado en el cmd?
        //Ha mostrado los archivos y directorios del directorio actual, que en este caso es el directorio del proyecto
        
        //Cambia el directorio del proceso a C:/. Muestra el cambio y vuelve a lanzar el proceso. 
        try{
            ProcessBuilder pb = new ProcessBuilder();
            pb.command("cmd.exe", "/C", "dir C:\\.");
            Process p = pb.start();
            InputStreamReader SReader = new InputStreamReader(p.getInputStream());
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line="";
            while((line=read.readLine())!=null){
                System.out.println(line);
            }
            
            int codigo = p.waitFor();
            System.out.println(codigo);
            read.close();
        }
        catch(IOException | InterruptedException ex){
            System.out.println("Error"+ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        //¿Qué muestra ahora el comando?
        //Muestra los archivos y directorios del disco C
        
    }
    
}
