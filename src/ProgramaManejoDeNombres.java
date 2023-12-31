public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String nombre1 = "Andres";
        char [] nombre1Array = nombre1.toCharArray();

        String nombre2 = "Maria";
        char [] nombre2Array = nombre2.toCharArray();

        String nombre3 = "Pepe";
        char [] nombre3Array = nombre3.toCharArray();

        for(int i=0; i<1 ; i ++ ){
            System.out.print( Character.toUpperCase(nombre1Array[1]) + "\\." + nombre1Array[4] + nombre1Array[5]);
            System.out.print( "_" + Character.toUpperCase(nombre2Array[1]) + "\\." + nombre2Array[3] + nombre2Array[4]);
            System.out.print( "_" + Character.toUpperCase(nombre3Array[1]) + "\\." + nombre3Array[2] + nombre3Array[3]);

        }

    }
}


/*
CODIGO DEL PROFESOR
mport java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}

 */