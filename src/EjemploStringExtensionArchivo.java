public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String trabalenguas= "trabalenguas"; // Se crea un objeto String llamado "trabalenguas" e inicializa con el valor "trabalenguas"
        //System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); // Se utiliza el método toCharArray() de la clase String para transformar el String en un arreglo de caracteres

        char[] arreglo = trabalenguas.toCharArray(); // Se almacena el arreglo de caracteres en la variable "arreglo"
        int largo = arreglo.length; // Se obtiene el tamaño del arreglo utilizando la propiedad length del arreglo
        System.out.println("largo = " + largo); // Se imprime el tamaño del arreglo en la consola

        for(int i = 0; i<largo; i++){ // Se utiliza un bucle for para recorrer cada elemento del arreglo
            System.out.println("arreglo = " + arreglo[i]); // Se imprime cada elemento del arreglo en la consola (porque hice println) si tengo print solo, lo hace todo en la misma linea
        }
    }
}