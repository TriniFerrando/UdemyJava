public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Pre incremento --> ++ valor
        
        int i = 1;
        int j= ++i; // i=i+1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Incremento --> valor ++ ()
        i=2;
        System.out.println("inicial de i = " + i);
        j = i++ ;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //Pre Decremento
        i= 3;
        j= --i; // i=i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decremento
        i=4;
        j= i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);




    }
}
