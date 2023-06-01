import java.util.Scanner;

public class Extra15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;
        double num1, num2, result;
        System.out.println("Ingrese dos números: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        imprimirMenu();
        do{
            opt = scan.nextInt();
        } while (opt < 1 || opt > 4);

        result = efectuarOperacion(opt, num1, num2);
        
        System.out.println("El resultado de al operación deseada es: " + result);
        scan.close();
    }



    public static void imprimirMenu() {
        System.out.println("Qué operación desea hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }

    private static double efectuarOperacion(int opt, double n1, double n2) {
        double result;
        switch (opt) {
            case 1: result = sumar(n1,n2); break;
            case 2: result = restar(n1,n2); break;
            case 3: result = multiplicar(n1, n2); break;
            case 4: result = dividir(n1, n2); break;
            default: result = 0;
        }
        return result;
    }

    public static double sumar(double a, double b) {
        return a+b;
    }
    
    public static double restar(double a, double b) {
        return a-b;
    }

    public static double multiplicar(double a, double b) {
        return a*b;
    }

    public static double dividir (double a, double b) {
        return ((double)a / b);
    }
}

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. */