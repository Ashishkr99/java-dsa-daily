package Pattern_printing;

import java.util.Scanner;

public class star_tringle_vertically_flipped {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if((i+j)>num)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
