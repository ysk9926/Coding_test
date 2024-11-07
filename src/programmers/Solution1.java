package programmers;

public class Solution1 {

    public int[] solution(int[][] dice) {
        long deviceProb = deviceDice(dice.length);



        int[] answer = {};
        return answer;
    }

    private long deviceDice(int diceNum) {
        int getDiceNum = diceNum/2;

        return calculateCombination(diceNum, getDiceNum);
    }

    /**
     *  주사위 나누어 갖는 확률 계산 메서드
     *
     * @param diceNum
     * @param getDiceNum
     * @return long
     */
    private long calculateCombination(int diceNum, int getDiceNum) {
        long  numerator = factorial(diceNum);
        long denominator = factorial(getDiceNum) * factorial(diceNum - getDiceNum);

        return numerator/denominator;
    }

    /**
     * 팩토리얼 계산하는 메서드
     * @param num
     * @return 팩토리얼 계산 결과
     */
    private long  factorial(int num) {
        long  result = 1;
        for(int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[][] dice1 = {
                {1, 2, 3, 4, 5, 6},
                {3, 3, 3, 3, 4, 4},
                {1, 3, 3, 4, 4, 4},
                {1, 1, 4, 4, 5, 5}
        };

        int[][] dice2 = {
                {1, 2, 3, 4, 5, 6},
                {2, 2, 4, 4, 6, 6}
        };

        int[][] dice3 = {
                {40, 41, 42, 43, 44, 45},
                {43, 43, 42, 42, 41, 41},
                {1, 1, 80, 80, 80, 80},
                {70, 70, 1, 1, 70, 70}
        };

        System.out.println(solution.solution(dice1));
        System.out.println(solution.solution(dice2));
        System.out.println(solution.solution(dice3));
    }
}
