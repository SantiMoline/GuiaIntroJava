import java.util.Scanner;

public class Extra11 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique un número entero: ");
        num = scan.nextInt();

        System.out.println("El número ingresado tiene " + calcularDigitos(num) + " dígitos.");
        scan.close();
    }

    //Función recursiva de cálculo de dígitos en un entero.
    public static int calcularDigitos(int n) {
        if (n < 10) {
            return 1;
        } else {
            n = n/10;
            return 1 + calcularDigitos(n);
        }
    }
}
