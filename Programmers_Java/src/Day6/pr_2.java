package Day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_2 {

    public static void main(String[] args) {
        Object[][] inputList = {
                {0,"wsdawsdassw"}
        };

        Stream<Object[]> inputStream = Arrays.stream(inputList);

        inputStream.forEach((input)->{
            int answer = solution((int) input[0], (String) input[1]);
            System.out.println("Answer: " + answer);
        });
    }
    public static int solution(int n, String control) {
        char[] controlCharList = control.toCharArray();
        for(char ch:controlCharList){
            if(ch == 'w') n++;
            if(ch == 's') n--;
            if(ch == 'd') n+=10;
            if(ch == 'a') n-=10;
        }
        return n;
    }
}
