
package programas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        //declarar variables
        int n1,n2,n3,n4,mayor;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar primer numero : ");
        n1=lectura.nextInt();
        System.out.println("Ingresar segundor numero : ");
        n2=lectura.nextInt();
        System.out.println("Ingresar tercer numero : ");
        n3=lectura.nextInt();
        System.out.println("Ingresar cuarto numero : ");
        n4=lectura.nextInt();
           //Proceso de datos
           mayor=n1;
           if (n2>mayor){
               mayor=n2;
           }
           if (n3>mayor){
               mayor=n3;
           }
        if (n4>mayor){
               mayor=n4;
           }
        //Salida de datos
        System.out.println("El mayor de los cuatro números es: " + mayor);
    }
    
}
