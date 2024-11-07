package Class2.date1107;

import java.util.Scanner;

// 25분

public class Bronze1978 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 첫 줄의 N의 갯수
        int N = scanner.nextInt();

        // 둘째 줄의 수
        int[] intArr = new int[N];
        for(int i = 0; i < N; i++) {
            intArr[i] = scanner.nextInt();
        }

        // 최종 결과 값을 담아줄 int값
        int answer = 0;

        // 루프를 돌면서 값이 소수이면 answer에 1씩 추가해주는 함수
        for(int n : intArr) {
            int sqrt = getSqrt(n);

            if(isSqrt(n, sqrt)) answer++;
        }

        // 결과 출력
        System.out.println(answer);

        scanner.close();
    }

    private static int getSqrt(int n) {
        return (int) Math.sqrt(n);
    }

    private static boolean isSqrt(int n, int sqrt) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= sqrt; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

// 첫 줄 -> N개의 수가 주어짐
// N <= 100
// 둘쨋 줄 -> 숫자가 주어짐
// 0 < 수 <= 1000
//
// 입력 예시
// 4
// 1 3 5 7
// 출력 예시
// 3


/**
 * 1. 입력 값 받아오기
 * 2. 숫자 배열에서 소수 찾아보기
 *
 * 1. 입력값 받아오는 알고리즘
 * 2. 소수 찾는 메서드
 *
 * 2-1. 제곱근 구하기
 * 2-2. 제곱근까지 루프를 돌려서 나누어 지는 값이 있는지 확인
 */