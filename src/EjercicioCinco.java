import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCinco {
    private static Scanner entradas;

    public static void main(String[] args) {
        int n;
        float EULER = 2.718f;
        ArrayList<float[]> coordenadas = new ArrayList<>();

        try {
            System.out.println("Implementación de función exponencial");
            System.out.println("Se dará las cordenadas de un rango de 0 hasta el número que escoga");
            System.out.println("Ingrese un número entero para limitar el rango");
            entradas = new Scanner(System.in);
            n = entradas.nextInt();

            //Ciclo para hacer el algoritmo
            for (int i = 0; i < n; i++) {
                float expresión = (float) Math.pow(EULER, i);                
                float [] coordenadasPunto = {i, expresión};
                coordenadas.add(coordenadasPunto);
            }

        } catch (InputMismatchException e) {
            System.out.println("Escogiste un número no entero, vuelve a escoger");
            System.out.println("Reiniciando el programa...");
            main(args);
        }

        for(int j = 0; j < coordenadas.size(); j++){
            float[] coordenadasActuales = coordenadas.get(j);
            System.out.println("[" + coordenadasActuales[0] + ", " + coordenadasActuales[1] + "]");
        }

    }
}
