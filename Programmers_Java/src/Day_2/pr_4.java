package Day_2;

import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isOddOrEven(n);
    }

    public static void isOddOrEven(int number) {
        if(number % 2 == 0){
            System.out.printf("%d is even", number);
            return;
        }
        System.out.printf("%d is odd", number);
    }
}
