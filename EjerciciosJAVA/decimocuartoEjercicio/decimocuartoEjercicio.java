/*
Ejercicio 14
Escribir un programa que acceda a un fichero de internet mediante su url y
 muestre por pantalla el número de palabras que contiene.

*/ 

import java.io.BufferedReader;
import java.io.FileReader;

public class decimocuartoEjercicio {
    
    public String leerURL (String url){
        String lecturaFinal= ""; //especificar formato de entrada
       try {
           BufferedReader bf = new BufferedReader(new FileReader(url));
           
           String lectura= "";
           String texto = "";
           while((texto = bf.readLine()) != null){
               lectura = lectura + texto;  
           }
           lecturaFinal = lectura;




       } catch (Exception e) {
           System.out.println("Archivo no encontrado");
       }
       return lecturaFinal;
    }
}
