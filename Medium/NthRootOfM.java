class Solution {
    public int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        if(m==0){
            return m;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long val = power(mid, n);

            if (val == m) {
                return mid;
            } else if (val < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    long power(long base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}