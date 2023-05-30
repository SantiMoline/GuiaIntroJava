package EjIntroJava;
import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        String frase;
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba una frase o palabra que comience con 'A': ");
        frase = scan.nextLine();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO");
        }

        scan.close();
    }
}

/*Escriba un programa que pida una frase o palabra y valide si
la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java. */