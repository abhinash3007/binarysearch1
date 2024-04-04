package BINARYSEARCH;

public class FloorNumber {
    public static void floor(int[]arr,int start,int end,int target){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }else if(arr[mid]<target){
                floor(arr, mid+1, end, target);
            }else{
                floor(arr, start, mid-1, target);
            }
        }else{
            System.out.println(end);
        }
    } public static void approach2(int[]arr,int start,int end,int target){
        int ans=arr.length;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }System.out.println(ans);
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
        floor(arr, 0, arr.length-1, 10);
        approach2(arr, 0, arr.length-1, 10);
    }
}
