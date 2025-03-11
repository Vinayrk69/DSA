package practice;

public class maxinrange {
        public static void main(String[] args) {
            int arr[]={1,7,5,4,10,9,-1};
            int start=2,end=5;
            int ans=mini(arr,start,end);
            System.out.println("minimum is"+"  "+ans);
        }
        static int mini(int arr[],int start,int end)
        {
            int min=arr[0];
            for(int i=start;i<end;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
    }

