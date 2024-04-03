package BINARYSEARCH;

public class LowerBound {
    public static void lower(int[]arr,int start,int end,int target){
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
    }public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,10};
        lower(arr, 0, arr.length-1, 9);
    }
}
