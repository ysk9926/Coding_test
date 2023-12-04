package Day3;

public class pr_4 {
    public int solution(int a, int b) {
        int resultA = calculate(a, b);
        int resultB = calculate(b, a);

        return Math.max(resultA, resultB);
    }
    public static int calculate(int num1, int num2) {
        int lengthA = String.valueOf(num1).length();
        int answer = num2 * (int) Math.pow(10,lengthA)+num1;
        return answer;
    }
}
