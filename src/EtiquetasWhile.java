public class EtiquetasWhile {
    public static void main(String[] args) {

        int contador = 0;

        bucleWhile: // La etiqueta del bucle while
        while (contador < 10) {
            System.out.println("Contador: " + contador);

            // Supongamos que queremos saltar al final del bucle si contador es igual a 5
            if (contador == 5) {
                System.out.println("Contador es igual a 5, saltando al final del bucle");
                break bucleWhile; // Salta al final del bucle usando la etiqueta
            }

            contador++;
        }

        System.out.println("El bucle while ha finalizado");
    }
}
