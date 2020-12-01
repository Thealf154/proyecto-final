import java.util.Scanner;

public class Menu {
    private static Scanner entradas;

    public static void main(String[] args) {
        int n;
        System.out.println("Ingrese el número de algoritmo que quiere"); 
        System.out.println("Algortimos disponibles: 5, 8, 11, 13, 14");
        entradas = new Scanner(System.in);
        n = entradas.nextInt();

        switch (n) {
            case 5:
                EjercicioCinco.main(args);
                break;
            case 8:
                EjercicioOcho.main(args);
                break;
            case 11:
                EjercicioOnce.main(args);
                break;
            case 13:
                EjercicioTrece.main(args);
                break;
            case 14:
                EjercicioCatorce.main(args);
                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }
}