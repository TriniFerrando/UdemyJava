public class PrimitivosFloat {

   static float varFlotante; // la tengo que declarar sctatic sino no la puedo usar dentro de la variable local 'public static...'

    public static void main(String[] args) {
        float realFloat =2.12e3f;  //2120f;
        System.out.println(
                "realFloat= " + realFloat);

        float realFloat1= 1.5e4f; //150000f
        System.out.println(
                "realFloat1= " + realFloat1);


        float realFloat2= 0.00000000015f ; // 1.5e-10f
        System.out.println(
                "realFloat2= " + realFloat2);

        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Max valor para el float a = " + Float.MAX_VALUE);
        System.out.println("Min valor para el float a = " + Float.MIN_VALUE);




        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);

        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Max valor para el double a = " + Double.MAX_VALUE);
        System.out.println("Min valor para el double a = " + Double.MIN_VALUE);



        //var varFlotante= 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
