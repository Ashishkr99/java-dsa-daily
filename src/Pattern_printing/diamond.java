package Pattern_printing;

import java.util.Scanner;

public class diamond {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int num= sc.nextInt();
        int nsp=num-1;
        int nst=1;

        for(int i=1;i<=num ;i++)
        {
            for(int j=1;j<=nsp ;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=nst ;j++)
            {
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

        nsp=1;
        nst-=4;
        for(int i=1;i<=num ;i++)
        {
            for(int j=1;j<=nsp ;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=nst ;j++)
            {
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
