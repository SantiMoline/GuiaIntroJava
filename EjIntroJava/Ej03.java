package EjIntroJava;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        String frase;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte una frase: ");
        frase = scan.nextLine();

        System.out.print("La frase toda en mayúsculas es: ");
        System.out.println(frase.toUpperCase());
        System.out.print("La frase toda en minúsculas es: ");
        System.out.println(frase.toLowerCase());
        scan.close();

    }
}
