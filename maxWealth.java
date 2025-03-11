package practice;

public class MaxWealth {
    public static void main(String[] args) {
        //[2,8,7],[7,1,3],[1,9,5]
        int[][] accounts={
            {2,8,7},
            {7,1,3},{
                1,9,5
        }
        };
        int ans=maximumWealth(accounts);
        System.out.println("Richest is "+"  " +ans);

    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int row=0;row<accounts.length;row++) {
            int rowsum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rowsum += accounts[row][col];

            }


            if (rowsum > max) {
                max=rowsum;
            }
        }
        return max;
    }

}
