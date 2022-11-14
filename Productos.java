import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Productos extends Supermercado{
    static String nombre = "Producto: ";
    static int Tipo, Precio, Cantidad;


    public void tipo(){
        /*Start Tipo */
        int i = 0, cantidad = 20, rango = 20;
        int arreglo [] = new int [cantidad];

        arreglo[i] = (int)(Math.random()* rango);
        for ( i = 1; i < cantidad; i++) {

            arreglo[i]=(int)(Math.random()* rango );
            for (int j = 0;  j < i;  j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                    
                }
                
            }
            
        }
        for (int k = 0; k < cantidad; k++) {
        System.out.print( "Producto"+ nombre + +(k+1) + " Tipo.- " + arreglo[k] + "\n");      
        }  /*End Tipo */

    }


    public void precio(){
        int rangop1 = 300,rangop2 = 500;

         /*Aqui inicia el precio */

         for (int wi = 1; wi <= 20; wi++) {

            Precio = (int)(rangop1+(rangop2-rangop1+1)*Math.random());
            System.out.println("Precio: "+Precio);
            
        }/*End Precio */

    }


    public void cantidad(){
        int rangoc1 = 10, rangoc2 = 15;
        /*Start Cantidad */

        for (int qi = 1; qi <= 20; qi++) {

            Cantidad = (int)(rangoc1+(rangoc2-rangoc1+1)*Math.random());
            System.out.println("cantidad: "+Cantidad);
            
        }/*End Cantidad */

    }

    public Productomayor(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese los Productos");
        int Numeros = Entrada.nextInt();

        int NumeroMenor = 0;
        for (int i = 0; 1 < Numeros; i++) {
            System.out.println("Primera cifra"+(i+1));
            int tmp = new Scanner.nextInt();
            if (1 == 0) {
                NumeroMenor = tmp;
            } else {
                if (tmp < NumeroMenor) {
                    
                }
                
            }
            
        }

        System.out.println("El numero menor es: " + NumeroMenor);
    }

    public void Hora(){
        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);
    }

    public void Mayusculas(){
        String a = "", b = "";
        a = JOptionPane.showInputDialog(null, "Ingrese la palabra o frace" + b);
        b = a.toUpperCase();
        JOptionPane.showMessageDialog(null,"" + b);
    }

    public void Invertir(){
        String Palabra = "hola infotec";
 
        StringBuilder sb = new StringBuilder(Palabra.toUpperCase());
        System.out.println(sb.reverse());
     }

    public static void main(String[] args) {
    Productos p = new Productos();

   // p.tipo();
   // p.precio();
   // p.cantidad();
   // p.Hora();
   // p.Mayusculas();
   // p.Invertir();

       
       


        

       




        



       

    }
}
