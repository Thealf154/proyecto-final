/*
 * Nombre del autor
 * Alfredo Vanegas Arcega
 *
 * Información de la versión
 * v.1.0
 *
 * Fecha
 * 27 de noviembre de 2020
 * Copyright
 * GNU
*/

import java.util.Scanner;

public class EjercicioDiez {
    private static Scanner entradas;

    public static void main(String[] args) {
        int repeticiones;
        int númeroSolicitado;
        String letraResultante;

        String[] abecedario = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "u", "v", "w", "x", "y", "z" };

        System.out.println("Ingresa la cantidad de veces que quieres solicitar letras");
        entradas = new Scanner(System.in);
        repeticiones = entradas.nextInt();

        for (int i = 0; i < repeticiones; i++) {
            try {

                    System.out.println("Ingresa el número de letra (1, 27):");
                    númeroSolicitado = entradas.nextInt();

                letraResultante = abecedario[númeroSolicitado];
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
