import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        double temp_celsius;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserte una temperatura en celsius: ");
        temp_celsius = scan.nextDouble();

        System.out.println("La temperatura convertida a Fahrenheit es: " + convertirFahrenheit(temp_celsius));
        scan.close();
    }
    
    
    public static double convertirFahrenheit(double celsius) {
        double temp;

        temp = 32 + (9 * celsius / 5);

        return temp;
    }
}

