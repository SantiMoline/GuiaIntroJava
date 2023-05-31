import java.util.Scanner;

public class Extra03 {
    public static void main(String[] args) {
        String letter;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        letter = scan.nextLine();
        while(letter.length()>1) {
            System.out.println("Demasiados caracteres, debe insertar sólo una letra.");
            letter = scan.nextLine();
        }

        if (esVocal(letter)) {
            System.out.println("La letra ingresada ES una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }
        scan.close();
    }

    public static boolean esVocal(String letra) {
        return (
        letra.equalsIgnoreCase("a") ||
        letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") ||
        letra.equalsIgnoreCase("o") ||
        letra.equalsIgnoreCase("u"));
    }
}

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */