public class Extra20 {
    public static void main(String[] args) {
        int[] vect = new int[10];

        cargarVectorAleatorio(vect);
        imprimirVector(vect);
    }

    public static void cargarVectorAleatorio(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 101);
        }
    }

    public static void imprimirVector(int[] vect) {
        System.out.print("(");
        for (int i = 0; i < vect.length; i++) {
            if (i == vect.length - 1) {
                System.out.print(vect[i]);
            } else {
                System.out.print(vect[i] + ", ");
            }
        }
        System.out.println(")");
    }
}

/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
*/