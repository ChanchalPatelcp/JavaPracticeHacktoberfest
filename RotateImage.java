public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for (int[] row : matrix) {
            for (int i = 0; i < n / 2; i++) {
                int temp = row[i];
                row[i] = row[n - 1 - i];
                row[n - 1 - i] = temp;
            }
        }
    }
}
