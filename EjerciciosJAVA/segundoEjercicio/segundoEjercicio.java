import java.util.Scanner;

public class segundoEjercicio {
  public static void main(String arg[]) {

    String prefijo = "+34";
    int extension;
    int numTel;
    String regEx;
    Scanner inputTel = new Scanner(System.in);
    Scanner inputExt = new Scanner(System.in);

    System.out.println("Por favor, introduce tu número de teléfono: ");
    numTel = inputTel.nextInt();

    System.out.println("Gracias. Ahora introduce la extensión: ");
    extension = inputExt.nextInt();

    System.out.println("El número de teléfono completo sería " + prefijo + "-" + numTel + "-" + extension);
    System.out.println("Este es tu número de contacto: " + numTel);
    String n = String.valueOf(numTel);
    String arrayTel[] = { n };

    for (String cifra : arrayTel) {
      String fin = cifra.substring(0, 3);
      int casos = Integer.parseInt(fin);

      switch (casos) {
        case 911:case 912:case 913:case 914:case 915:case 916:case 917:case 918:

          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Madrid");
          break;

        case 856: case 858: case 950: case 951: case 952: case 953:
        case 954: case 955: case 956: case 957: case 958: case 959:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Andalucía");
          break;

        case 876: case 974: case 976: case 978:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Aragón");
          break;

        
        case 984: case 985:
          System.out.println("El prefijo "+fin+ " pertenece al Principado de Asturias");
          break;

        case 871:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de las Islas Baleares");
          break;

        case 822: case 828: case 922: case 928:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Canarias");
          break;

        case 942: 
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Cantabria");
          break;

        case 925: case 926: case 949: case 967: case 969: 
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Toledo");
          break;
          
        case 921: case 923: case 947: case 975: case 979:
        case 980: case 983: case 987: 
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Andalucía");
          break;

        case 872: case 873: case 877: case 931: case 932: case 933:
        case 934: case 935: case 936: case 937: case 972: case 973:
        case 977:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Cataluña");
          break;

        case 824: case 924: case 927:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Extremadura");
          break;

        case 881: case 886: case 981: case 982: case 986: case 988:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Galicia");
          break;

        case 941:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de La Rioja");
          break;

          case 968:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma de Murcia");
          break;

          case 848: case 948: 
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Foral de Navarra");
          break;

          case 945: case 943:  
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Autónoma del País Vasco");
          break;

          case 960: case 965: case 966:
          System.out.println("El prefijo "+fin+ " pertenece a la Comunidad Valenciana");
          break;

          default:
          System.err.println("El número introducido no corresponde con ninguno reconocido. Por favor, introduzca "+
          "uno válido");
          break;
           
      }

    }
      System.out.println("Gracias");
  }
}
