public class mergeSort {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of nums1, if any
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        // Copy remaining elements of nums2, if any
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        // Copy merged array back to nums1
        for (int p = 0; p < merged.length; p++) {
            nums1[p] = merged[p];
        }
    }

    public static void mergeSort(int nums1[], int m, int num2[], int n) {
        // Merge nums1 and num2 into nums1
        merge(nums1, m, num2, n);
        // Sorting nums1 using merge sort
        sort(nums1, 0, m + n - 1);
    }

    private static void sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            // Sort first and second halves
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        // Copy data to temp arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
        // Merge the temp arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // Example nums1 array with extra space for merging
        int m = 3; // Number of elements in nums1
        int[] nums2 = {2, 4, 6}; // Example nums2 array
        int n = 3; // Number of elements in nums2

        mergeSort(nums1, m, nums2, n);

        // Print the merged and sorted array nums1
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
