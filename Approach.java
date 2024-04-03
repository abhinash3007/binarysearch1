package BINARYSEARCH;

public class Approach {
    public static void iterative(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }public static void recurrsive(int[]arr,int start,int end,int target){
        if (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }else if(arr[mid]>target){
                recurrsive(arr, start, mid-1, target);
            }else{
                recurrsive(arr, mid+1, end, target);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,5,8,9,11,15,18};
        iterative(arr, 0, arr.length-1, 11);
        recurrsive(arr, 0, arr.length-1, 11);
    }
}
