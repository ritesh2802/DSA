import java.util.Scanner;

/*public class dig{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        int nod=0;
        while(temp!=0){
            int quo = temp/10;
            int rem = temp%10;

            nod++;
            temp = temp/10;
        }
        System.out.println(nod);
    }
}
    */
//  print digits 

public class dig{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        int div=1;
        while(temp>0){
            // int quo = temp/10;
            // int rem = temp%10;

            
            temp = temp/10;
            div*=10;
            
        }
       System.out.println(div);
        while(div>=1){
            int quo = num/div;
            
            num =num%div;
            div=div/10;
            System.out.println("mvn"+quo);

        }
    }
}
 