import java.util.Scanner;

public class PracticaTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1= scanner.nextInt();

        System.out.println("Ingrese un segundo número: ");
        int num2= scanner.nextInt();


        int condi1 = (num1 > num2) ? num1 : num2; //me quedo con el grande
        int condi2 = (num1 < num2) ? num1 : num2; //me quedo con el chiquito

        System.out.println("Orden de mayor a menor: " + condi1 + " "+ condi2);
    }
}

/*
PROFESOR:
import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);

    }
}

 */
