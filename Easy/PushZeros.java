class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int l=0;
        int r=1;
        while(r<arr.length){
            //time when already sorted no zeros
            if(arr[l] != 0 && arr[r] != 0){
                l++;
                r++;
            }
            
            else if(arr[l]==0 && arr[r] !=0){
                //swap
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r++;
            }
            else if(arr[l] == 0 && arr[r] == 0){
                r++;
            }
            else if(arr[l] != 0){
                l++;
            }
            
        }
    }
}