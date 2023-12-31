import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VariablesPorTecladoEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr = scanner.nextLine();

        int numeroIngresado = 0;
        try {
            numeroIngresado = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch(InputMismatchException e){
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroIngresado = " + numeroIngresado);
    }
}
