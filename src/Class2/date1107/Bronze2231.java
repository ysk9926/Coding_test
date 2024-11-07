package Class2.date1107;

import java.util.Scanner;

// 21분

public class Bronze2231 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력 값
        int N = scanner.nextInt();

        String nString = String.valueOf(N);

        int answer = getAnswer(N);


        // 결과 출력
        System.out.println(answer);

        scanner.close();

    }

    private static int getAnswer(int N) {

        int answer = 0;

        // 1부터 N까지 탐색하여 가장 작은 생성자를 찾음
        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            // 각 자리수의 합을 계산
            while (temp > 0) {
                sum += temp % 10; // 일의 자리 더하기
                temp /= 10;        // 자리수 줄이기
            }

            // 생성자를 찾았을 때
            if (sum == N) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

/*
  입력 값 = 숫자
  출력 값 = 생성자
 */

/*
    1. 문자열로 반환하여 자리수 알아보기
    2. 자리수가 1의 자리면 0 반환
    3. 나머지의 경우 각 자리수의 합을 제공값에서 뺀 값을 제출
 */