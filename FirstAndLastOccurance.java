package BINARYSEARCH;

public class FirstAndLastOccurance {
    public static void occurance(int[]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(i);
            }else if(arr[arr.length-i-1]==target){
                System.out.println(arr.length-i-1);
            }
        }
    }
    public static void occurance2(int[]arr,int target){
        int first=-1;
        int last=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                if(first==-1){
                    first=i;
                }last=i;
            }
        }System.out.print(first);
        System.out.println(last);
    }
    public static void first(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(start);
    }
    public static void last(int[]arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(end);
    }
    public static void main(String[] args) {
        int[]arr={2,4,6,8,8,8,8,11,13};
        occurance(arr, 8);
        occurance2(arr, 8);
        first(arr, 0, arr.length-1, 8);
        last(arr, 0, arr.length-1, 8);
    }
}
