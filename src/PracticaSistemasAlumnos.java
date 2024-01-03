/*
Sistema de notas de alumnos
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5,
promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

 */

import java.util.Scanner;

public class PracticaSistemasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota: ");
        double nota = scanner.nextDouble();
        double sum = nota;
        double sumUnos = nota;
        double sumMayoresCinco = nota;
        int cont1 = 0;
        double sumMenoresCuatro = nota;
        int cont2 = 0;

        while (nota != 0) {
            for (int i = 0; i < 19; i++) {
                if (nota >= 1 && nota <= 7) {
                    System.out.println("Ingrese la nota: ");
                    nota = scanner.nextDouble();
                    sum += nota;

                    if (nota == 1)
                        sumUnos += nota;

                    if (nota >= 5) {
                        sumMayoresCinco += nota;
                        cont1++;
                    }

                    if (nota < 4) {
                        sumMenoresCuatro += nota;
                        cont2++;
                    }
                }
            }

            System.out.println("Cantidad de notas ingresadas son: " + nota);
            System.out.println("El promedio de todas las notas: " + sum / 6);
            System.out.println("Notas con valor a 1: " + sumUnos);
            System.out.println("Promedio de las notas mayores a 5: " + sumMayoresCinco / cont1);
            System.out.println("Promedio de las notas menores a 4: " + sumMenoresCuatro / cont2);

        }
        System.out.println("Error.");
    }

}
