package EjIntroJava;
public class Ej18 {
    public static void main(String[] args) {
        int filas, columnas;
        int[][] matriz;

        filas = 4;
        columnas = 4;
        matriz = new int[filas][columnas];
        
        cargarMatrizAleatoria(matriz);
        System.out.println("La matriz generada es: ");
        imprimirMatriz(matriz);
        System.out.println("La traspuesta de la matriz generada es: ");
        imprimirTraspuesta(matriz);
    }


    public static void cargarMatrizAleatoria(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 1000 + 1);
            }
        }
    }


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

    //Imprimir traspuesta
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
}



/*Realizar un programa que rellene una matriz de 4x4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */