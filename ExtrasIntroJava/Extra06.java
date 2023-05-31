import java.util.Scanner;

public class Extra06 {
    public static void main(String[] args) {
        double estatura, shortSum = 0, sum = 0;
        int cantTotal = 0, cantShort = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Ingrese una altura. Para finalizar la carga, ingrese 0.");
            estatura = scan.nextDouble();
            
            if (estatura > 0) { //Para no contar el 0 como una altura, ni tampoco contemplar alturas negativas.
                if (estatura < 1.60 && estatura > 0) { 
                    shortSum += estatura;
                    cantShort++;
                }
                sum += estatura;
                cantTotal++;
            }
        } while (estatura != 0);

        System.out.println("La estatura promedio de las alturas por debajo de 1.60 es de: " + shortSum/cantShort);
        System.out.println("La altura promedio de todas las alturas ingresadas es de: " + sum/cantTotal);
        scan.close();
    }
}

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general. */