public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5; 
        int j = i + 5;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        i+=2; // i = i + 2
        System.out.println("i = " + i);
        
        j-= 4; // j=j-4
        System.out.println("j = " + j);
        
        String sqlString = "select + from cleinte as c"; //Uno string a un string ya creado
        sqlString += "where c.nombre = 'andres'";
        System.out.println("sqlString = " + sqlString);
    }
}
