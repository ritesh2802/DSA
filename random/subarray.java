import java.util.Scanner;

public class subarray {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

        for(int j=0;j<arr.length;j++){
            for(int k=j;k<arr.length;k++){
                // System.out.println(j+" "+k);
                for(int l=j;l<=k;l++){
                    System.out.print(arr[l]);
                }
                System.out.println();
            }
        }


      
     }
}
