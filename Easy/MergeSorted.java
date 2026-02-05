class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] newarr = new int[m + n];
        while (i < m && j < n) {//till any one exceeds may be any one of them will be ramainig to traverse
            if (nums1[i] < nums2[j]) {
                newarr[k] = nums1[i];
                i++;
                k++;
            }
            //if nums1 not smaller means nums2 smaller
            else {
                newarr[k] = nums2[j];
                j++;
                k++;
            }

        }
        //for remaining suppose any one exceeds either nums1 or num2 in case where m and n are not equal so we need these
        while (i < m) {
            newarr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            newarr[k] = nums2[j];
            j++;
            k++;
        }

        // after stored all need to copy to original arr 
       for(int f=0; f<newarr.length; f++){
         nums1[f] = newarr[f];
       }
    }
}
