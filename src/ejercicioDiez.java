package proyecto;
import java.util.Scanner;

public class ejercicioDiez {
    private static Scanner entradas;
 
    public static void main(String[] args) {
        int repeticiones;
        int númeroSolicitado;
        String letraResultante;

        String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n","ñ", "o", "p", "q",
        "r", "s","t", "u", "v", "w", "x", "y", "z" };

System.out.println("Ingresa la cantidad de veces que quieres solicitar letras");
entradas = new Scanner(System.in);
repeticiones = entradas.nextInt();

for (int i = 0; i < repeticiones; i++) {
    try {

            System.out.println("Ingresa el número de letra (1, 27):");
            númeroSolicitado = entradas.nextInt();

        letraResultante = abecedario[númeroSolicitado - 1];
        System.out.println("Letra asignada al número" + "(" + i + ")" + " es: " + letraResultante);
        System.out.println();
    } catch (IndexOutOfBoundsException e) {

        System.out.println("Ingresaste una número qué no está en el rango de 1 a 27");
        System.out.println("Ingresa un número válido");
        System.out.println();
        i--;
        
            }
        }
    }

}
