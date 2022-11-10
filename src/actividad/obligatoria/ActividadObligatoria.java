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


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        char caracter = args[1].charAt(0);
        String [] listaCaracteres = new String[3];
        listaCaracteres [0] = "a";
        listaCaracteres [1] = "b";
        listaCaracteres [2] = "c";
//        int numLetras = tal.cuentaLetra(args[0],caracter);
//        System.out.println("El caracter "+caracter+" aparece "+numLetras+" veces");
        tal.lanzaHilos(listaCaracteres, "a"+".txt");
        
    }
    
}
