class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] pos = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    pos[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < pos.length; i++) {
            for (int j = 0; j < pos[i].length; j++) {
                if (pos[i][j] == 1) {
                    setrowzero(i, matrix);
                    setcolzero(j, matrix);
                }
            }
        }
    }

    void setrowzero(int row, int[][] arr) {
        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i] = 0;
        }
    }

    void setcolzero(int col, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }
}