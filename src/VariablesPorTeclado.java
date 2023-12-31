import javax.swing.*;

public class VariablesPorTeclado {
    public static void main(String[] args) {
        String numeroStr= JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        int numeroIngresado = 0;
        try {
            numeroIngresado = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroIngresado = " + numeroIngresado);
    }
}

// El tema esta que es para Strings entonces si yo lo quiero usar para un tipo de dato que es un número tengo que pasar
// la variable del string que declare a Int para que me lo tome como número.