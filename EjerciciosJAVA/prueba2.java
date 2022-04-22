import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prueba2 {

    public static void main(String arg[]) {

        String nombre;
        boolean validar = false;
        String apellido1;
        String apellido2;
        String regEx = "[(\\d)(\\p{P}\\p{S})(^\\s*)]+";
        Scanner name = new Scanner(System.in);
        Scanner surn1 = new Scanner(System.in);
        Scanner surn2 = new Scanner(System.in);

        while (!validar) {

            System.out.println("Por favor, introduce tu nombre: ");
            nombre = name.nextLine();
            Pattern patron = Pattern.compile(regEx);
            Matcher busqueda = patron.matcher(nombre);

            if (busqueda.find()) {
                System.out.println("Formato inválido");

            } else {
                System.out.println("Hola " + nombre + " :)");
                System.out.println("Este es tu nombre en minúsculas: " + nombre.toLowerCase());
                System.out.println("Este es tu nombre en mayúsculas: " + nombre.toUpperCase());
                System.out.println("Ahora se pondrá la primera letra de tu nombre en mayúscula: "
                        + nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase());
                validar = true;

            }
        }

        while (validar) {
            System.out.println("Por favor, introduce tu primer apellido: ");
            apellido1 = surn1.nextLine();
            Pattern patron2 = Pattern.compile(regEx);
            Matcher busqueda2 = patron2.matcher(apellido1);

            if (busqueda2.find()) {
                System.out.println("Formato inválido");

            } else {
                System.out.println("¡Genial! :)");
                System.out.println("Este es tu primer apellido en minúsculas: " + apellido1.toLowerCase());
                System.out.println("Este es tu primer apellido en mayúsculas: " + apellido1.toUpperCase());
                System.out.println("Ahora se pondrá la primera letra de tu primer apellido en mayúscula: "
                        + apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1).toLowerCase());
                validar = false;
            }
        }
        while (!validar) {

            System.out.println("Por favor, ahora introduce tu segundo apellido: ");
            apellido2 = surn2.nextLine();
            Pattern patron3 = Pattern.compile(regEx);
            Matcher busqueda3 = patron3.matcher(apellido2);

            if (busqueda3.find()) {
                System.out.println("Formato inválido");

            } else {
                System.out.println("Este es tu segundo apellido en minúsculas: " + apellido2.toLowerCase());
                System.out.println("Este es tu segundo apellido en mayúsculas: " + apellido2.toUpperCase());
                System.out.println("Ahora se pondrá la primera letra de tu segundo apellido en mayúscula: "
                        + apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1).toLowerCase());
                validar = true;
            }
        }

    }
}
