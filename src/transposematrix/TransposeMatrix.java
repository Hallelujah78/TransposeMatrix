/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transposematrix;

import java.util.Arrays;

/**
 *
 * @author gavan
 */
public class TransposeMatrix {

    private static void transposeMatrix(int[][] matrix) {
        // get dimensions
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // create transposedMatrix
        int transposedMatrix[][] = new int[numCols][numRows];

        // for every row of matrix
        for (int i = 0; i < numRows; i++) {
            // for every col of matrix
            for (int j = 0; j < numCols; j++) {
                for (int k = 0; k < numRows; k++) {
                    // use i=rowMatrix and j = colMatrix
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(transposedMatrix));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrix[][] = {{9, 3, 7}, {4, -5, 1}, {-1, 6, -5}};
        int rectangleMatrix[][] = {{9, 3}, {4, -5}, {-1, 6}};
        /*
        // transpose first row to a column
        [0][0] = [0][0] [rowT][colT] = [rowMatrix][colMatrix] - note that rowT = colMatrix
        [1][0] = [0][1]
        [2][0] = [0][2]

        // transpose second row to a column
        [0][1] = [1][0] [rowT][colT] = [rowMatrix][colMatrix] - note that rowT = colMatrix
        [1][1] = [1][1]
        [2][1] = [1][2]

        // colT = rowMatrix AND rowT = colMatrix
         */

        transposeMatrix(rectangleMatrix);
        transposeMatrix(matrix);

    }

}
