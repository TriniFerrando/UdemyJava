public class ConversionDeTipos {
    public static void main(String[] args) {
        //Paso un string a un int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Paso un string a un double
        String realStr = "987654.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //Paso un string a un boolean
        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


        //Paso un int a String
            //Opcion 1:
        int otroNumero = 100;
        System.out.println("otroNumero = " + otroNumero);
        String otroNumeroStr = Integer.toString(otroNumero);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

            //Opcion 2:
        otroNumeroStr=String.valueOf(otroNumero + 10); //el value of convierte lo que determinemos a un string
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        //Paso un real a un string
        double otroRealDouble = 1.23456;
        String otroReal = Double.toString(otroRealDouble);
        System.out.println("otroReal = " + otroReal);

        //Paso de 32 (i) a 16 bits(s) (me va a marcar error pero lo vamos a forzar)
        int i = 32768;
        System.out.println("i = " + i);
        short s = (short)i; //fuerzo la conversión
        System.out.println("s = " + s);

        //Paso de 32 a 128(l)
        long l = i;
        System.out.println("l = " + l);

        //Paso de 32 a float
        float f = (float) i; //fuerzo la conversión
        System.out.println("f = " + f);


    }
}
