import java.util.Scanner;

public class Extra16 {
    public static Scanner scan = new Scanner(System.in); 
    //Para utilizar scan en todas las funciones y que no tire error VS code por no cerrarlo.
    //De esta forma se declara la variable acá y se cierra al finalizar main, y no en cada función.
    public static void main(String[] args) {
        int[] edades;
        String[] nombres;
        int n;

        System.out.println("Indique cuántas personas va a cargar en la base de datos: ");
        n = scan.nextInt();
        scan.nextLine(); //Para capturar el enter del nextInt().
        edades = new int[n];
        nombres = new String[n];
        cargarPersonas(nombres, edades);
        imprimirPersonas(nombres, edades);
        
        scan.close();
    }

    public static void cargarPersonas(String[] names, int[] ages) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Indique el nombre de la persona: ");
            names[i] = scan.nextLine();
            System.out.println("Indique la edad de " + names[i]);
            ages[i] = scan.nextInt();
            scan.nextLine(); //Para capturar el enter que queda del nextInt()
        }
    }

    public static void imprimirPersonas(String[] names, int[] ages) {
        String opt = "";

        System.out.println("----Comienza la impresión de la información cargada----");
        for (int i = 0; i < ages.length && !opt.equalsIgnoreCase("no"); i++) {
            System.out.println("Nombre: " + names[i]);
            System.out.println("Edad: " + ages[i]);
            
            //Valida mayoría de edad.
            if (ages[i] < 18) {
                System.out.println("Menor de edad.");
            } else {
                System.out.println("Mayor de edad.");
            }

            while (!(opt.equalsIgnoreCase("si") || opt.equalsIgnoreCase("no")) && i != ages.length-1) { //Fuerza el ingreso de "si" o "no".
                System.out.println("Desea continuar mostrando la información cargada? (Si/No)");
                opt = scan.nextLine();
            } 
            System.out.println("----------------------------");
        }
    }
}

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas
y frenar cuando el usuario ingrese la palabra “No”. */