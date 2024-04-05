package BINARYSEARCH;

public class SearchInRotated2 {
    public static void search(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            } if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start+1;
                end =end-1;
                continue;
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
        int[]arr={7,8,1,2,3,3,3,4,5,6};
        search(arr, 0, arr.length-1, 3);
    }
}
