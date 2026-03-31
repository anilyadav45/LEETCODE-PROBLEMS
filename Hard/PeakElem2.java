class Solution {
    private static int maxInrow(int mat[][], int col) {
        int maxrow = 0;
        int rowidx = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > maxrow) {
                maxrow = mat[i][col];
                rowidx = i;
            }
        }
        return rowidx;
    }
public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int mxrow = maxInrow(mat, mid);

            int left = (mid - 1 >= 0) ? mat[mxrow][mid - 1] : -1;
            int right = (mid + 1 < mat[0].length) ? mat[mxrow][mid + 1] : -1;

            if (mat[mxrow][mid] > left && mat[mxrow][mid] > right) {
                return new int[] { mxrow, mid };
            } else if (mat[mxrow][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }


}