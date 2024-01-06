import java.util.Random;

public class RandomConObjetos {
    public static void main(String[] args) {
        Random randomObj = new Random();
        
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        //quiero un rango desde 15 y 25
        int randomIntConRango = 15 + randomObj.nextInt(25- 15);
        System.out.println("randomIntConRango = " + randomIntConRango);



    }
}
