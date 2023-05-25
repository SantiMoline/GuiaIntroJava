import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte su nombre: ");
        name = scan.nextLine();
        System.out.println("Su nombre es: " + name);

        scan.close();
    }
}
