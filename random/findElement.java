import java.util.Scanner;

public class findElement {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();

        }
        int elem = scn.nextInt();

        for(int j=0;j<arr.length;j++){
            if(arr[j] == elem){
                System.out.println("element fouind"+ arr[j]);
            }
        }

        System.out.println("element not found");
    }
}
