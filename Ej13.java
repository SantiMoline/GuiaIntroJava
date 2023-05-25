import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int lado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el tamaño del lado del cuadrado a dibujar: ");
        lado = scan.nextInt();
        dibujarCuadrado(lado);

        scan.close();
    }

    public static void dibujarCuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || j == 0 || j == lado - 1 || i == lado - 1) {
                    System.out.print(" * "); //Imprime " * " sin saltar de linea cuando se cumple la condición de estar en el contorno.
                } else {
                    System.out.print("   "); //imprimo los espacios dentro del cuadrado sin saltar de linea.
                }
            }
            System.out.println(""); //println para saltar a la siguiente fila.
        }
    }
}


/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos
por lado se deberá dibujar lo siguiente: */