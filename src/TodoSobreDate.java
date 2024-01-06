import java.text.SimpleDateFormat;
import java.util.Date; //importa la biblio de Date

public class TodoSobreDate {
    public static void main(String[] args) {
        Date fecha = new Date();  //Declaro el formato Date.
        System.out.println("fecha = " + fecha); //La muestro: 'Sat Jan 06 12:31:48 ART 2024'

        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
   

}
