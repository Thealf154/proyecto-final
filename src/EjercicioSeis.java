/*
 * Nombre del autor
 * Alfredo Vanegas Arcega
 *
 * Información de la versión
 * v.1.0
 *
 * Fecha
 * 27 de noviembre de 2020
 * 
 * Copyright
 * GNU
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioSeis {
    private static Scanner entradas;

    public static void main(String[] args) {

        //Arreglos finales
        String[] aprobados; //Nombres de los estudiantes que aprobaron 
        String[] reprobados; //Nombres de los estudiantes que reprobaron
        int[] expedientes;
        int[] calificaciones;
        String[] nombres;
        String[] statusArray;

        //Variables para registrar los estudiantes
        int N;
        int expediente;
        int calificación;
        String nombre;
        String status;

            System.out.println("Ingresa el número de estudiantes:");
            entradas = new Scanner(System.in);
            N = entradas.nextInt();
        
        for(int i = 0; i < N; i++){
                System.out.println("Ingrese el nombre del alumno");
                nombre = entradas.next();
                System.out.println("Ingrese el expediente del alumno");
                expediente = entradas.nextInt();
                System.out.println("Ingrese la calificación del alumno");
                calificación = entradas.nextInt();
            
            status = (calificación > 6) ? "Aprobado ": "Reprobado";

            //Asignación de variables en arrays
        }
    }
}
