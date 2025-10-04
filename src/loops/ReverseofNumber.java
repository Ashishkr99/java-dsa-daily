package loops;

import java.util.Scanner;

public class ReverseofNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int num1=num;
        int r=0;
        while(num!=0)
        {
            r=r*10;
            r=r+(num%10);
            num/=10;
        }
        System.out.println(r+num1);
    }
}
