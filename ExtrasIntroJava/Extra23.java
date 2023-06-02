import java.util.Scanner;

public class Extra23 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        String[] palabras = new String[5];

        leerPalabras(palabras);
        cargarSopaDeLetras(matriz, palabras);
        rellenarSopa(matriz);
        imprimirMatriz(matriz);
        
        scan.close();
    }

    //Cargar vector con palabras
    public static void leerPalabras(String[] vector) {
        System.out.println("Inserte las palabras. Deben contener entre 3 y 5 caracteres.");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scan.nextLine();
            while (vector[i].length() > 5 || vector[i].length() < 3) {
                System.out.println("Longitud de palabra incorrecta. Debe contener entre 3 y 5 caracteres.");
                System.out.println("Inserte nuevamente una palabra: ");
                vector[i] = scan.nextLine();
            }
        }
    }

    public static void cargarSopaDeLetras(String[][] mat, String[] words) {
        int fila;
        int columna;
        for (String palabra : words) {

            do {
                fila = (int) (Math.random() * (mat.length)); //Genera una fila al azar.
                columna = (int) (Math.random() * (mat[0].length)); //Genera una columna al azar.
            } while(!(emptyEnough(mat, fila, columna, palabra.length()))); //Valida que haya espacio desde la coordinada generada.

            //Una vez que encontró fila y columna en la que entre la palabra, se asigna la palabra al espacio.
            insertarPalabra(mat, fila, columna, palabra);   
        }
    }

    //Valida si hay espacio libre suficiente en una fila para escribir una palabra.
    public static boolean emptyEnough(String[][] mat, int fila, int columna, int espacio) {
        if (columna + espacio >= mat[fila].length) { //Valida que desde la columna inicial al final de la fila entre el largo de la palabra.
            return false;
        }
        //Si hay suficientes columnas, avanza y se fija si están todas vacías.
        //El bucle corta cuando se checkeó todo el espacio suficiente. 
        //Se sabe que las columnas alcanzan porque se checkeó con el condicional previo.
        for (int j = 0; j < espacio; j++) { 
            if (mat[fila][columna + j] == null) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    //Inserta una palabra horizontalmente en una matriz.
    public static void insertarPalabra(String[][] mat, int f, int c, String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            mat[f][c+i] = palabra.substring(i, i+1);
        }   
    }

    public static void rellenarSopa(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == null) {
                    mat[i][j] = String.valueOf((int)(Math.random()*10)); //Genera un número random 0-9 y lo almacena como String en espacios en blanco.
                }
            }
        }
    }

    //Función traída del ejercicio 18 de la guía común.
    public static void imprimirMatriz(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - 1 ){
                    System.out.print(mat[i][j]); 
                } else {
                    System.out.print(mat[i][j] + "  ");
                }
            }
            System.out.println(" |");
        }
    }
}
/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
substring(), Length() y Math.random().*/