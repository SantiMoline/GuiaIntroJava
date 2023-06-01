import java.util.Scanner;

public class Extra13 {
    public static void main(String[] args) {
        int altura;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Indique la altura de la escalera (debe ser un entero positivo)");
            altura = scan.nextInt();
        } while (altura < 0); //Forzar carga de números positivos.

        dibujarEscalera(altura);
        scan.close();
    }


    public static void dibujarEscalera(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); //Cambia de renglón.
        }
    }
}
/*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/