public class SentenciaFor {
    public static void main(String[] args) {

        System.out.println("De 0 a 5:");
        for(int i=0; i<=5 ; i++){
            System.out.println("i= " + i);
        }

        System.out.println("De 10 a 0:");
        for(int i=10; i>=0 ; i--){
            System.out.println("i= " + i);
        }

        System.out.println("De 10 a 0, PARES:");
        for(int i=10; i>=0 ; i-=2){
            System.out.println("i= " + i);
        }

        System.out.println("De 0 a 5,IMPARES:");
        for(int i=1; i<=6 ; i+=2){
            System.out.println("i= " + i);
        }



    }
}
