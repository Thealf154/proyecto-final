package proyecto;
import java.util.Scanner;
import java.util.InputMismatchException;
public class AlgortimoOcho {
    private static Scanner entradas;
 
    public static void main(String[] args) {
        double angúlo;
        double seno;

        System.out.println("Este algoritmo esta diseñado para obtener el  seno de un angulo.");
  
        try {
            System.out.println("Ingresa el ángulo que quieres");
            entradas = new Scanner(System.in);
            angúlo = entradas.nextDouble();
  
            if (360 < angúlo || angúlo < -360) {
                System.out.println("Ingrese un angúlo válido");
                main(args);
            }
            else{
                seno = Math.sin(Math.toRadians(angúlo));
                System.out.printf("\nEl seno es: %.2f", seno);
            }
  
        } catch (InputMismatchException e) {
                System.out.println("Ingrese un angúlo válido");
            main(args);
        }
  
    }
 
}
