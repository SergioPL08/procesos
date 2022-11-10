/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.obligatoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class tal{
        public static int cuentaLetra(String fichero,char caracter){
            int pos,contador=0;
            String aux,cadena="";
            StringBuilder sb = new StringBuilder();
            File archivo = new File(fichero);
            try {
                //Leemos el fichero
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                //Añadimos el contenido del fichero a un String
                while((aux=br.readLine())!=null){
                    sb.append(aux);
                }
                cadena = sb.toString();
                pos = cadena.indexOf(caracter);
                while (pos != -1){
                    contador++;
                    pos=cadena.indexOf(caracter,pos + 1);
                }
                return contador;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ActividadObligatoria.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActividadObligatoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            return contador;
        }
        public static void lanzaHilos(String[] ruta, String salida){
            ProcessBuilder pb = new ProcessBuilder(ruta);
            try{
                int num = cuentaLetra("hp.txt", 'a');
                pb.redirectOutput(new File(Integer.toString(num)));
                pb.wait(3000);
                Process p = pb.start();
            }
            catch(Exception e){
                System.out.println("Cagaste");
            }
        }
        public static void leeLetras(String fichero,char caracter){
            File archivo = new File(fichero);
            String aux="";
            try{
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while((aux=br.readLine())!=null){
                    System.out.println("El caracter "+caracter+" aparece "+aux+" veces");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(tal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(tal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
