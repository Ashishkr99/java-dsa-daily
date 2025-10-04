package Pattern_printing;

import java.util.Scanner;

public class bridge {

    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num= sc.nextInt();

        int nst=num-1;
        int nsp=1;
        for(int i=1;i<=2*num-1 ;i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i=1;i<=num ;i++)
        {
            for(int j=1;j<=nst ;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<=nsp ;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=nst ;j++)
            {
                System.out.print("* ");
            }
            nst-=1;
            nsp+=2;
            System.out.println();
        }
    }
}
