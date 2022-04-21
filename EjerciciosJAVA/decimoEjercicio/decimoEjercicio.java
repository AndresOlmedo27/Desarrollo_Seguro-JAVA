/**
 * Ejercicio 10
 * Escribir un programa que almacene los números de 0 a 35 en una lista, elimine
 * de la lista los números que ocupen posiciones múltiplos de 3, y muestre por
 * pantalla la lista resultante.
 */

public class decimoEjercicio {
    public static void main(String args[]) {

        int[] intArray = new int[36];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            int prueba = intArray[i] % 3; // eliminar del array los múltiplos de 3 = 3, 6, 9, 12, 15, 18, 21, 24, 27,
                                          // 30, 33
            if (prueba != 0) {
                System.out.println(intArray[i]);
            }

        }
    }
}
