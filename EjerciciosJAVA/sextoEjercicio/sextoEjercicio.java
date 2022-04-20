import java.util.Scanner;

public class sextoEjercicio {
    public static void main(String args[]) {

        int envio, mascarillas, gel, mascTotal, gelTotal;
        int pesoMasc = 112; // gramos   
        int pesoGel = 250; // gramos
        Scanner inMasc = new Scanner (System.in);
        Scanner inGel = new Scanner (System.in);

        System.out.println("Introduce el número de mascarillas que desea pedir: ");
        mascarillas = inMasc.nextInt();
        switch(mascarillas){
            case 0:
            System.out.println("No ha seleccionado ninguna mascarilla");
            break;
            case 1:
            System.out.println("¡Perfecto! Ha seleccionado una mascarilla");
            break;
            default:
            System.out.println("¡Perfecto! Ha seleccionado " + mascarillas + " mascarillas. ");
            break;
        }

        System.out.println("Introduce el número de geles que desea pedir: ");
        gel = inGel.nextInt();
        switch(gel){
            case 0:
            System.out.println("No ha seleccionado ningun gel");
            break;
            case 1:
            System.out.println("¡Perfecto! Ha seleccionado un gel");
            break;
            default:
            System.out.println("¡Perfecto! Ha seleccionado " + gel + " geles. ");
            break;
        }

        mascTotal = mascarillas * pesoMasc;
        gelTotal = gel * pesoGel;
        envio= mascTotal + gelTotal;


        System.out.println("El peso total del envio es de " + envio + " gramos.");

    }
}
