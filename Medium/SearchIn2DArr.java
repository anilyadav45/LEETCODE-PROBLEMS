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