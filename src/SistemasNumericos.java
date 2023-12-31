import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        //opcion1:
        //System.out.println("numeroDecimal = " + numeroDecimal);
        //System.out.println("numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        //Opcion2:
        String mensajeBinario = "numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);


        int numeroBinario = 0b1111110100;
        System.out.println("numeroBInario = " + numeroBinario + " es igual a " + Integer.toHexString(numeroBinario));

        String mensaje = "\n" + mensajeBinario;
        mensaje += "\n" +mensajeBinario + "es igual a " + Integer.toHexString(numeroBinario); // concatenamos la varibale mensaje. Le agregamos otro mensaje al que ya tenia
        JOptionPane.showConfirmDialog(null, mensaje);


    }
}
