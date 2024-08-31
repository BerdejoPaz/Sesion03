
package programas;

import java.util.Scanner;
public class TipoNumero {
    public static void main(String [] args){
        //declarar variables
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero");
        num=lectura.nextInt();
        //proceso de datos
        if (num>0) {
            mensaje="Numero Positivo";
        }else if (num<0){
            mensaje="Numero Negativo";
        }else{
            mensaje="Numero Neutro";
        }
        //salida de datos
        System.out.println(mensaje);
    }
    
}
