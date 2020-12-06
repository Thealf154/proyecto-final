package proyecto;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicioOnce {
    private static Scanner entradas;
 
    public static void main(String[] args) {
        int[] numeros; // El arreglo de números naturales
        int númeroSolicitado; // El número que el usuario desea ingresar al arreglo
        int N; // La catidad de números en el arreglo de números
  
        System.out.println("El algoritmo permitira introducir un arreglo de n elementos y estos se mostrarn en un histograma de datos");
        System.out.println("Ingrese la catidad de números a ingresar");
        entradas = new Scanner(System.in);
        N = entradas.nextInt();
  
        numeros = new int[N];
  
        // Ingresar todos los números al array
        for (int i = 0; i < N; i++) {
            try {
                System.out.println("Ingresa el número entero");
                númeroSolicitado = entradas.nextInt();
  
                numeros[i] = númeroSolicitado;
            } catch (InputMismatchException e) {
                System.out.println("No ingresaste un número entero.");
                System.out.println("Inténtalo otra vez");
  
                // Se necesita limpiar el scanner porque seguirá dando excepciones, cuasando un
                // cliclo infinito.
                entradas.next();
                i--;
            }
        }
 
        //Imprimir el histograma
        for(int número : numeros){
            System.out.printf("\nImprimiendo el número: %d\n", número);
            for(int i = 1; i <= número; i++){
                System.out.print("*");
            }
        }
    }
 
 
}
