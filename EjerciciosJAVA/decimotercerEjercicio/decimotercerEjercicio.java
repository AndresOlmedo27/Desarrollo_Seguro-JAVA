import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ejercicio 13
Escribir una función que reciba una muestra de números y devuelva
 los valores atípicos, es decir, los valores cuya puntuación típica sea mayor que 3 o menor que -3. 
 Nota: La puntuación típica de un valor se obtiene restando la media
  y dividiendo por la desviación típica de la muestra.

*/

public class decimotercerEjercicio {

    public static void main(String args[]) {

        int numeros = 0;
        double media = 0;
        double varianza = 0;
        double desviacion = 0;
        double puntuacionTipica = 0;
        Scanner inNum = new Scanner(System.in);
        try {
            System.out.println("Introduce los números que desee calcular");
            numeros = inNum.nextInt();
            double[] arrayNum = new double[numeros];
            for (int i = 0; i < numeros; i++) {
                System.out.println("Introduce el número");
                arrayNum[i] = inNum.nextDouble();
            }
            // suma de todos los números del array
            double suma = 0;
            for (double j : arrayNum) {
                suma = suma + j;
            }
            // media del array
            media = suma / numeros;
            System.out.println("La media es: " + media);

            // restamos la media a los números del array y los elevamos a 2
            double sumar;
            for (int i = 0; i < numeros; i++) {
                sumar = Math.pow(arrayNum[i] - media, 2);
                varianza = varianza + sumar;
            }
            varianza = varianza / (numeros - 1);

            desviacion = Math.sqrt(varianza); // la desviación es la raiz cuadrada de la varianza
            System.out.println("La desviación es: " + desviacion);

            puntuacionTipica = (numeros - media) / desviacion;

            System.out.println("La puntuación típica es: " + puntuacionTipica);
        } catch (InputMismatchException ex) {
            System.out.println("Introduce un formato válido.");
        }

    }
}
