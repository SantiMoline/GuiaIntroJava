import java.util.Scanner;

public class Extra24 {
    public static void main(String[] args) {
        int num;
        int[] sucesion;
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuántos números de la serie de Fibonnaci quiere calcular?");
        num = scan.nextInt();
        sucesion = new int[num]; 

        cargarVectorFibo(sucesion);
        imprimirVector(sucesion);
        scan.close();
    }

    //Calcula el valor del N número en la serie de Fibonnaci.
    public static int sucesionFibonacci(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return sucesionFibonacci(num-1) + sucesionFibonacci(num-2);
        }
    }

    //Carga el vector con todos los valores de la serie de fibonnaci que entren.
    public static void cargarVectorFibo(int[] vect) {
        for (int i = 1; i <= vect.length; i++) { //length vector = Nº series. Arranco de 1 e igualo a la longitud
            vect[i-1] = sucesionFibonacci(i); //Resto 1 para llenar el vector desde la primera posición y no exceder la última pos.
        }
    }

    //Mustra el vector.
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
/*Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n”
y que calcule la serie hasta llegar a ese valor.*/