public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres triste tigres tragan trigo en un trigal";

        int largo = frase.length();
        int cantidad=0;
        char letra = 't';

        for (int i=0; i<largo ;i++){
            if(frase.charAt(i) != letra){
                continue;}
            cantidad++;
        }
        System.out.println("Hay " + cantidad +" de letras " + letra);

    }

}
