import java.util.Scanner;

public class reverseArray {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }

        reverse(arr);

        


    }


    public static void reverse(int arr[]){
        int left = 0;
        int right= arr.length-1;
        

        while(left<=right){
          
           int  temp=arr[left];
           arr[left]= arr[right];
            arr[right]= temp;
            System.out.println();
            left++;
            right--;
        }

    
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
}
