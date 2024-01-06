/*
Pedir el radio de un círculo y calcular su área.
utilizar la formula:
area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
Recomiendo primero implementar la tarea en el IDE para probarla y
revisarla bien, luego publica tu código de la clase main por esta vía.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaCalcularElAreaDeUnCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio = 0;

        try {
        System.out.println("Ingrese el radio de un circulo: " );
        radio = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println( "Numero ingresado no es válido.");

        }

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área = "+ area);
    }
}
