import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class decimocuartoPoo {

    public static void main(String args[]) {

        String regEx = "\\.[^txt]+"; // No funciona regEx
        decimocuartoEjercicio decEj = new decimocuartoEjercicio();

        String urlFinal = decEj.leerURL("C:\\Users\\afolmedo\\OneDrive - Indra\\Escritorio\\lecturaURL.txt");
        Pattern patron = Pattern.compile(regEx);
        Matcher busqueda = patron.matcher(urlFinal);

        if (busqueda.find()) {
            
            System.out.println("Introduce un formato válido");
        } else{

            System.out.println(urlFinal);
        }

    }

}
