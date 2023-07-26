import java.util.Scanner;

public class rotateArray {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();

        }
        int k= scn.nextInt();

        rotate(arr,k);

    }

    public static void rotate(int arr[],int k){
        reverse(arr,0,k);
        reverse(arr,k,arr.length-k);
    }
    public static void reverse(int arr[],int left,int right){
        while(left<=right){
            int temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
