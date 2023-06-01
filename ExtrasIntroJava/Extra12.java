public class Extra12 {
    public static void main(String[] args) {
        String cont="";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    cont = "";
                    cont = cont.concat(reemplazarTres(i)+"-");
                    cont = cont.concat(reemplazarTres(j)+"-");
                    cont = cont.concat(reemplazarTres(k));
                    System.out.println(cont);
                }
            }
        }

    }

    public static String reemplazarTres(int n) {
        if (n == 3) {
            return "E";
        } else {
            return Integer.toString(n); //Convierte el int a String.
        }
    }
}
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E */