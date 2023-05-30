package EjIntroJava;
import java.util.Random;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int[] vector;
        int dimension;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indique la dimensión del vector: ");
        dimension = scan.nextInt();
        vector = new int[dimension];
        
        cargarVectorAleatorio(vector);
        System.out.println("El vector generado es el siguiente: ");
        imprimirVector(vector);

        for (int i = 1; i <= 5; i++) {
            System.out.println("La cantidad de números de " + i + " dígitos en el vector es: " + contarNumeros(vector, i));
        }

        scan.close();
    }

    //Función traida del ej16.
    public static void cargarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            //vector[i] = (int) (Math.random() * 10000 + 1);
            Random rand = new Random();
            vector [i] = rand.nextInt(1,99999);
        }
    }

    
    public static int contarNumeros(int[] vect, int digits) {
        int contador = 0, piso, techo;

        piso = (int) Math.pow(10, digits - 1);
        techo = (int) Math.pow(10, digits);
        for (int i = 0; i < vect.length; i++) {
            
            if (vect[i] > piso && vect[i] < techo) {
                contador++;
            }
        }
        return contador;
    }

    //Imprime el vector.
    public static void imprimirVector(int[] vect) {
        System.out.print("(");
        for (int i = 0; i < vect.length; i++) {
            if (i == vect.length - 1) {
                System.out.println(vect[i] + ")");
            } else {
                System.out.print(vect[i] + ", ");
            }
        }
    }
}

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etc. (hasta 5 dígitos). */

