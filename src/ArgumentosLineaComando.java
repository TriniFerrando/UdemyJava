/*
Establecer los argumentos sino aparece la consola vacia.
 */

public class ArgumentosLineaComando {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos nro " + i + ": " + args[i]);
        }
    }
}
