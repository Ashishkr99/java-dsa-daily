package ifelse;

import java.util.Scanner;

public class integerOrNotInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int a = (int)n;

        if(n-a==0)
            System.out.println("Integer");
        else
            System.out.println("Not Integer");
    }
}
