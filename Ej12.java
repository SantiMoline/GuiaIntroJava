import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        String cadena;
        int valid = 0, invalid = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese una cadena: ");
            cadena = scan.nextLine();

            if (esValida(cadena)) {
                valid++;
            } else {
                invalid++;
            }

        } while (!cadena.equalsIgnoreCase("&&&&&"));
        //Cuando cadena = &&&&&& no se ejecuta más el bucle.
        
        //Resto uno al salir del bucle ya que la cadena "&&&&&" me va a sumar uno en inválido.
        invalid--; 

        System.out.println("La cantidad de cadenas válidas ingresadas es: " + valid);
        System.out.println("La cantidad de cadenas inválidas ingresadas es: " + invalid);

        scan.close();
    }

    public static boolean esValida(String arr) {
        boolean prefix = arr.substring(0, 1).equalsIgnoreCase("X"); //Valido primera letra.
        boolean sufix = arr.substring(4, 5).equalsIgnoreCase("O"); //Valido la última letra.
        //Generé las variables así el comparador del return no era tan extenso.

        
        return (arr.length() == 5 && prefix  && sufix);
        //Devuelvo true sólo si se cumple prefijo, sufijo y longitud 5 en simultaneo.
    }
}

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y
el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals(). */