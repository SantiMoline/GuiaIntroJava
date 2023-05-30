package EjIntroJava;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int limit, num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo como límite: ");
        limit = scan.nextInt();

        do {
            System.out.println("Ingrese un número entero: ");
            num = scan.nextInt();
            limit -= num; //Voy restando del límite el número ingresado hasta llegar a 0.
        } while (limit > 0); 

        scan.close();
    }
}

/*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial. */