public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres triste tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int largo = frase.length();
        int maxPalabra=palabra.length();

        int cantidad=0;
        char letra = 't';

        buscar: //creo la etiqueta

        for (int i=0; i<largo ;i++){ //se recorre toda la frase
            int k = i;
            for(int j= 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Hay " + cantidad +" de letras " + letra + " en la palabra "+ palabra);


    }

}
