
package programas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) {
        //declarar variables
       int num;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero : ");
        num=lectura.nextInt();
        //Proceso de datos
           //x=0;
           if (num%2==0){
               System.out.println("El numero : " + num + " es par : ");
           }
          
    }
    
}
