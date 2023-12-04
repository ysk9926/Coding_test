package Day2;

import java.util.Scanner;

public class pr_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] charArray = a.toCharArray();

        for(int i = 0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
}
