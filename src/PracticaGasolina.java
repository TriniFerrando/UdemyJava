/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y
mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente
Questions for this assignment
Cuál es el código de la tarea, publica la clase main
 */


import java.util.Scanner;

public class PracticaGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la medida actual del estanque: ");
        double medida = s.nextDouble();

        String mensaje = (medida == 70) ? "Estanque lleno" :
                (medida >= 60 && medida <= 70) ? "Estanque casi lleno" :
                        (medida >= 40 && medida <= 60) ? "Estanque  3/4" :
                                (medida >= 35 && medida <= 40) ? "Medio Estanque" :
                                        (medida >= 20 && medida <= 35) ? "Suficiente" :
                                                (medida >= 1 && medida <= 20) ? "Insuficiente" :
                                                        "Medida no valida";


        System.out.println(mensaje);
    }
}

/*
PROFESOR

import java.util.Scanner;

public class EstanqueGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacidadActual; // la capacidad a ingresar

        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }
    }
}

 */