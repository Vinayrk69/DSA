package practice;

public class minimum {
    public static void main(String[] args) {
            int arr[]={1,7,5,4,10,9,-1};
            int ans=mini(arr);
        System.out.println("minimum is"+"  "+ans);
    }
    static int mini(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
