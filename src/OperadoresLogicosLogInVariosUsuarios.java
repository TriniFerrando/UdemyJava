import java.util.Scanner;

public class OperadoresLogicosLogInVariosUsuarios {
    public static void main(String[] args) {
        String username = "Trinidad";
        String password = "123456";

        String username2 = "Adriana";
        String password2 = "789456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String u = scanner.next();

        System.out.println("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if ( (username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p)) ) {
            esAutenticado = true;
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario = ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autentication");
        }

    }
}

