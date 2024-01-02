
// While--> no entra !=  do while--> entra por lo menos una vez
public class WhileAndDoWhile {
    public static void main(String[] args) {

        int i =0;

        while(i<=5){
            System.out.println("i = " + i);
            i++;
        }


        boolean prueba = true;
        do{
            if(i==4){
            System.out.println("Se ejecuto por lo menos una vez");
            i++;}

        } while(prueba);


    }
}
