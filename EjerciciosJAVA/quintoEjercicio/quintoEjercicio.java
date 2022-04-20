/**
 * Ejercicio 5
Escribir un programa que pida al usuario dos números enteros y 
muestre por pantalla la <n> entre <m> da un cociente <c> y un resto <r> donde <n> y <m> 
son los números introducidos por el usuario, y <c> y <r> son el cociente y el resto de la división entera respectivamente.
 */

import java.util.Scanner;

public class quintoEjercicio {
    public static void main (String args[]){
        int num1;
        int num2;
        int cociente;
        int resto;
        Scanner inNum1 = new Scanner (System.in);
        Scanner inNum2 = new Scanner (System.in);

        System.out.println("Introduce un número entero: ");
        num1 = inNum1.nextInt();
        System.out.println("Introduce otro número entero más: ");
        num2 = inNum2.nextInt();
        cociente = num1 / num2;
        System.out.println("El cociente resultante de dividir " + num1 + " entre " + num2 + " es: " + cociente);
        resto = num1 % num2;
        System.out.println("El resto resultante de dividir " + num1 + " entre " + num2 + " es: " + resto);
    }
}
