import java.util.Scanner;

public class LogInVariosUsuariosArreglos {
    public static void main(String[] args) {
        //String[] username = new String[2];
       // String[] password = new String[2];

       // username[0] = "Trinidad";
       // password[0] = "123456";

       // username[1] = "Adriana";
       // password[1] = "789456";

        // Otra forma mas eficiente de declarar las variables con arreglos es la siguiente:

        String[] username = {"Trinidad", "Adriana"};
        String[] password = {"123456", "789456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String u = scanner.next();

        System.out.println("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < username.length; i++){
            esAutenticado= (username[i].equals(u) && password[i].equals(p)) ? true : esAutenticado;
        }
      /*  for(int i = 0; i < username.length; i++){
        if (username[i].equals(u) && password[i].equals(p)) {
            esAutenticado = true;
            break; //salir del for
        }}*/

        String mensaje = esAutenticado ? "Bienvenido usuario".concat(u).concat("!") :
                "Username o contraseña incorrecto \nLo sentimos, requiere autenticación";
        System.out.println(mensaje);

      /*  if (esAutenticado) {
            System.out.println("Bienvenido usuario = ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autentication");
        }
        */

    }
}
