package BINARYSEARCH;

public class SearchInsertPosition {
    public static void insertPosition(int[]arr,int start,int end,int target){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }else if(arr[mid]>target){
                insertPosition(arr, start, mid-1, target);
            }else{
                insertPosition(arr, mid+1, end, target);
            }
        }else{
            System.out.println(start);
        }
    }public static void main(String[] args) {
        int[]arr={1,2,4,5,7,9};
        insertPosition(arr, 0, arr.length-1, 8);
    }    
}
