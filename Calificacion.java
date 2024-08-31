package programas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Calificacion {
 public static void main(String[] args) {
        //declarar variables
   int calificacion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresa tu nota (0-20) : ");
        calificacion=lectura.nextInt();
        //Proceso de datos
        if (calificacion>=19){
            System.out.println("Calificacion es A");
        }else if (calificacion>=15){
            System.out.println("Calificacion es B");
        }else if (calificacion>=10){
            System.out.println("Calificacion es C");
        }else if (calificacion>=7){
            System.out.println("Calificacion es D");
                }
         }
    }
    

