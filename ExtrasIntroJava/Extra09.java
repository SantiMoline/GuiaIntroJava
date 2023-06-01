import java.util.Scanner;

public class Extra09 {
    public static void main(String[] args) {
        int mayor, menor;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese el número mayor: ");
            mayor = scan.nextInt();
            System.out.println("Ingrese el número menor: ");
            menor = scan.nextInt();
        } while (menor > mayor); //Valido que el mayor efectivamente se ingrese primero.

        System.out.println("El resultado de la división de " + mayor + " y " + menor + " es: ");
        divisionPorResta(mayor, menor);
        scan.close();        
    }

    public static void divisionPorResta(int a, int b) {
        int cociente = 0;
        while (a >= b) {
            a = a - b;
            cociente++;
        }
        System.out.println("Cociente =  "+ cociente);
        System.out.println("Resto = " + a);
    }
}

/*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule
el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37
37 – 13 = 24
24 – 13 = 11
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */