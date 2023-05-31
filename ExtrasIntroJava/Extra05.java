import java.util.Scanner;

public class Extra05 {
    public static void main(String[] args) {
        String claseSocio="";
        double cost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el costo bruto del tratamiento: ");
        cost = scan.nextDouble();
        scan.nextLine(); //Para capturar el enter del scanner anterior.

        System.out.println("Ingrese la categoría de socio (A, B o C)");
        claseSocio = scan.nextLine().toUpperCase();
        //Valido que la categoría sea A,B o C.
        leerCategoria(claseSocio);


        System.out.println("El monto total a abonar por ser de la categoría ingresada es: " + costoNeto(claseSocio,cost));
        scan.close();
    }

    //Para validar que la categoría ingresada sea correcta.
    public static void leerCategoria(String cat) {
        Scanner scan = new Scanner(System.in);
        while (!(cat.equalsIgnoreCase("A")|| cat.equalsIgnoreCase("B") || cat.equalsIgnoreCase("C"))) {
            System.out.println("Categoría inexistente. Ingrese una categoría válida (A,B o C)");
            cat = scan.nextLine();
        }
        scan.close();
    }

    //Calcula el monto neto a abonar dependiendo la categoría del socio.
    public static double costoNeto(String cat, double monto) {
        switch (cat) {
            case "A": return monto*0.5;
            case "B": return monto*0.65;
            default: return monto;
        }
    }
}

/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */