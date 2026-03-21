class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int trackrow = 0;
        int c = 0;
        int mx = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    c++;
                }
            }
            if (c > mx) {
                mx = c;
                trackrow = i;
            }
            c = 0;
        }
        return new int[]{trackrow,mx};
    }
}