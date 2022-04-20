/**
 * Ejercicio 7
En una determinada empresa, sus productos son evaluados al final de cada año. 
Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, 
traduciéndose en mejores opiniones. Los puntos que pueden conseguir los productos pueden ser 0.0, 0.4, 0.6 o más, 
pero no valores intermedios entre las cifras mencionadas. A continuación, se muestra una tabla con los niveles
 correspondientes a cada puntuación. La cantidad de reputación conseguida en cada nivel es de 1.5 puntos multiplicada 
 por la puntuación del nivel.
Mal producto: 0.0 (1.5 x 0.0)
Aceptable: 0.4	(1.5x0.4)
Reseñable: 0.6 o más (1.5x0.6
Escribir un programa que lea la puntuación del producto e indique su nivel de evaluación, así como la reputación del producto.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class septimoEjercicio {
    public static void main (String args[]){

        /*String prueba[]= {"Hola", "Buenos días", "Buenas noches"};
        for (int i = 0; i<prueba.length; i++){
            System.out.println("Por favor, elige una opcion " + prueba[i]);
        }*/
        Scanner opt = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Mal producto");
            System.out.println("2. Aceptable");
            System.out.println("3. Reseñable");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Elige una de las opciones");
                opcion = opt.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Mal producto. \n Puntuación y reputación de 0.0 puntos.");
                        break;
                    case 2:
                        System.out.println("Aceptable. \n Puntuación de 0.4 puntos y reputación de 0.6 puntos.");
                        break;
                    case 3:
                        System.out.println("Reseñable. \n Puntuación de 0.6 puntos y reputación de 0.9 puntos");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce una de las puntuaciones disponibles.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                opt.next();
            }
        }
 
    }
 
}
