/*
Calcular el numero menor de multiples valores
Calcular el numero menor de multiples valores
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
•	Calcular el menor número e imprimir el valor.
•	Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".

 */


import java.util.Scanner;

public class PracticaMultiplesValres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();

        int numMin= num;

        for (int i = 0; i < 9 ; i++){
            System.out.println("Ingrese un número: ");
            num= scanner.nextInt();

            if(num < numMin){
                numMin = num;
            }

        }
        System.out.println("Los números ingresados son: " + num);
        System.out.println("E menor numero ingresado es el " + numMin);

        if (numMin < 10){
            System.out.println("El número menor es menor que 10!");
        }else{
            System.out.println("El numero menor es igual o mayor que 10!");
        }

    }
}
