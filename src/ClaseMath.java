import javax.imageio.ImageTranscoder;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

/*
Operaciones matemáticas
 */
public class ClaseMath {
    public static void main(String[] args) {
        //Calculamos el valor absoluto de -3 -->  valor absoluto de un número es su distancia respecto al cero en la recta numérica, sin tener en cuenta la dirección
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        //Calculamos el valor maximo
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);


        //Calculamos el valor minimo
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        //Redondeo hacia arriba (Ceil=techo)
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        //Redondeo hacia abajo (floor=piso)
        double piso= Math.floor(3.5);
        System.out.println("piso = " + piso);

        //Redondeo de forma automática en un numero entero.
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        //Exponencial--> e elevado a la algo
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        //Logaritmo
        double log= Math.log(10);
        System.out.println("log = " + log);
        
        //Potencia (Pow=potencia) base y exponente
        double potencial = Math.pow(10,3); //diez elevado a cubo
        System.out.println("potencial = " + potencial);

        //Raiz
        double raiz = Math.sqrt(5); // raiz de 5
        System.out.println("raiz = " + raiz);


       /* ----- TRIGONOMETRIA---------*/

        //de radianes a grados
        double grados = Math.toDegrees(1.57);
        System.out.println("De radianes a grados = " + grados);


        //de grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("de grados a radianes = " + radianes);


        //SENO
        System.out.println("sin(90): " + Math.sin(radianes));

        //COSENO
        System.out.println("cos(90): " + Math.cos(radianes));



        /* ----- RANDOM------ */

        //Generar un numero decimal random entre 0 y 1 (1 no se incluye)
        double random = Math.random();
        System.out.println("random 0-1 = " + random);


        //Generar un numero decimal random entre 0 y 7 (7 no se incluye)
        random *= 7;
        System.out.println("random 0-7 = " + random);


        // que el random lo redondee hacia abajo
        random = Math.floor(random);
        System.out.println("random piso = " + random);



        /*  -------- EJEMPLO DE RANDOM------*/
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double randomColores = Math.random();

        randomColores*= colores.length; //saber la cantidad de colores ingresados que se tiene
        System.out.println("Posicion del color random = " + randomColores);

        randomColores = Math.floor(randomColores);//hago que redonde para abajo porque tengo 5 colores y no 6
        System.out.println("Color = " + colores[(int) randomColores]); //imprime algun color al azar


        //ir a la carpeta Random Objeto que sigue


    }
}
