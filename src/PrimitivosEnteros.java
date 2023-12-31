
public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte= 127;
        System.out.println("numeroByte = " + numeroByte);
        //proporciona el tamaño en bytes de un tipo de datos byte (Byte.BYTES):
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("tipo byte corresponde en byte a " + Short.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un byte: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Short.MIN_VALUE);

        int numeroInt= 32767;
        System.out.println("numeroByte = " + numeroInt);
        System.out.println("tipo byte corresponde en byte a " +Integer.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Integer.MIN_VALUE);


        long numeroLong=2147483647; //2147483648 da error xq nos pasamos se tiene que poner asi 2147483648L
        System.out.println("numeroByte = " + numeroInt);
        System.out.println("tipo byte corresponde en byte a " +Integer.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Integer.MIN_VALUE);

        float numeroFloat=2147483648F;
        System.out.println("numeroByte = " + numeroFloat);
        System.out.println("tipo byte corresponde en byte a " +Float.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un byte: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Float.MIN_VALUE);

        var numeroVar = 127;



    }
}
