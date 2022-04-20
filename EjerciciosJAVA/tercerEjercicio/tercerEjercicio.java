import java.util.Scanner;

public class tercerEjercicio {
    
    public static void main (String arg[]){

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
