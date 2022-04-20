import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class primerEjercicio {

    public static void main(String arg[]) {

        String nombre;
        String apellido1;
        String apellido2;
        String regEx= "[(\\d)(\\p{P}\\p{S})]+";

        Scanner name = new Scanner(System.in);
        Scanner surn1 = new Scanner(System.in);
        Scanner surn2 = new Scanner(System.in);

        System.out.println("¡Bienvenid@! Por favor, introduce tu nombre:");
        nombre = name.nextLine();
        /*
         * He buscado información para crear expresiones regulares y "obligar" al
         * usuario a introducir
         * SOLO caracteres. He encontrado las clases "Pattern y Matcher" para ello.
         */
        /*
         * Creamos un "obejeto" Pattern llamado patron, el cual nos va a permitir crear
         * la expresión
         * regular gracias al método "Pattern.compile()" el cual recibe por parámetro la
         * restricción
         */
        Pattern patron = Pattern.compile(regEx); // \\d es esquivalente a [0-9]"
        /*
         * Creamos un "objeto" Matcher el cual nos va a permitir buscar en el parámetro
         * que le pasemos, la
         * restricción creada en el objeto Pattern
         */
        Matcher busqueda = patron.matcher(nombre);
        /* Con el método find() realizamos la búsqueda */
        if (busqueda.find()) { //mirar la lógica de estás regEx bien, no me cuadra
            System.out.println("Por favor, introduce un formato válido (SOLO CARACTERES)");
        } else {

            System.out.println("Genial " + nombre + ". Ahora por favor introduce tu primer apellido:");
        }
        

        apellido1 = surn1.nextLine();
        Pattern patron2 = Pattern.compile(regEx);
        Matcher busqueda2 = patron2.matcher(apellido1);

        if (busqueda2.find()) {
            System.out.println("Por favor, introduce un formato válido (SOLO CARACTERES)");
        } else {
            System.out.println("Y el segundo apellido:");
        }

        apellido2 = surn2.nextLine();

        Pattern patron3 = Pattern.compile(regEx);
        Matcher busqueda3 = patron3.matcher(apellido2);

        if (busqueda3.find()) {
            System.out.println("Por favor, introduce un formato válido (sólo caracteres)");
        } else {
            System.out.println("Muchas gracias " + nombre + "\u0020" + apellido1 + "\u0020" + apellido2 + " :D");
        }

        /*
         * investigando en encontrado la cadena "\u0020" para crear espacios en blanco.
         * Lo hago así porque a la hora de imprimir el nombre y apellidos me aparecía
         * todo junto y concatenando comillas
         * se quedaba igual
         */

        System.out.println("Este es tu nombre y apellidos TODO en minúsculas: " + nombre.toLowerCase() + "\u0020"
                + apellido1.toLowerCase() + "\u0020" + apellido2.toLowerCase());
        System.out.println("Este es tu nombre y apellidos TODO en mayúsculas: " + nombre.toUpperCase() + "\u0020"
                + apellido1.toUpperCase() + "\u0020" + apellido2.toUpperCase());
        System.out.println("Ahora se pondrá la primera letra de cada palabra en mayúscula: "
                + nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase() +
                "\u0020" + apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1).toLowerCase() + "\u0020"
                + apellido2.substring(0, 1).toUpperCase() + apellido2.substring(1).toLowerCase());

        /*
         * El último método "System.out.println()" sé que se puede ahorra mucho más
         * código.
         * Me he informado del método substring() el cual no conocía y me ha ayudado
         * bastante aunque aumenta el tamaño de líneas
         */

        // System.out.println(apellido1.substring(0, 4));

    }

    /////////////////////////////////////////// HAY FALLO DE LÓGICA///////////////////////////////////////////
  

}