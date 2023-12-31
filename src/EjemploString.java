public class EjemploString {
    public static void main(String[] args) {
        String curso1 = "Progrmamcion Java";
        String curso2 = new String("Progrmamcion Java");

        //comparo si son el mismo objeto
        boolean esIgual = curso1 == curso2;
        System.out.println("esIgual = " + esIgual);

        // comparo el contenido
        esIgual = curso1.equals(curso2);
        System.out.println("esIgual = " + esIgual);
    
    
    
    
    }
}
