import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pruebas {
    public static void main(String arg[]) {

        String nombre;
        String apellido1;
        String apellido2;
        String regEx = "[(\\d)(\\p{P}\\p{S})]+";

        Scanner name = new Scanner(System.in);
        Scanner surn1 = new Scanner(System.in);
        Scanner surn2 = new Scanner(System.in);

        System.out.println("¡Bienvenid@! Por favor, introduce tu nombre:");
        nombre = name.nextLine();

        Pattern patron = Pattern.compile(regEx);
        Matcher busqueda = patron.matcher(nombre);

        while (!busqueda.find()){
            try {

                System.out.println("Primer apellido:");
                }

            catch (Exception e) {
        
                System.out.println("Por favor, introduce un formato válido (SOLO CARACTERES)");
                name.next();
            }
    }

        // saber tipo variable ---- System.out.println(
        // ((Object)busqueda).getClass().getSimpleName() );
/*
        apellido1 = surn1.nextLine();
        Pattern patron2 = Pattern.compile(regEx);
        Matcher busqueda2 = patron2.matcher(apellido1);

        while (!busqueda2.find()){
            try {

                System.out.println("Y el segundo apellido:");
                }

            catch (Exception e) {
        
                System.out.println("Por favor, introduce un formato válido (SOLO CARACTERES)");
                surn1.next();
            }
    }
        apellido2 = surn2.nextLine();

        Pattern patron3 = Pattern.compile(regEx);
        Matcher busqueda3 = patron3.matcher(apellido2);

        if (busqueda3.find()) {
            System.out.println("Por favor, introduce un formato válido (sólo caracteres)");
        } else {
            System.out.println("Muchas gracias " + nombre + "\u0020" + apellido1 + "\u0020" + apellido2 + " :D");
        }

        System.out.println("Este es tu nombre y apellidos TODO en minúsculas: " + nombre.toLowerCase() + "\u0020"
                + apellido1.toLowerCase() + "\u0020" + apellido2.toLowerCase());
        System.out.println("Este es tu nombre y apellidos TODO en mayúsculas: " + nombre.toUpperCase() + "\u0020"
                + apellido1.toUpperCase() + "\u0020" + apellido2.toUpperCase());
        System.out.println("Ahora se pondrá la primera letra de cada palabra en mayúscula: "
                + nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase() +
                "\u0020" + apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1).toLowerCase() + "\u0020"
                + apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1).toLowerCase());*/

    }
}
