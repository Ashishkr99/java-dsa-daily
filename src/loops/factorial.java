package loops;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        int r=1;
        while(num!=0)
        {
            r=r*num;
            num--;
        }
        System.out.println(r);
    }
}
