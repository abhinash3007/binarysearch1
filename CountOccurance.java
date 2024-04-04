package BINARYSEARCH;

public class CountOccurance {
    public static void occurance(int[]arr,int start,int end,int target){
            int first=first(arr, 0, arr.length-1, target);
            int last=last(arr, 0, arr.length-1, target);
            System.out.println(last-first+1);
        }
     public static int first(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return start;
    }
    public static int last(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return end;
    }
     public static void main(String[] args) {
        int[]arr={2,4,6,8,8,8,8,11,13};
        occurance(arr, 0, arr.length-1, 8);
    }
}
