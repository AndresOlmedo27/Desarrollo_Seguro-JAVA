/**
 * Ejercicio 8
Escribir un programa en el que se pregunte al usuario por una frase y 
una letra, y muestre por pantalla el número de veces que aparece la letra en la frase y 
el número total de caracteres de la frase sin espacios en blanco.
 */

import java.util.Scanner;
import java.lang.Exception;

public class octavoEjercicio {

    public static void main(String args[]) {

        int numCaracteres = 0;
        char prueba;
        String frase = "";
        char letra;
        Scanner fr = new Scanner(System.in);
        Scanner ltr = new Scanner(System.in);

        System.out.println("Introduzca una frase: "); // ¡Hola mundo!
        frase = fr.nextLine();
        try {
            System.out.println("Introduzca solo UNA letra"); // o
            letra = ltr.next().charAt(0);

            String frase2 = frase.replaceAll("\\s", ""); // ¡Holamundo!

            char[] newArray = frase2.toCharArray();

            for (int i = 0; i < newArray.length; i++) {
                System.out.println("Letra " + (i + 1) + ": " + newArray[i]);
            }

            System.out
                    .println("La frase " + "\"" + frase + "\"" + " tiene un total de: " + frase2.length() + " letras.");

            for (int i = 0; i < newArray.length; i++) {
                prueba = frase.charAt(i);
                if (prueba == letra) {
                    numCaracteres++;
                }

            }
            System.out.println("La letra " + "\"" + letra + "\"" + " aparece un total de " + numCaracteres + " veces.");

        } catch (Exception e) {
            System.out.println("Por favor, introduzca una sola letra.");
            ltr.next();

        }
    }
}
// mirar bien los bloques try-catch