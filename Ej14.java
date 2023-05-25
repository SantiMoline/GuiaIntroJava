import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        double euros;
        String moneda;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de euros a convertir: ");
        euros = scan.nextDouble();
        
        scan.nextLine(); //Para capturar el enter que queda del scan.nextdouble
        
        System.out.println("Indique a qué moneda desea hacer la conversión: ");
        moneda = scan.nextLine();
    
        convertirEuros(euros, moneda);

        scan.close();
    }


    public static void convertirEuros(double eu, String moneda) {
        System.out.println(eu + " euros equivalen a: ");
        switch (moneda.toLowerCase()) { //De esta forma compara independientemente si el usuario puso la moneda en mayusc o no.
            case "dolares":
            System.out.println(eu * 1.28611 + " Dólares");
            break;
            case "libras":
            System.out.println(eu * 0.86 + " Libras");
            break;
            case "yenes":
                System.out.println(eu * 129.852 + " Yenes");
                break;
            default:
                System.out.println("La moneda a la que se quiere convertir no se encuentra disponible.");
        }
    }
}


/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda
a converir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */