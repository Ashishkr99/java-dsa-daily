package Pattern_printing;

import java.util.Scanner;

public class starPlus {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row= sc.nextInt();
        int k=row/2 +1;
        for (int i=1 ;i<=row;i++)
        {
            for (int j=1;j<=row;j++)
            {
                if(i==k || j==k)
                System.out.print  ("* ");
                else
                    System.out.print  ("  ");

            }
            System.out.println();
        }
    }
}
