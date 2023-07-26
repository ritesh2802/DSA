import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int foundAt=-1;
        for(int i=0;i<arr.length;i++){
            if(data==arr[i]){
                foundAt=i;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
