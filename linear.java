package practice;
import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,9};
        int x;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        int n=arr.length;
        int index=linear1(arr,x,n);
        if(index==-1) {
            System.out.println("element not found");
        }
        else{
            System.out.println("element found"+" "+index);
        }
    }
    static int linear1(int arr[],int x,int n)
    {
        for(int i=0;i<n;i++ ) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
