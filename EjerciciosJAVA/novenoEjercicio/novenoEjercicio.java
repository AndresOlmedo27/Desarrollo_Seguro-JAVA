/**
 * Ejercicio 9
Escribir un programa que muestre el eco de todo lo que el usuario
 introduzca hasta que el usuario escriba “BASTA!” que terminará.
 */

import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

public class novenoEjercicio {
    public static void main(String args[]) {
        String rep = "";
        boolean validar = false;
        Scanner entrada = new Scanner(System.in);

        while (!validar) {
            try {
                System.out.println("Introduce un comentario: ");
                rep = entrada.nextLine();
                System.out.println(rep);
                switch (rep) {
                    case "BASTA!":
                        validar = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error");
                entrada.next();
            }
        }
    }
}
