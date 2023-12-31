

/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane
        y método showInputDialog().
        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
        (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al
        nombre de la persona.
        Restricción no usar loops en el desarrollo de la tarea.
        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
        Questions for this assignment
        Cuál es el código fuente de tu solución
*/
import javax.swing.*;
public class PracticaNombreTresPersonas {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre completo del primer miembro de la familia o amigo: ");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre completo del segundo miembro de la familia o amigo: ");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre completo del tercer miembro de la familia o amigo: ");


        // busco el largo de string
        int largo1 = nombre1.length();
        int largo2 = nombre2.length();
        int largo3 = nombre3.length();

        int max= 0;
        String nombreMasLargo= "";

        if(max < largo1){
            max=largo1;
            nombreMasLargo = nombre1;
        }

        if(max < largo2){
            max=largo2;
            nombreMasLargo = nombre2;
        }

        if(max < largo3){
            max=largo3;
            nombreMasLargo = nombre3;
        }


        System.out.println("El nombre completo más largo es: " + nombreMasLargo);
    }
}




/*
PROFESOR
import javax.swing.JOptionPane;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }
}
 */




