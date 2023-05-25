import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        int num; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte un número entero: ");
        num = scan.nextInt();

        if (esPar(num)) {
            System.out.println("El número ingresado es PAR.");
        } else {
            System.out.println("El número ingresado es IMPAR.");
        }

        scan.close();
    }

    public static boolean esPar(int num) {
    

        return num % 2 == 0;
    }
}


