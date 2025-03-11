package practice;

public class evendigits {
    public static void main(String[] args) {
        int nums[] = {12, 3456, 2, 6, 7896};

            int ans=findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
            for(int num:nums){
                if (evendig(num)) {
                    count++;
            }
            }
            return count;
        }
    static boolean evendig(int num){
        int digi= repdigits(num);
        if(digi%2==0){
            return true;
        }
        return false;
    }
    static int repdigits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    }