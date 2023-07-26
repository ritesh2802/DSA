import java.util.Scanner;

//prime
public class f1 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("enter a number ");
       int n = scn.nextInt();
       boolean isPrime = true;
       for(int div=2;div*div<=n;div++){
        if(n%div==0){
            isPrime = false;
            break;
        }
       }
       if(isPrime == true){
        System.out.println("prime");
       }
       else{
        System.out.println("not prime");
       }
          
    }
}