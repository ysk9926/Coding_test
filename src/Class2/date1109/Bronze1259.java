package Class2.date1109;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10분

public class Bronze1259 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;

            while (!(input = br.readLine()).equals("0")) {
                if (isPalindrome(input)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        public static boolean isPalindrome (String str){
            int len = str.length();

            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
}
