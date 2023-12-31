public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter= 'a';
        System.out.println("caracter = " + caracter);

        char caracter1= '\u0021';
        System.out.println("caracter1 = " + caracter1);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("son iguales carcater1 y decimal = " + (decimal == caracter1)); //operadores de comparacion. Si es igual true sino false

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("son iguales  decimal  y simbolo= " + (decimal == simbolo));

        char espacio = ' '; // es igual a char espacio = 'u0020'
        char retroceso = '\b';  // borra un carcater
        char tabulador = '\t'; // tabula (deja un espacio)
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("tipo byte corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Character.SIZE);
        System.out.println("valor máximo de un byte: " + Character.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Character.MIN_VALUE);


    }
}
