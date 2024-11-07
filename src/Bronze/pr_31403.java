package Bronze;

public class pr_31403 {

    public int[] solution(int[] arr) {
        int answer1 = arr[0] + arr[1] - arr[2];
        int answer2 = arr[0] * 10 + arr[1] - arr[2];

        int[] answer = {answer1, answer2};

        System.out.printf("ans1 = %d\n", answer[0]);
        System.out.printf("ans2 = %d\n", answer[1]);

        return answer;
    }

    public static void main(String[] args) {
        pr_31403 solution = new pr_31403();

        int[] arr1 = {3, 4, 5};
        int[] arr2 = {2, 4, 6};

        System.out.println("문제 1");
        solution.solution(arr1);
        System.out.println("===========");
        System.out.println("문제 2");
        solution.solution(arr2);
    }
}

// 1. 숫자 A, B, C 가 주어짐
// 2. A + B + C = answer1
// 3. A*10 + B + C = answer2
