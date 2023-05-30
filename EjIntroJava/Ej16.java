package EjIntroJava;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int[] vector;
        int dimension, num, pos;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indique la dimension del vector a llenar con números aleatorios: ");
        dimension = scan.nextInt();
        vector = new int[dimension];
    
        cargarVectorAleatorio(vector); //LLena el vector de números aleatorios.
        System.out.println("Qué número desea saber si está en el vector? ");
        num = scan.nextInt();

        pos = numIndex(vector, num);
        if (pos == -1) {
            System.out.println("El número ingresado no se encuentra en el vector generado.");
        } else {
            System.out.println("El número ingresado se encuentra en la posición " + pos);
            if(estaRepetido(vector, num)) {
                System.out.println("El número se encuentra más de una vez en el vector generado.");
            } else {
                System.out.println("El número ingresado sólo se encuentra en la posición indicada anteriormente.");
            }
        }

        System.out.println("Para controlar, el vector se cargó con los siguientes valores: ");
        imprimirVector(vector);
        scan.close();
    }

    //Llena el vector con valores aleatorios del 0 al 100.
    public static void cargarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }
    }

    public static int numIndex(int[] vect, int n) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == n) {
                return i;
            }
        }
        //En caso de no encontrar la posición retorno un valor de control
        return -1;
    }

    public static boolean estaRepetido(int[] vect, int n) {
        int repeticiones = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == n) {
                repeticiones++;
            }
        }
        return repeticiones >= 2; //Devuelve true si apareció 2 o más veces.
    }

        //Imprime el vector.
        public static void imprimirVector(int[] vect) {
            System.out.print("(");
            for (int i = 0; i < vect.length; i++) {
                if (i == vect.length - 1) {
                    System.out.print(vect[i] + ")");
                } else {
                    System.out.print(vect[i] + ", ");
                }
            }
        }
}


/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector.
El programa mostrará donde se encuentra el numero y si se encuentra repetido */