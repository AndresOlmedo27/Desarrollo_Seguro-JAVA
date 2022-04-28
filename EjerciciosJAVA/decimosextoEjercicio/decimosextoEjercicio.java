/*
Ejercicio 16
De una lista de números, obtener el enésimo mayor número.
Tanto el numero enesimo como la lista es introducida por usuario
. p.ej. de [1,2,9,8,7,6,5,4] el 4 mayor número es 6.
*/


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class decimosextoEjercicio {
    public static void main(String[] args) {
 
        Scanner inList = new Scanner (System.in);
        int enesimo = 0;
        Scanner inEnesimo = new Scanner (System.in);
       try{
        int lista [] = new int [5]; // probar con un Scanner para introducir tamaño manual
        for (int i = 0; i<lista.length; i++){
            System.out.println("Introduce un número para la posición " +i+ " del array: ");
            lista[i]= inList.nextInt();
        }

        System.out.println("CONTENIDO DEL ARRAY: ");
        for(int x = 0; x<lista.length; x++){
            System.out.println("Posición [" +x+"] = "+lista[x]);
        }

        System.out.println("Introduce el número a evaluar: ");
        enesimo = inEnesimo.nextInt();
   
        // longitud array
        int n = lista.length;
   
         //ordenar array de mayor a menor
        Arrays.sort(lista);
   
         System.out.println("El " +enesimo+ "º mayor número es: "+lista[n-enesimo]);

        }catch(InputMismatchException ex){
            System.out.println("Introduce números.");

        }

     }
    
    
}
