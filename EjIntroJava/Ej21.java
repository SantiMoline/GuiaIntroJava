package EjIntroJava;
public class Ej21 {
    public static void main(String[] args) {
        //int[][] matrizM, matrizP;

        //matrizM = new int[10][10];
        //matrizP = new int[3][3];

        int[][] matrizM = { {1,26,36,47,5,6,72,81,95,10},
                            {11,12,13,21,41,22,67,20,10,61},
                            {56,78,87,90,9,90,17,12,87,67},
                            {41,87,24,56,97,74,87,42,64,35},
                            {32,76,79,1,36,5,67,96,12,11},
                            {99,13,54,88,89,90,75,12,41,76},
                            {67,78,87,45,14,22,26,42,56,78},
                            {98,45,34,23,32,56,74,16,19,18},
                            {24,67,97,46,87,13,67,89,93,24},
                            {21,68,78,98,90,67,12,41,65,12}};

        int[][] matrizP = { {36,5,67},
                            {89,90,75},
                            {14,22,26}};
        
        estaContenida(matrizM, matrizP);


    }


    public static boolean estaContenida(int[][] matM, int[][] matP) {
        for (int i = 0; i < matM.length - matP.length + 1; i++) {
            for (int j = 0; j < matM[0].length - matP[0].length + 1; j++) {
                if(matM[i][j] == matP[0][0]) {
                    if (barrido3x3(matM, i, j, matP)) {
                        System.out.println("La matriz P se encuentra contenida en la matriz M a partir de la fila " + (i+1) + " y la columna " + (j+1));
                        return true;
                    }
                }
            }
        }
        System.out.println("La matriz P no se encuentra contenida dentro de la matriz M");
        return false;
    }

    public static boolean barrido3x3(int[][] matM, int fila, int columna, int[][] matP) {
        for (int i = 0; i < matP.length; i++) {
            for (int j = 0; j < matP[0].length; j++) {
                if (matP[i][j] != matM[fila+i][columna+j]) {
                    return false;
                }
            }
        }
        //Si recorrió una matriz de 3x3 y no encontró diferencias entonces está contenida.
        return true;
    }
}

    
/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la matriz M.
Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
desplazándose por filas o columnas, existe al menos una que coincida con la matriz P. En ese caso,
el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer elemento de la submatriz P. */