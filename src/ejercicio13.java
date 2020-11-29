/*
 * Nombre del autor
 * Rodrigo Cruz Garrido 
 *
 * Información de la versión
 * v.1.0
 *
 * Fecha
 * 28 de noviembre de 2020
 * 
 * Copyright
 * GNU
*/

import java.util.Scanner;
import java.io.IOException;

public class ejercicio13 {
    public static void main(String[] args)  throws IOException {
		
        int n;

        Scanner eje13 = new Scanner (System.in);
        System.out.println("Introducir elementos a un arreglo y ordenarlos de forma inversa a como se ingresaron");

        System.out.println("Ingresa la cantidad de numeros los cuales deses visualizar"); 
        n = eje13.nextInt();

        int [] numero = new int [n];

        for (int i = 0; i<numero.length; i++){
            System.out.println("Favor de ingresar los numeros"); 
            numero[i] =  eje13.nextInt();
        }

        eje13.close();

        System.out.println("Los numeros en orden inverso son: "); 
        int n1=n-1;
        while(n1>=0){
            System.out.println("|" + numero[n1] + "|");
            n1--; 
        }
    }
}
