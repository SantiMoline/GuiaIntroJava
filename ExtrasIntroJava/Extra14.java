import java.util.Scanner;

public class Extra14 {
    public static void main(String[] args) {
        double avg;
        int edad, hijos=0, flias, sumEdad = 0, cantHijos = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de familias: ");
        flias = scan.nextInt();

        for (int i = 0; i < flias; i++) {
            System.out.println("Cuántos hijos tiene la familia " + (i+1));
            hijos = scan.nextInt();
            cantHijos += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1) + " de la familia " + (i+1));
                edad = scan.nextInt();
                sumEdad += edad;
            }
        }
        avg = (double)sumEdad / cantHijos;
        System.out.println("El promedio de edad de todos los hijos es de: " + avg);
        scan.close();
    }
}
/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba un programa que pida
la cantidad de familias y para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias. */