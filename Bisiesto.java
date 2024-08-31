package programas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Bisiesto {
    public static void main(String[] args) {
        //declarar variables
 String mensaje;
 int anio;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un año : ");
        anio=lectura.nextInt();
        //Proceso de datos
        if((anio%4==0 && anio%100 !=0) ||(anio%400==0)){
            mensaje=" es bisiesto";
        }else{
            mensaje=" no es bisiesto";
        }
         //Salida de Datos
         System.out.println("el año " + anio + mensaje);
        }
    }
 
