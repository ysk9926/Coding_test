package Class2.date1108;

import java.util.Scanner;

// 20분

public class Bronze2292 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N받아오기
        int N = scanner.nextInt();

        int answer = countN(N);

        // 결과 출력
        System.out.println(answer);

        scanner.close();
    }

    private static int countN(int N) {
        if (N == 1) return 1;

        int cnt = 1; // 껍질의 개수
        int range = 2; // 시작 범위

        // 범위가 N보다 작을 때까지 반복
        while (range <= N) {
            range += 6 * cnt; // 각 껍질에서 방의 수가 6씩 증가
            cnt++;
        }

        return cnt;
    }
}


/*
    1. 벌집모양으로 숫자 작성
    1 -> 6 -> 12 -> 18
    6의 배수로 숫자 증가

    입력 값 -> N
    N이 몇번째 타일에 속하는지 확인
 */