/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sergio
 */
public class Servicio {

    public static void printSon(Process proceso) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String linea="";
        while((linea=read.readLine())!=null){
            System.out.println(linea);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Actividad 1
        /*
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
        */
        //Actividad 2
            
            try{
                String acciones= "cmd.exe /c dir";
                int contador=0;
                Process proceso = Runtime.getRuntime().exec("powershell.exe");
                printSon(proceso);
                int codigo = proceso.waitFor();
                while(contador>=11){
                    if(proceso.isAlive()){
                        System.out.println("Ta fresco");
                    }
                    proceso.wait(5);
                    contador+=5;
                }
            }
            catch(IOException | InterruptedException ex){
                System.out.println("Ta mal");

            }
        
        //Deprecated
        /*
        if(args.length<=0){
            //System.out.println("Introduce comando a ejecutar");
            //System.exit(1);
        }ç
        */
        /*        
        try{
            String acciones= "cmd.exe /c dir";
            String acciones2 ="ping www.google.com";
            String [] acciones3 ={"java","Procesos.Servicio"};
            Process proceso = Runtime.getRuntime().exec(acciones);
            printSon(proceso);
            int codigo = proceso.waitFor();
            if(proceso.exitValue()==0){
                System.out.println("Ta fresco");
            }
            else{
                System.out.println("Cagaste");
                System.out.print("Codigo "+codigo);
            }
        }
        catch(IOException | InterruptedException ex){
            System.out.println("Ta mal");
            
        }
    */
    }
    
}
