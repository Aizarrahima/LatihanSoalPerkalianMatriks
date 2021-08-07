package MatrixPerkalian;

/**
 *
 * @author Aizar
 */
public class MatriksPerkalian3notIndex0 {

    public static void main(String[] args) {
        int matrixA[][] = {{1, 6}, {5, 3}};
        int matrixB[][] = {{2}, {3}};

        int matrixC[][] = new int[matrixA.length][matrixB.length];

        for (int x = 0; x < matrixA.length; x++) {
            for (int y = 0; y < matrixB[0].length; y++) {
                for (int z = 0; z < matrixB.length; z++) {
                    matrixC[x][y] += matrixA[x][z] * matrixB[z][y];
                }
                System.out.print(matrixC[x][y] + "  ");

            }
            System.out.println(" ");
        }
    }
}
