import java.util.Scanner;

public class Supermercado {

    public void PrecioMayor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese los Precios del catalogo");

        int cantidadNumero = scanner.nextInt();
        int numeroMenor = 0;
        int numeroMayor = 0;

        for (int hi = 0; hi < cantidadNumero; hi++ ) {
            System.out.println("Precio del producto: " + (1+hi)); 
            int tmp = scanner.nextInt(); 

            if (hi == 0) {
                numeroMenor = tmp;
                
            } else if (tmp < numeroMenor) {
                numeroMenor = tmp;
            }
            if (tmp > numeroMayor) {
                numeroMayor = tmp;
                
            }
        }
        
        System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("El numero Mayor es: " + numeroMayor);

    }  

    public void CantidadMayor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese las cantidades del catalogo");

        int cantidadNumero = scanner.nextInt();
        int numeroMenor = 0;
        int numeroMayor = 0;

        for (int hi = 0; hi < cantidadNumero; hi++ ) {
            System.out.println("Precio del producto: " + (1+hi)); 
            int tmp = scanner.nextInt(); 

            if (hi == 0) {
                numeroMenor = tmp;
                
            } else if (tmp < numeroMenor) {
                numeroMenor = tmp;
            }
            if (tmp > numeroMayor) {
                numeroMayor = tmp;
                
            }
        }
        
        System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("El numero Mayor es: " + numeroMayor);

    }

    public void Ptotal(){
        Scanner Entrada = new Scanner(System.in);
        int precio_total;

        System.out.println("Ingresa La cantidad de Stock del producto");
        precio_total = Entrada.nextInt();

        if (precio_total == 10) {
            System.out.println("El precio Total es $1,500");
            
        } else {if (precio_total == 11) {
            System.out.println("El precio total es $1,600 ");
            
        } else {if (precio_total == 12) {
            System.out.println("El precio total es $1,700");
            
        } else {if (precio_total == 13) {
            System.out.println("El precio total es $1,800");

        } else {if (precio_total == 14) {
            System.out.println("El precio total es $1,900");  

        } else {if (precio_total == 15) {
            System.out.println("El precio total es $2,000");
            
        }
            
        }
            
        }
            
        }
            
        }
            
        }
     }

   public static void main(String[] args) {

    Supermercado S = new Supermercado();

   // S.PrecioMayor();
   // S.CantidadMayor();
   //S.Ptotal();
    
   }

        
}
 
