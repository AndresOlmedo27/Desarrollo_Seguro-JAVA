/*Escribir una función que calcule el total de una factura tras aplicarle el IVA. 
La función debe recibir la cantidad sin IVA y el porcentaje de IVA a aplicar, y devolver el total de la factura.
 Si se invoca la función sin pasarle el porcentaje de IVA, deberá aplicar un 21% */

//  MODIFICADO

import java.text.DecimalFormat; // permite limitar el número de decimales
import java.util.InputMismatchException;
import java.util.Scanner;

public class undecimoEjercicio {

    double numero;
    double porIVA;
    double ivaTotal;
    double precioTotal;
    boolean validar = false;
    Scanner inNumero = new Scanner(System.in);
    Scanner inIVA = new Scanner(System.in);

    public void readNumber() {

        while (!validar) {

            try {

                System.out.println("Introduce un valor para calcular el IVA: ");
                numero = inNumero.nextDouble();
                if (numero < 0) {

                    System.out.println("El número debe ser mayor de 0.");
                    break;

                }

                System.out.println("Introduce el porcentaje de IVA que desea calcular: ");
                porIVA = inIVA.nextDouble();

                if (porIVA == 0) {

                    System.out.println("No has introducido ningún porcentaje para el valor " + numero
                            + ". Se le asigna automáticamente un 21%.");
                    numero = numero / 100 * 21;

                }
                if (porIVA < 0) {
                    System.out.println("El porcentaje debe ser mayor que 0.");

                } else {
                    System.out.println("El valor que has introducido es: " + numero
                            + ", al que se le va a aplicar un porcentaje del " + porIVA + "%.");
                    validar = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo números.");
                break;
            
            }
        }
    }

    public void calcularIVA() {

        while(validar){

       
        try {

            if (numero < 0 && porIVA < 0) {
                System.out.println("No se puede calcular.");
                break;

            } else {

                double op = numero / 100;
                ivaTotal = porIVA * op;
                precioTotal = ivaTotal + numero;
                DecimalFormat df = new DecimalFormat("#.00");

                System.out.println("El " + porIVA + "% de " + numero + " es " + df.format(ivaTotal)
                        + " euros, así que el precio total de la factura es de " + df.format(precioTotal) + " euros.");
                validar=false;
                    }

        } catch (InputMismatchException e) {
            System.out.println("Introduce sólo números.");
            
        }
    }
    }
}