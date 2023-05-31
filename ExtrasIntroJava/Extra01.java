import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
        int minutos;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos a convertir: ");
        minutos = scan.nextInt();

        //Agregué que muestre también los minutos sobrantes de la conversión.
        System.out.println("Los minutos ingresados equivalen a: " + calcularDias(minutos) + " días con " + calcularHoras(minutos) + " horas y " + minutos%60 + " minutos.");
        scan.close();
    }

    public static int calcularDias(int minutes) {
        return minutes /1440; //1440 = cant minutos en un día.
    }

    public static int calcularHoras(int minutes){
        return (minutes % 1440)/60; //El resto de dividir por 1440 son las horas que exceden a cada día entero.
    }
}
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */