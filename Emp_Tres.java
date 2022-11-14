import java.util.Scanner;
public class Emp_Tres extends Empleado{
    

    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    Emp_Tres Tres = new Emp_Tres();

    System.out.println("Ingresa tu nombre completo");
    Nombre_Completo = Entrada.nextLine();

    System.out.println("Ingresa Tu antiguedad en años");
    Antiguedad = Entrada.nextLine();

    System.out.println("Ingresa tu edad");
    Edad = Entrada.nextInt();


    System.out.println("No puedes realizar actividades: " + Nombre_Completo);
    System.out.println("Eres un empleado tipo: " + Tipo3);
    }

}