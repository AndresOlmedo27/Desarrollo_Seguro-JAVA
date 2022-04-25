/**
 * Ejercicio 9
Escribir un programa que muestre el eco de todo lo que el usuario
 introduzca hasta que el usuario escriba “BASTA!” que terminará.
 */

// MODIFICADO

import java.util.Scanner;
import java.lang.Exception;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class novenoEjercicio {
    public static void main(String args[]) {
        String rep = "";
        boolean validar = false;
        String regEx = "[(\\d)((\\p{Pd})(\\p{Ps})(\\p{Pe})(\\p{Pi})(\\p{Pf})(\\p{Pc})(\\/)(\\.)(\\;)(\\\"))(^\\s*)]+"; //con (^\\s*) no se admite ningún espacio asi que solo serán válidas palabras
        Scanner entrada = new Scanner(System.in);

        while (!validar) {
            try {
                System.out.println("Introduce un comentario: ");
                rep = entrada.nextLine();
                Pattern patron = Pattern.compile(regEx);
                Matcher busqueda = patron.matcher(rep);

                if (busqueda.find()){
                    System.out.println("Formato no admitido."); 
                    
                }
                else{
                    System.out.println(rep);
                switch (rep) {
                    case "BASTA!": 
                        validar = true;
                        break;
                }
                
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error");
            }
        }
    }
}
