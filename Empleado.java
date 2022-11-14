import java.util.Random;
import java.util.Scanner;

public class Empleado{

    static String Nombre_Completo = "";
    static String Antiguedad = "";
    static String Resultado;
    static String Justificasion;
    static int Edad = 0,Tipo = 1, Tipo2 = 2, Tipo3 = 3, numero;

    
    public void Pago(){
        Random p = new Random();
        numero = p.nextInt(1500);
        System.out.println(numero);
    }

}