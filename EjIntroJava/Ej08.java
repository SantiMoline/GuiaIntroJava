package EjIntroJava;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        String frase;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Inserte una frase de longitud = 8");
            frase = scan.nextLine();
            if (frase.length() == 8) {
                System.out.println("CORRECTO!");
            } else {
                System.out.println("INCORRECTO!");
            }
        } while (frase.length() != 8);
        

        scan.close();
    }
}

/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java. */