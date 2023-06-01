import java.util.Scanner;

public class Extra10 {
    public static void main(String[] args) {
        int num1, num2, prod, guess;
        Scanner scan = new Scanner(System.in);
        num1 = (int) (Math.random()*11); //Random devuelve menor a 1, como máximo sale 10.999 que casteado a int es 10.
        num2 = (int) (Math.random()*11);
        prod = num2 * num1;

        do {
            System.out.println("Adivine el producto de los dos números generados aleatoriamente: ");
            guess = scan.nextInt();
            if(guess == prod) {
                System.out.println("Respuesta correcta! =D");
            } else {
                System.out.println("Respuesta incorrecta. Por favor intente nuevamente.");
                System.out.println("Para validar (shh) --> El producto de la multiplicación es: " + prod);
            }
        } while (guess != prod);
        scan.close();
    }
}
/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente
entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java. */