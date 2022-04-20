import java.util.Scanner;

public class undecimoEjercicio {
   
double numero;
double porIVA;
double ivaTotal;
double precioTotal;
Scanner inNumero = new Scanner (System.in);
Scanner inIVA = new Scanner (System.in);


public void readNumber(){
    System.out.println("Introduce un valor para calcular el IVA: ");
    numero = inNumero.nextDouble();
    System.out.println("Introduce el porcentaje de IVA que desea calcular: ");
    porIVA = inIVA.nextDouble();
    if (porIVA==0){

    System.out.println("No has introducido ningún porcentaje para el valor " +numero+ ". Se le asigna automáticamente un 21%");
    numero=numero/100*21;

    }else{
    System.out.println("El valor que has introducido es: " +numero+ ", al que se le va a aplicar un porcentaje del " +porIVA+ "%.");
    }
    }
    public void calcularIVA(){

    double op = numero/100;
    ivaTotal= porIVA*op;
    precioTotal= ivaTotal + numero;
    System.out.println("El "+ porIVA+ "% de " +numero+ " es " +ivaTotal+" euros, así que el precio total de la factura es de " +precioTotal+" euros.");

    }
}