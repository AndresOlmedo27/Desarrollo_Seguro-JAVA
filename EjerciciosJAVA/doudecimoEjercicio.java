
/**
 * Ejercicio 12
 * Escribir un programa que reciba una cadena de caracteres y 
 * devuelva un diccionario con cada palabra que contiene y su frecuencia. 
 * Escribir otra función que reciba el diccionario generado con la función anterior y 
 * devuelva una tupla con la palabra más repetida y su frecuencia.
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class doudecimoEjercicio {

    public static void main(String args[]) {

        String cadena = "";
        String regEx = "[(\\d)(\\p{P}\\p{S})+]";
        boolean validar = false;
        Scanner inCadena = new Scanner(System.in);

        while (!validar) {
            try {

                System.out.println("Introduce una frase: ");
                cadena = inCadena.nextLine();
                Pattern patron = Pattern.compile(regEx);
                Matcher busqueda = patron.matcher(cadena);

                if (busqueda.find()) {

                    System.out.println("Introduce un formato válido.");
                } else {
                    System.out.println("Tu frase es " + "\"" + cadena + "\".\n");
                    String newCadena = cadena.replaceAll("[(\\.)(\\,)(\\;)]", " ");
                    String array[] = newCadena.split(" ");
                    HashMap<String, Integer> mapa = new HashMap<>();
                    for (String array2 : array) {
                        if (mapa.containsKey(array2)) {
                            mapa.put(array2, mapa.get(array2) + 1);
                        } else {
                            mapa.put(array2, 1);
                        }
                    }
                    for (HashMap.Entry<String, Integer> entrada : mapa.entrySet()) {
                        System.out.printf("La palabra \"%s\" tiene una frecuencia de \"%d\" veces\n ", entrada.getKey(),
                                entrada.getValue());
                        
                    }
                    validar = true;
                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");

            }
        }
    }
}
