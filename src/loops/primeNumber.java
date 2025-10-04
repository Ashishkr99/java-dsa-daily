package loops;

import java.util.Scanner;

public class primeNumber {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();

        boolean flag =true ; // prime number

        for(int i=2 ;i<=Math.sqrt(n) ;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(n==1)
            System.out.println("Neither prime nor composite");
        else if(flag==true)
            System.out.println("prime");
        else {
            System.out.println("composite");
        }

    }
}
