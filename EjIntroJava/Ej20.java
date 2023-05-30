package EjIntroJava;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        int[][] matriz;
        int filas;

        filas = 3; //Columnas = filas --> es una matriz cuadrada para representar el cuadrado mágico.

        matriz = new int[filas][filas];
        cargarMatrizConEnteros(matriz);
        System.out.println("La matriz cargada es la siguiente: ");
        imprimirMatriz(matriz); //Imprimo la matriz para poder validar.

        if (esMagica(matriz)) {
            System.out.println("El cubo es Mágico :D !!!");
        } else {
            System.out.println("El cubo NO es mágico :(");
        }        
    }

    //Permite la carga de la matriz con números enteros entre 1 y 9.
    public static void cargarMatrizConEnteros(int[][] mat) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese los enteros entre 1-9 a cargar en la matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scan.nextInt();

                while (mat[i][j] < 1 || mat[i][j] > 9) {
                    System.out.println("El valor ingresado es inválido. Debe estar entre 1 y 9.");
                    mat[i][j] = scan.nextInt();
                }
            }
        }
        scan.close();
    }
    
    //Suma el valor total de los elementos de fila que recibe como parámetro.
    public static int sumarFila(int[][] mat, int fila) {
        int suma=0;

        for(int elemento: mat[fila]) {
            suma += elemento;
        }
        return suma;
    }

    //Suma el valor de los elementos de la diagonal de una matriz.
    public static int sumarDiagonal(int[][] mat) {
        int suma = 0;
        for (int i = 0; i < mat.length; i++) {
                suma += mat[i][i];
        }
        return suma;
    }

    //Suma el valor de los elementos de la diagonal invertida de una matriz.
    public static int sumarDiagonalInvertida(int[][] mat) {
        int suma = 0;

        for (int i = 0; i < mat.length; i++) {
            suma+= mat[i][mat.length-1-i];
        }
        return suma;
    }

    //Suma el valor de los elementos de la columna que recibe como parámetro.
    public static int sumarColumna(int[][] mat, int columna) {
        int suma = 0;
        for (int i = 0; i < mat[0].length; i++) {
            suma += mat[i][columna];
        }
        return suma;
    }
    
    
    public static boolean esMagica(int[][] mat) {
        int sumaDiagonal = sumarDiagonal(mat);
        int sumaDiagonalInvertida = sumarDiagonalInvertida(mat);
        int sumaFila;
        int sumaColumna;

        //Primero valido que las diagonales sean iguales, sino ya devuelve false.
        if (sumaDiagonalInvertida == sumaDiagonal) {

            //Recorro cada fila y columna y comparo los valores entre ellos y con una diagonal. 
            //Si siempre son iguales a una diagonal es porque ya son iguales entre sí siempre.
            for (int i = 0; i < mat.length; i++) {
                sumaFila = sumarFila(mat, i);
                sumaColumna = sumarColumna(mat, i);

                if (sumaFila == sumaColumna && sumaFila == sumaDiagonal) {
                    continue; //Si son iguales, avanzo a la siguiente fila y columna y se vuelve a comparar esa suma con la diagonal.
                } else { //En cuanto una fila no suma lo mismo q una columna o la diagonal, corto la función y retorno false.
                    return false;
                }
            }
        } else {
            //Si las diagonales son distintas, no entra al bucle de filas y columnas y devuelve false directamente.
            return false;
        }
        //En caso de haber recorrido todas las filas y columnas y no haber retornado false, es porque es mágica.
        return true;
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
}

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9. */