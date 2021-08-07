package MatrixPerkalian;

/**
 *
 * @author Aizar
 */
public class MatrixPerkalian3 {

    public static void main(String[] args) {
        System.out.println("===== Soal Pertama =====");
        int matrixA[][] = {{1, 6}, {5, 3}};
        int matrixB[][] = {{2}, {3}};

        int matrixC[][] = new int[matrixA.length][matrixB[0].length];

        for (int k = 0; k < matrixA.length; k++) {
            for (int l = 0; l < matrixB[0].length; l++) {
                for (int m = 0; m < matrixB.length; m++) {
                    matrixC[k][l] += matrixA[k][m] * matrixB[m][l];
                }
                System.out.print(matrixC[k][l] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("==== Soal Kedua ====");
        int matrixD[][] = {{1, 6}, {5, 3}, {9, 6}};
        int matrixE[][] = {{2}, {3}};

        int matrixF[][] = new int[matrixD.length][matrixE[0].length];

        for (int a = 0; a < matrixD.length; a++) {
            for (int b = 0; b < matrixE[0].length; b++) {
                for (int c = 0; c < matrixE.length; c++) {
                    matrixF[a][b] += matrixD[a][c] * matrixE[c][b];
                }
                System.out.print(matrixF[a][b] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("==== Soal Ketiga ====");
        int matrixG[][] = {{1}, {3}, {6}};
        int matrixH[][] = {{2, 4, 6}};

        int matrixI[][] = new int[matrixG.length][matrixH[0].length];

        for (int x = 0; x < matrixG.length; x++) {
            for (int y = 0; y < matrixH[0].length; y++) {
                for (int z = 0; z < matrixH.length; z++) {
                    matrixI[x][y] = matrixG[x][z] * matrixH[z][y];
                }
                System.out.print(matrixI[x][y] + "    ");
            }
            System.out.println("  ");
        }
    }

}
