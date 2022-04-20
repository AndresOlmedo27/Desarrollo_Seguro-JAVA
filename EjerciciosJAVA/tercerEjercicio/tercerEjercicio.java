/**
 * Ejercicio 3
Escribir un programa que pregunte por consola por los animales de un zoo,
 separados por asteriscos, y muestre por pantalla cada uno de los animales en una línea distinta.
 */
import java.util.Scanner;

public class tercerEjercicio {
    
    public static void main (String arg[]){       /////// NO ESTÁ TERMINADO ////////

    String zoo;
    Scanner inZoo = new Scanner(System.in);

    System.out.println("Introduce los animales del zoo que quieras");
    zoo = inZoo.nextLine();
    
    String arrayZoo[]= {zoo};
    for (int i = 0; i<arrayZoo.length; i++){
      System.out.println(arrayZoo[i]);
    
    }
    
    }
}
