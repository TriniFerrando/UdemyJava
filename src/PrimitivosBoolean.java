public class PrimitivosBoolean {
    public static void main(String[] args) {
        //Opcion1
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        //Opcion2
        boolean datoLogico1 = Boolean.FALSE.booleanValue();
        System.out.println("datoLogico = " + datoLogico1);

    //Ambos son lo mismo.

        double d =98765.43e-3; //98.76543
        System.out.println("double = " + d);

        float f = 1.2345e2f; //123.45
        System.out.println("float = "+ f);

        datoLogico = d > f;
        System.out.println("El double es más grande que el float = " +datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
