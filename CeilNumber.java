package BINARYSEARCH;

public class CeilNumber {
    public static void ceil(int[]arr,int start,int end,int target){
        if(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target) {
                System.out.println(mid);
            }else if(arr[mid]>target){
                ceil(arr, start, mid-1, target);
            }else{
                ceil(arr, mid+1, end, target);
            }
        }else{
            System.out.println(start);
        }
    } public static void approach2(int[]arr,int start,int end,int target){
        int ans=arr.length;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(ans);
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
        ceil(arr, 0, arr.length-1, 6);
        approach2(arr, 0, arr.length-1, 6);
    }
}
