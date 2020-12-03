import java.util.Scanner;
import java.util.InputMismatchException;

public class EjercicioOcho {
    private static Scanner entradas;

    public static void main(String[] args) {
        double angúlo;
        double seno;

        System.out.println("Se ingresa un angúlo para calcular su seno");
        try {
            System.out.println("Ingresa el angúlo quieres");
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