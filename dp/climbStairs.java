import java.util.Scanner;

public class climbStairs {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int paths = countPaths(n,new int[n+1]);
        System.out.println(paths);
    }

    public static int countPaths(int n,int[] qb){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }

        if(qb[n]!=0){
            return qb[n];
        }

        int paths1 = countPaths(n-1,qb);
        int paths2 = countPaths(n-2,qb);
        int paths3 = countPaths(n-3,qb);

        qb[n]= paths1+paths2+paths3;
        return paths1+paths2+paths3; 

    }
}
