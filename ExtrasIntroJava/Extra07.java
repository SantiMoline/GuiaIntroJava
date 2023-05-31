import java.util.Scanner;

public class Extra07 {
    public static void main(String[] args) {
        int num, total = 0, q, i=0, max=0, min=0;
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Indique la cantidad de números a ingresar: ");
        q = scan.nextInt();
        while (q < 1) {
            System.out.println("Cantidad incorrecta. Debe ingresar un entero mayor a 0.");
            q = scan.nextInt();
        }
        
        while (i < q) {
            System.out.println("Ingrese el siguiente número: ");
            num = scan.nextInt();
            if (i == 0 ) { //Inicializa min y max con los valores del primer número ingresado.
                min = num;
                max = num;
            }
            total += num;
            if(num > max) {
                max = num;
            } else if ( num < min) {
                min = num;
            }
            i++;
        }

        System.out.println("El mínimo valor introducido fue: " + min);
        System.out.println("El máximo valor introducido fue: " + max);
        System.out.println("El promedio de los valores ingresados es: " + (double)total/q);

        scan.close();
    }
}

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”. */