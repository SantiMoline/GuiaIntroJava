import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte un número entero: ");
        num = scan.nextInt();

        System.out.println("El doble de " + num + " es: " + num*2);
        System.out.println("El triple de " + num + " es: " + num*3);
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));

        scan.close();

    }
}
