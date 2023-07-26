import java.util.Scanner;

public class spanOfArray {

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }



    
  
    int min = arr[0];
    int max= arr[0];

    for(int j=1;j<arr.length;j++){
        if(arr[j]<min){
            min= arr[j];
        }

        if(arr[j]>max){
            max= arr[j];
        }
    }

    System.out.println(max-min);
}
    
}
