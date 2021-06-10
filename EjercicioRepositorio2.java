//EjercicioRepositorio2
import java.util.Scanner;
public class EjercicioRepositorio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero entero");
        numero = entrada.nextInt();
        
        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }
 
    }
}