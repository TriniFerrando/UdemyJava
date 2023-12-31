import javax.swing.*;
import java.util.Scanner;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i=5, j=4,suma= i + j ; //Misma linea cunado son del mismo tipo

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));


        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));//si os si entre parentesis.

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div= i/j;
        float div2= i/j;
        float div3 = (float) i/j;
        System.out.println("div_int = " + div);
        System.out.println("div2_float = " + div2);
        System.out.println("div3_float_i = " + div3);



        int resto= i %j ; //Sobrante(resto de una división)
        System.out.println("resto = " + resto);

        resto= 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        if(numero % 2 == 0){
            System.out.println("numero es par= " + numero);
        }else{
            System.out.println("numero es impar= " + numero);
        }

    }
}
