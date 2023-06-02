import java.util.Scanner;

public class Extra18 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int dim;
        int[] vector;
        System.out.println("Indique la cantidad de elementos que tendrá el vector: ");
        dim = scan.nextInt();
        vector = new int[dim];
        
        cargarVector(vector);
        System.out.println("La suma de todos los valores ingresados en el vector es: " + sumarElementos(vector));
        scan.close();
    }



    public static void cargarVector(int[] vect) {
        System.out.println("Ingrese los números enteros a insertar en el vector.");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = scan.nextInt();
        }
    }

    public static int sumarElementos(int[] vect) {
        int suma = 0;
        for (int element : vect) {
            suma += element;
        }
        return suma;
    }
}

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario. */