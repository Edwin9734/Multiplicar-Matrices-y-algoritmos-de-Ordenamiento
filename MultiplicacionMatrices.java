import java.util.Scanner;

public class MultiplicacionMatrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se solicitan las dimensiones de la matriz A
        System.out.print("Ingrese el número de filas de la matriz A: ");
        int filasA = entrada.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        int columnasA = entrada.nextInt();

        // Se crea la matriz A
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasA][columnasA];

        System.out.println("Ingrese los elementos de la matriz A: ");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        // Se solicitan las dimensiones de la matriz B
        System.out.print("Ingrese el número de filas de la matriz B: ");
        int filasB = entrada.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        int columnasB = entrada.nextInt();

        // Se verifica que las dimensiones de las matrices sean compatibles para la multiplicación
        if (columnasA != filasB) {
            System.out.println("Las matrices no se pueden multiplicar. Las columnas de la matriz A deben ser iguales a las filas de la matriz B.");
            return;
        }

        System.out.println("Ingrese los elementos de la matriz B: ");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }


        // Se crea la matriz C (resultado de la multiplicación)
        int[][] matrizC = new int[filasA][columnasB];

        // Se realiza la multiplicación de las matrices A y B
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Se muestra la matriz C (resultado)
        System.out.println("Matriz C (resultado): ");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }



}
