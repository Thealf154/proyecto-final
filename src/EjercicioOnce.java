
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

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioOnce{
    private static Scanner entradas;
    public static void main(String[] args) {
        int[] numeros; //El arreglo de números naturales
        int númeroSolicitado; //El número que el usuario desea ingresar al arreglo
        int N; //La catidad de números en el arreglo de números

            System.out.println("Ingrese la catidad de números a ingresar");
            entradas = new Scanner(System.in);
            N = entradas.nextInt();

        numeros = new int[N];

        //Ingresar todos los números al array
        for(int i = 0; i < N; i++)
        {
            try
            {
                    System.out.println("Ingresa el número entero");
                    númeroSolicitado = entradas.nextInt();

                numeros[i] = númeroSolicitado;
            } catch (InputMismatchException e){
                    System.out.println("No ingresaste un número entero.");
                    System.out.println("Inténtalo otra vez");

                //Se necesita limpiar el scanner porque seguirá dando excepciones, cuasando un cliclo infinito.
                entradas.next();
                i--;
            }
        }

        //Dar todos los números en reversa
        System.out.println("\nEl arreglo en reversa:");
        for(int j = --N; j != -1; j--)
        {
            int númeroResultante = numeros[j];
            System.out.println(númeroResultante);
        }
    }
}