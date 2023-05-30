package EjIntroJava;
public class Ej15 {
    public static void main(String[] args) {
        int[] numvector;
        numvector = new int[100];

        cargarConEnteros(numvector);
        imprimirInverso(numvector);

    }

    //Llena el vector con los números enteros en orden ascendente. 
    public static void cargarConEnteros(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
    }

    //Imprime el vector desde atrás para adelante.
    public static void imprimirInverso(int[] vect) {
        System.out.print("(");
        for (int i = vect.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vect[i] + ")");
            } else {
                System.out.print(vect[i] + ", ");
            }
        }
    }
}

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente. */