package practice;

public class floor {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,8,9,11};
        int target=7;
        int ans=floor1(arr,target);
        System.out.println("the floor value is"+"   "+ans);
}
    static int floor1(int arr[], int target){
        int start=arr[0];
        int end=arr[arr.length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
