import java.util.Scanner;
public class Emp_Dos extends Empleado{
    static int Obligaciones;


    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    Emp_Tres Dos = new Emp_Tres();

    System.out.println("Ingresa tu nombre completo");
    Nombre_Completo = Entrada.nextLine();

    System.out.println("Ingresa Tu antiguedad en años");
    Antiguedad = Entrada.nextLine();

    System.out.println("en caso de no querer hacer ninguna actividad indique el motivo");
    Justificasion = Entrada.nextLine();

    System.out.println("Ingresa tu edad");
    Edad = Entrada.nextInt();

    System.out.println("Que haremos hoy: 1 = Vender Productos 2 = Descansar 3 = sentarse");

    Obligaciones = Entrada.nextInt();

    if (Obligaciones == 1) {
        System.out.println(" Vamos a Vender Productos: " + Nombre_Completo);
        System.out.println(" Eres un empleado tipo " + Tipo2);
        System.out.println("El pago Por tu actividad de hoy es: ");
        Dos.Pago();
    } else {
            if (Obligaciones == 2) {
                System.out.println(" Vamos a Descansar: " + Nombre_Completo);
                System.out.println(" Eres un empleado tipo " + Tipo2);
                System.out.println("Lo siento hoy no trabajaste ");
                
            }else{
                if (Obligaciones == 3) {
                    System.out.println(" Vamos a sentarse: " + Nombre_Completo);
                    System.out.println(" Eres un empleado tipo " + Tipo2);
                    System.out.println("Lo siento hoy no trabajaste ");
                    
                } else {
                    if (Obligaciones >= 5) {
                        System.out.println("no pude trabajar hoy por que: "+ Justificasion +" Mi nombre es: "+ Nombre_Completo);              
                    }
                }
            }
        }

    }
}
