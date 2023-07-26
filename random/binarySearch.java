import java.util.Scanner;

public class binarySearch {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();

        }
        int data= scn.nextInt();


        int l=0;
        int r=arr.length-1;
        int foundAt=-1;
        while(l<=r){
            int m= (l+r)/2;
            if(data<arr[m]){
                r=m-1;
            }
            else if(data>arr[m]){
                l=m+1;
            }
            else{
                foundAt=m;
                break;
            }
        }

        System.out.println(foundAt);

    }
}
