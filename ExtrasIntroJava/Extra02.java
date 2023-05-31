public class Extra02 {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4, aux;

        //Muestor las variables con los valores originales.
        imprimirVariables(a, b, c, d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        //Muestor las variables con los nuevos valores.
        imprimirVariables(a, b, c, d);
    }

    //Se genera la función para no tener que escribir este bloque antes de cambiar los valores y luego de dicha acción.
    public static void imprimirVariables(int a, int b, int c, int d) {
        System.out.println("Los valores finales son:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}


/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación,
realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D
y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */