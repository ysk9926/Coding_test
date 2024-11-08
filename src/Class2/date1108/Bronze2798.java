package Class2.date1108;

import java.util.Scanner;

// 10분
// 완전 탐색 문제 ( 노가다 )

/*
    시간 복잡도
    n(n+1)(n+2) / 6

    O(n^3)
 */

public class Bronze2798 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        int result = search(cards, N, M);

        // 결과 출력
        System.out.println(result);
        scanner.close();
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < N - 2; i++) {

            // 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
            for (int j = i + 1; j < N - 1; j++) {

                // 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
                for (int k = j + 1; k < N; k++) {

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if (M == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신
                    if(result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        // 모든 순회를 마치면 result 리턴
        return result;
    }
}

/*
    입력 값
    제공 카드 갯수, 제한 숫자
    제공 카드 숫자


 */