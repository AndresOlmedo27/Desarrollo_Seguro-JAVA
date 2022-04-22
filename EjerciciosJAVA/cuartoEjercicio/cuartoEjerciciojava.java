
/**
 * Ejercicio 4
Escribir un programa que lea un entero positivo, n, introducido por el usuario y 
después muestre en pantalla la suma de todos los enteros desde 1 hasta n.
 */

//  MODIFICADO

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuartoEjerciciojava {
  public static void main(String arg[]) {

    int fin = 0;
    int numero;
    Scanner n = new Scanner(System.in);
    try {
      System.out.println("Por favor, introduce un número entero positivo");
      numero = n.nextInt();
      if (numero > 0) {
        for (int i = 1; i <= numero; i++) {

          System.out.println(fin + " + " + i);
          fin = fin + i;

        }
        System.out.println("El resultado final es: " + fin);
      } else {
        System.out.println("Por favor, el número debe ser mayor que 0");
      }
    } catch (InputMismatchException ex) {
      System.out.println("Introduce un número entero positivo");
    }
  }

}
