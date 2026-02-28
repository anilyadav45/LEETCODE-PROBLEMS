class Solution {
    public int findKRotation(int arr[]) {
        // Code here
//same approach like - find min in sorted rot arr but we take idx of min as count
    int low = 0;
    int high = arr.length - 1;
    int min = Integer.MAX_VALUE;
    int index = 0;
    //write same code as find min in sorted rot arr but with no min functino with manula condition 
    while(low <= high){
        int mid = low + (high - low)/2;
        
        //for early exit when found no rotation
        if(arr[low] <= arr[high]){
            if(arr[low] < min){
                min = arr[low];
                index = low;
                break;
            }
        }
        if(arr[low]<=arr[mid]){//left sorted
            if(min>arr[low]){
                min = arr[low];
                index = low;//we need idx but keep track min value 
            }
            //eliminate left rotate
            low = mid + 1;
        }
        else{//right sorted
         if(min>arr[mid]){
                min = arr[mid];
                index = mid;//we need idx but keep track min value 
            }
            //eliminate right 
            high = mid - 1;
            
        }
    
    }
    return index;
    }
    
}
//same code of find min in rot sort arr