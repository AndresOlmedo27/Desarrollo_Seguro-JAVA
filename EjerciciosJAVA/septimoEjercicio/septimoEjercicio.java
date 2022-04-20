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
