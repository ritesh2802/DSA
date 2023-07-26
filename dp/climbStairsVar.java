import java.util.Scanner;

public class climbStairsVar {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int ans = countPathsVar(n,arr);
        System.out.println(ans);

    }

    public static int countPathsVar(int n, int arr[]){
            int dp[] = new int[n+1];
           


            dp[n]=1;
            for(int i=n-1;i>=0;i--){
                for(int j=1;j<=arr[i];j++){

                    if((i+j)<=n) {
                        dp[i] += dp[i+j];
                     }
                }
            }

            return dp[0];

         
         


    }


}
