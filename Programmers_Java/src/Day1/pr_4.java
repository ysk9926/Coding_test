package Day1;

import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String result = toggleCase(input);

        System.out.println(result);
    }

    public static String toggleCase(String input){
        char[] charArray = input.toCharArray();

        for(int i = 0;i<charArray.length;i++){
            char c = charArray[i];

            if(Character.isUpperCase(c)){
                charArray[i] = Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c)){
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }
}
