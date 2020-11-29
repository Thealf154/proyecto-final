package proyecto;
import java.util.Scanner;
import java.io.IOException;
public class ejercicio13 {
    public static void main(String[] args)  throws IOException {
		
        Scanner eje13 = new Scanner (System.in);
        System.out.println("Introducir elementos a un arreglo y ordenarlos de forma inversa a como se ingresaron");

        int n;
        System.out.println("Ingresa la cantidad de numeros los cuales deses visualizar"); 
        n = eje13.nextInt();

        int [] numero = new int [n];
        for (int i = 0; i<numero.length; i++){
            System.out.println("Favor de ingresar los numeros"); 
            numero[i] =  eje13.nextInt();
        }
        System.out.println("Los numeros en orden inverso son: "); 
        int n1=n-1;
        while(n1>=0){
            System.out.println("|" + numero[n1] + "|");
            n1--; 
        }
    }
}
