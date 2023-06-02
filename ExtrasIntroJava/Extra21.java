import java.util.Scanner;

public class Extra21 {
    public static void main(String[] args) {
        double[][] notas = new double[10][5];
        int aprobados;
        cargarNotas(notas);
        imprimirMatriz(notas);
        
        aprobados = contarAprobados(notas);
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + (notas.length - aprobados));
    }


    //Carga las notas dejando la última columna libre y para calcular y asignar el promedio ponderado de las mismas.
    public static void cargarNotas(double[][] mat) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Indique las notas del alumno Nº " + (i+1));
            for (int j = 0; j < mat[0].length; j++) {
                
                //Completa la última columna con el promedio.
                if(j == mat[0].length - 1) {
                    mat[i][j] = calcularPromedio(mat,i);
                } else { //Caso contrario completa con lo indicado por el usuario.
                    mat[i][j] = scan.nextDouble();
                }
            }
        }
        scan.close();
    }

    public static double calcularPromedio(double[][] mat, int fila) {
        double promedio = 0;
        //recorre hasta la anteúltima columna ya que en la última vamos a guardar el promedio.
        for (int j = 0; j < mat[fila].length-1; j++) {
            switch (j) {
                case 0: promedio += mat[fila][j] * 0.1; break;
                case 1: promedio += mat[fila][j] * 0.15; break;
                case 2:promedio += mat[fila][j] * 0.25; break;
                case 3:promedio += mat[fila][j] * 0.5; break;
                default: promedio = 11; //valor imposible, es de control.
            }
        }
        return promedio;
    }

    //Recorre la última columna de cada fila, buscando promedios >= 7 para contarlos como aprobados.
    public static int contarAprobados(double[][] mat) {
        int contador = 0;
        for (int i = 0; i < mat.length; i++) {
            //Recorre filas y siempre toma el valor de la última columna.
            if(mat[i][mat[0].length-1] >= 7) {
                contador++;
            } 
        }
        return contador;
    }

    //Función traída del ejercicio 18 de la guía común.
    public static void imprimirMatriz(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - 1 ){
                    System.out.print(mat[i][j]); 
                } else {
                    System.out.print(mat[i][j] + " , ");
                }
            }
            System.out.println(" |");
        }
    }
}

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados.
Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso. */