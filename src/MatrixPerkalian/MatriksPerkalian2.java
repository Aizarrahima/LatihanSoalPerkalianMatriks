package MatrixPerkalian;

/**
 *
 * @author Aizar
 */
public class MatriksPerkalian2 {

    public static void main(String[] args) {
        int matrixA[][] = {{6, 3, 2}, {4, 2, 3}};
        int matrixB[][] = {{1, 2}, {2, 3}, {3, 1}};

        int matrixC[][] = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
