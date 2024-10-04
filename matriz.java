public class matriz {
    public static void main(String[] args) {

        // Matriz que representa un cubo mágico
        int[][] matriz = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        // Mostrar la matriz inicial
        mostrarMatriz(matriz);
        verificarCuboMagico(matriz);

        // Sumar filas y mostrar el resultado
        int[] sumasDeFilas = sumarFilas(matriz);
        System.out.println("Sumas de filas:");
        for (int suma : sumasDeFilas) {
            System.out.println(suma);
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void verificarCuboMagico(int[][] matriz) {
        int sumaObjetivo = 15;

        // Filas
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                System.out.println("Ya no es un cubo mágico.");
                return;
            }
        }

        // Columnas
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaObjetivo) {
                System.out.println("Ya no es un cubo mágico.");
                return;
            }
        }

        // Diagonal principal
        int sumaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        if (sumaDiagonalPrincipal != sumaObjetivo) {
            System.out.println("Ya no es un cubo mágico.");
            return;
        }

        // Diagonal secundaria
        int sumaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonalSecundaria != sumaObjetivo) {
            System.out.println("Ya no es un cubo mágico.");
            return;
        }

        // Si todas las sumas son correctas
        System.out.println("Es un cubo mágico.");
    }

    public static int[] sumarFilas(int[][] matriz) {
        int[] sumas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            sumas[i] = sumaFila;
        }
        return sumas;
    }
}
