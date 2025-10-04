package loops;

import java.util.Scanner;

public class Ap {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=99 ;i>0; i=i-4)
        {
            System.out.print(i +" ");
        }
    }
}
