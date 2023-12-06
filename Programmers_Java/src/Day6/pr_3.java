package Day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_3 {
    public static void main(String[] args) {
        int[][] inputList = {
                {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}
        };

        Stream<int[]> inputStream = Arrays.stream(inputList);

        inputStream.forEach((input)->{
            String answer = solution(input);
            System.out.println("Answer: " + answer);
        });
    }
    public static String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < numLog.length-1; i++){
            int control = numLog[i + 1] - numLog[i];
            result.append(controlInput(control));
        }

        return result.toString();
    }

    public static String controlInput(int num) {
        String controllerResult = null;
        if (num == 1) controllerResult = "w";
        if(num == -1) controllerResult = "s";
        if(num == 10) controllerResult = "d";
        if(num == -10) controllerResult = "a";

        return controllerResult;
    }
}
