package programas;

import java.util.Scanner;
public class MayorEdad {
    public static void main(String[] args) {
        //declarar variables
        String mensaje;
        int edad;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Edad : ");
        edad=lectura.nextInt();
        //Proceso de datos
        if (edad>=18) {
            mensaje = "Mayor de edad";
         }else   {
            mensaje = "Menor de edad";
        }
        System.out.println("la persona es: " + mensaje);
            
        }
}
