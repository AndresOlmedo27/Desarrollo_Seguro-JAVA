
/**
 * Ejercicio 6
 * 
Una farmacia tiene mucho éxito en dos de sus productos: mascarillas y gel hidroalcohólico. 
Suele hacer venta por correo y la empresa de logística les cobra por peso de cada paquete así que deben
 calcular el peso de las mascarillas y geles que saldrán en cada paquete a demanda. Cada mascarilla pesa 112 g y
  cada gel 250 g. Escribir un programa que lea el número de mascarillas y geles vendidos en el último pedido y calcule 
  el peso total del paquete que será enviado.
 */

//  MODIFICADO

import java.util.InputMismatchException;
import java.util.Scanner;

public class sextoEjercicio {
    public static void main(String args[]) {

        int envio, mascarillas, gel, mascTotal, gelTotal;
        int pesoMasc = 112; // gramos
        int pesoGel = 250; // gramos
        Scanner inMasc = new Scanner(System.in);
        Scanner inGel = new Scanner(System.in);

        try {

            System.out.println("Introduce el número de mascarillas que desea pedir: ");
            mascarillas = inMasc.nextInt();

            System.out.println("Introduce el número de geles que desea pedir: ");
            gel = inGel.nextInt();

            if (mascarillas > 0 && gel > 0) {
                switch (mascarillas) {
                    case 0:
                        System.out.println("No has seleccionado ninguna mascarilla");
                        break;
                    case 1:
                        System.out.println("¡Perfecto! Has seleccionado una mascarilla");
                        break;
                    default:
                        System.out.println("¡Perfecto! Has seleccionado " + mascarillas + " mascarillas. ");
                        break;
                }
                switch (gel) {
                    case 0:
                        System.out.println("No has seleccionado ningun gel");
                        break;
                    case 1:
                        System.out.println("¡Genial! Has seleccionado un gel");
                        break;
                    default:
                        System.out.println("¡Genial! Has seleccionado " + gel + " geles. ");
                        break;
                }

                mascTotal = mascarillas * pesoMasc;
                gelTotal = gel * pesoGel;
                envio = mascTotal + gelTotal;

                System.out.println("El peso total del envio es de " + envio + " gramos.");
            } else {
                System.out.println("Los números deben ser mayores de 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Introduce números positivos.");
        }
    }
}
