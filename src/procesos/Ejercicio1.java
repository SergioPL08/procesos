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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String[] ejecuta ={ "C:\\Users\\Sergio\\AppData\\Local\\Programs\\Python\\Python310\\python.exe","C:\\Users\\sergio\\Documents\\NetBeansProjects\\Procesos\\import_json.py"  };
            ProcessBuilder pb = new ProcessBuilder(ejecuta);
            Process p = pb.start();
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));
            System.out.println(read.readLine());
            int codigo = p.waitFor();
            read.close();
        }
        catch(IOException | InterruptedException ex){
            System.out.println("Error"+ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }
    
}
