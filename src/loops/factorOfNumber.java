package loops;

import java.util.Scanner;

public class factorOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = true; // prime number

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(i==n/i)
                    System.out.print(i+" ");
                else
                System.out.print(i+" "+n/i+" ");
            }
        }

    }
}
