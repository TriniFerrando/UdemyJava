/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date
y calcular la edad de la persona de acuerdo a la fecha actual.
Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
también se pueden apoyar de google que hay varios ejemplos
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticaCalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean formatoCorrecto = false;

        do {
            System.out.println("Ingrese su fecha de nacimiento: ");
            String nacimientoStr = scanner.next();

            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

            try {
                Date nacimiento = df.parse(nacimientoStr);
                Calendar nacimientoCalendar = Calendar.getInstance();
                nacimientoCalendar.setTime(nacimiento);

                Calendar hoyCalendar = Calendar.getInstance();

                int edad = hoyCalendar.get(Calendar.YEAR) - nacimientoCalendar.get(Calendar.YEAR);

                System.out.println("Esta persona tiene: " + edad);
                formatoCorrecto = true;

            } catch (ParseException e) {
                System.out.println("Error. Ingrese su fecha de nacimiento bajo este formato dd/mm/yyyy:");
            }
        } while (!formatoCorrecto);
    }
}
