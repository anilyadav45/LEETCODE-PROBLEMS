class Solution {
//starting from first row last col and move down or left i mean row ++ or col-- i.e i and j
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;//for row track
        int j = matrix[0].length - 1; //row last col
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
