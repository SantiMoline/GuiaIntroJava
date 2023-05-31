import java.util.Scanner;

public class Extra04 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1 y 10: ");
        num = scan.nextInt();

        //Valido que el número esté entre 1 y 10.
        while (num < 1 || num > 10) {
            System.out.println("Número inválido. Ingrese un número entre 1 y 10: ");
            num = scan.nextInt();
        }

        System.out.println("El número " + num + " convertido a número romano es: " + convertToRoman(num));
        scan.close();
    }

    //Lo hice así porque era rápido, pero es muy trucho.
    public static String convertToRoman(int n) {
        switch (n) {
            case 10: return "X";
            case 9: return "IX";
            case 8: return "VIII";
            case 7: return "VII";
            case 6: return "VI";
            case 5: return "V";
            case 4: return "IV";
            case 3: return "III";
            case 2: return "II";
            case 1: return "I";
            default: return null;
        }
    }
}

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano. */