import java.util.Scanner;

public class SentenciaForArregloIngresoPorTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre:");
        int largo= scanner.nextInt();

        String[] nombres = new String[largo];


        for(int i=0; i<= largo; i++){
            System.out.println("Ingrese un nombre:");
            nombres[i] = scanner.next();
        }
        System.out.println("Nombres ingresados: = " + nombres);

    }
}
