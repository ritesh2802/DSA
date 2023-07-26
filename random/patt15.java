import java.util.Scanner;

public class patt15 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st =1;
        int sp = n/2;
        int val =1;
        for(int i=1;i<=n;i++){
            

            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print(val);
                
            }
            System.out.println();
            

            if(i<=n/2){
                st+=2;
                sp--;
                val++;
            }
            else{
                st-=2;
                sp++;
                val--;
            }
        }

        
    }
}
