package matriz.de.pkg4x4;

import java.util.Scanner;

public class MatrizDe4x4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Capturar los números para llenar la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boolean valido = false;
                while (!valido) {
                    System.out.print("Ingrese un número entre 3 y 6 para la posición [" + i + "][" + j + "]: ");
                    int num = scanner.nextInt();
                    if (num >= 3 && num <= 6) {
                        matriz[i][j] = num;
                        valido = true;
                    } else {
                        System.out.println("Número inválido. Debe estar entre 3 y 6.");
                    }
                }
            }
        }

        // Contar las repeticiones de cada número del 3 al 6
        int[] repeticiones = new int[4]; // Índices 0 a 3 representan números 3, 4, 5, 6

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = matriz[i][j];
                repeticiones[num - 3]++;
            }
        }

        // Calcular las potencias según la frecuencia de cada número
        double[] potencias = new double[4];
        for (int i = 0; i < 4; i++) {
            int num = i + 3; // Números 3, 4, 5, 6
            int frecuencia = repeticiones[i];
            potencias[i] = Math.pow(num, frecuencia);
        }

        // Mostrar la matriz generada
        System.out.println("Matriz generada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar las potencias de los números del 3 al 6
        System.out.println("\nPotencias de los números del 3 al 6:");
        for (int i = 0; i < 4; i++) {
            int num = i + 3;
            System.out.println("Número " + num + ": " + potencias[i]);
        }
    }
}
