package BINARYSEARCH;

public class SearchMinimum {
    public static void minimum(int[]arr,int start,int end){
        while (start<end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }System.out.println(end);
    }public static void main(String[] args) {
        int[]arr={7,8,9,10,11,0,1,2,3,4,5,6};
        minimum(arr, 0, arr.length-1);
    }
}
