import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();

        switch (num){
            case 0:
                System.out.println(" EL numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("Ese numero no existe. Ingrese un nuevo numero");
                break;

        }



    }
}
