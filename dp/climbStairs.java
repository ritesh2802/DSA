import java.util.Scanner;

public class climbStairs {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = countPathsTab(n);
        System.out.println(ans);
       
        

    }

    public static int countPathsTab(int n){

        if(n==0){
            return 1;

        }
        else if(n<0) {
            return 0;
        }
            int dp[] = new int[n+1];
            dp[0]=1;
            for(int i=1;i<dp.length;i++){
                if(i==1){
                    dp[i]=dp[i-1];
                }
                else if(i==2){
                    dp[i]=dp[i-1]+dp[i-2];
                }
                else{
                    dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
                }
            }
            return dp[n];
    }




}
