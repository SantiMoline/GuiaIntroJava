package EjIntroJava;
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        String frase;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        frase = scan.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto.");
        }

        scan.close();
    }
}



/*Crear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java. */