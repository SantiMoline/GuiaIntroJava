import java.util.Scanner;

public class Extra08 {
    public static void main(String[] args) {
        int i=0, even = 0, notEven = 0, num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Ingrese el siguiente número entero: ");
            num = scan.nextInt();
            if (num>= 0) {
                if (num%5 == 0 ) { //No contemplo el número que corta la carga. Si quisiera contemplarlo esta condición va al final.
                    break;
                } else if (num % 2 == 0) {
                    even++;
                } else {
                    notEven++;
                }
                i++;
            }
        } while (true); //Se ejecuta siempre el bucle hasta que cumpla el condicional para el break interno;

        System.out.println("La cantidad de números ingresados que no eran múltiplos de 5 es: " + i);
        System.out.println("La cantidad de dichos números pares es: " + even);
        System.out.println("La cantidad de números impares es: " + notEven);        

        scan.close();
    }

}

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar
la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/