package MatrixPerkalian;

/**
 *
 * @author Aizar
 */
public class MatriksPerkalian {

    public static void main(String[] args) {
        int matriksA[][] = {{6, 3}, {4, 8}};
        int matriksB[][] = {{1}, {2}};

        // baris x -> x.length
        // kolom x -> x[0].length (pastikan bahwa index 0 itu ada isinya)
        // matriks mA[barisA][kolomA] * mb [barisB][kolomB] = mC [barisA][kolomB]
        int matriksC[][] = new int[matriksA.length][matriksB[0].length];

        for (int i = 0; i < matriksA.length; i++) { // baris matriksA
            for (int j = 0; j < matriksB[0].length; j++) { // kolom matriksB
                for (int k = 0; k < matriksB.length; k++) {
                    matriksC[i][j] += matriksA[i][k] * matriksB[k][j];
                }
                System.out.print(matriksC[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
