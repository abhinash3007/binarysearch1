package BINARYSEARCH;

public class SearchInRotated {
    public static void rotated(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            if(arr[start]<arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }    
        }
    }public static void main(String[] args) {
        int[]arr={7,8,9,1,2,3,4,5,6};
        rotated(arr, 0, arr.length-1, 2);
    }
}
