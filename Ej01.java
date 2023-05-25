import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte el primer número entero: ");
        num1 = scan.nextInt();

        System.out.println("Inserte el segundo número entero: ");
        num2 = scan.nextInt();

        System.out.println("La suma de los números ingresados es: " + (num1 + num2));


        scan.close();
    }
}


/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma */