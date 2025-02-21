package section3.lesson22;

public class CodingEx14 {
    public static void printMatrixElements(int[][] matrix) {
        // TODO: Implement the method to print all elements of the two-dimensiona array using System.out.println.
        for (int i=0 ; i< matrix.length ; i++) {
            for (int j=0 ; j<matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] matrix = CodingEx13.initializeMatrix();
        printMatrixElements(matrix);
    }
}
