import java.util.Scanner;

public class Extra22 {
    public static void main(String[] args) {
        int[][] matriz;
        int filas, columnas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas que va a tener la matriz: ");
        filas = scan.nextInt();
        System.out.println("Ingrese la cantidad de columnas que va a tener la matriz: ");
        columnas = scan.nextInt();

        matriz = new int[filas][columnas];
        cargarMatrizAleatoria(matriz);
        imprimirMatriz(matriz);
        System.out.println("La suma de todos los elementos de la matriz es: " + sumarElementosMatriz(matriz));

        scan.close();
    }

    //Carga matriz con enteros aleatorios entre 0 y 100.
    public static void cargarMatrizAleatoria(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = (int) (Math.random() * 101);
            }
        }
    }

    //Suma todos los elementos de una matriz.
    public static int sumarElementosMatriz(int[][] mat) {
        int suma = 0;
        for (int[] fila : mat) {
            for (int element : fila) {
                suma +=element;
            }
        }
        return suma;
    }

    //Función traída del ejercicio 18 de la guía común.
    public static void imprimirMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - 1 ){
                    System.out.print(mat[i][j]); 
                } else {
                    System.out.print(mat[i][j] + " , ");
                }
            }
            System.out.println(" |");
        }
    }
}
/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos. */