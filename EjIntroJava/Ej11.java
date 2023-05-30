package EjIntroJava;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int num1, num2, var;
        String choice = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca el primer número entero positivo: ");
        num1 = scan.nextInt();
        System.out.println("Introduzca el segundo número entero positivo: ");
        num2 = scan.nextInt();


        do {
            mostrarMenu(); //Imprime el menú determinado por consola.
            var = scan.nextInt();
            scan.nextLine(); // Para capturar el enter que quedó del último scan.nextInt();
            
            switch (var) {
                case 1:
                    System.out.println("La suma de los números ingresados es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números ingresados es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación de los números ingresados es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división de los números ingresados es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa? (S/N)");
                    choice = scan.nextLine();
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (!choice.equalsIgnoreCase("S"));

        scan.close();
    }

    //Imprime el menú determinado.
    public static void mostrarMenu() {
        System.out.println("-----------------");
        System.out.println("MENÚ");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("-----------------");
        System.out.println("Elija opción: ");
    }
}

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar 4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */