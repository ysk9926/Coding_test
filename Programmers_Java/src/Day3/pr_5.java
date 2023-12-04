package Day3;

public class pr_5 {
    public int solution(int a, int b) {
        int lengthB = String.valueOf(b).length();

        int resultA = a * (int) Math.pow(10,lengthB) + b;
        int resultB = 2 * a * b;

        return Math.max(resultA,resultB);
    }
}
