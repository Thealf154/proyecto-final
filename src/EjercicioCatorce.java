import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCatorce {
    private static Scanner entradas;
    public static void main(String[] args) {
        double[] números;
        double mayor;
        double menor;
        double número;
        int N;
        int posiciónMenor = 0;
        int posiciónMayor = 0;

            System.out.println("Este algoritmo obtiene el número mayor y menor de un arreglo con la posición original del nmúmero");
            System.out.println("Ingrese la cantidad de números:");
            entradas = new Scanner(System.in);
        try{
            N = entradas.nextInt();
            números = new double[N];

            //Ingresar los números en el array
            for(int i = 0; i < N; i++){
                System.out.println("Ingrese sú número");
                número = entradas.nextDouble();
                números[i] = número;
            }

            //Obtener el número mayor y menor, y su posición original
            mayor = números[1];
            menor = números[1];
            for(int i = 0; i < N; i++){
                if (números[i] > mayor) {
                    posiciónMayor = i;
                    mayor = números[i];
                }
                if (números[i] < menor){
                    posiciónMenor = i;
                    menor = números[i];
                }
            }

            //Imprimir los números
            System.out.println("El número mayor es: " + mayor + " | Posición: " + posiciónMayor);
            System.out.println("El número menor es: " + menor + " | Posición: " + posiciónMenor);

        } catch(InputMismatchException e) {
            System.out.println("Ingrese un número válido");
            main(args);
        }
    }
}
