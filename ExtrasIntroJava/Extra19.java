public class Extra19 {
    public static void main(String[] args) {
        int[] vect1 = {1,2,3,4}, vect2 = {1,2,3,4};

        if(compararVectores(vect1,vect2)) {
            System.out.println("Los vectores son IGUALES.");
        } else {
            System.out.println("Los vectores son DISTINTOS.");
        }   
    }

    public static boolean compararVectores(int[] vect1, int[] vect2) {
        //Si tienen distinta longitud return false.
        if (vect1.length != vect2.length) {
            return false;
        } 
        //Si tienen la misma longitud, comparo los elementos en cada uno y al detectar diferencia retorna false.
        for (int i = 0; i < vect1.length; i++) {
            if(vect1[i] != vect2[i]) {
                return false;
            }
        }
        return true;
    }
}
/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se
detecte alguna diferencia entre los elementos).
 */