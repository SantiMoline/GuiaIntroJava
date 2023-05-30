package EjIntroJava;
import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int[][] matriz;
        int filas, columnas;

        filas = 3;
        columnas = 3;
        matriz = new int[filas][columnas];

        System.out.println("Ingrese los valores deseados para cargar la matriz.");
        cargarMatriz(matriz);
        System.out.println("La matriz generada es la siguiente: ");
        imprimirMatriz(matriz);
        System.out.println("Su traspuesta es: ");
        imprimirTraspuesta(matriz);

        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz ES anti simétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }        
    }

    //Cargo la matriz manualmente para poder validar.
    public static void cargarMatriz(int[][] matriz) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Inserte los valores de la fila " + (i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }


    //Función traída del ej anterior.
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

    //Función traída del ej anterior. Imprime la traspuesta. 
    public static void imprimirTraspuesta(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - 1 ){
                    System.out.print(mat[j][i]); 
                } else {
                    System.out.print(mat[j][i] + " , ");
                }
            }
            System.out.println(" |");
        }
    }

    public static boolean esAntisimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false; //En cuanto se detecta una desigualdad corta la función y retorna falso.
                } 
            }
        }
        //Si nunca retorno false al recorrer toda la matriz, entonces es simétrica.
        return true;
    }
}

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando ésta
es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). */