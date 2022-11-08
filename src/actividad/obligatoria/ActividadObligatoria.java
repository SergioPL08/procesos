/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.obligatoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class ActividadObligatoria {

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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter = args[1].charAt(0);
        int numLetras = cuentaLetra(args[0],caracter);
        System.out.println("El caracter "+caracter+" aparece "+numLetras+" veces");
    }
    
}
