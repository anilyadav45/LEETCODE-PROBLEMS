//better 
class Solution {
    private static boolean binSearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target) {
                //need more 
                low = mid + 1;
            } else {
                high = mid - 1;//need lesser val
            }
        }
        return false;

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            boolean col = binSearch(matrix[i], target);
            if (col == true) {
                return true;
            }
        }
        return false;
    }
}

//best optimal - row eliminate and col eliminate 
//start from 1st row and last col elem
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //keep in mind we are starting from first row and last col so ,  we eliminate row and col 
        //so while elimination like for row move next for col backward becuase row = 0 and col = n - 1; 
        int row = 0;//first row
        int col = matrix[0].length - 1;//lasat col
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            //col is sorted so no need to move col but can be in this row since elem is larger so eliminate col last
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                //since curr elem is lower so need to move bigger so row eliminate and move to next row
                row++;
            } 
        }
        return false;
    }
}