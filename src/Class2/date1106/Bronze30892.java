package Class2.date1106;

import java.util.Scanner;

public class Bronze30892 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 줄에 참가자의 수 N을 입력받습니다.
        int N = scanner.nextInt();

        // 둘째 줄에 티셔츠 사이즈별 신청자의 수를 입력받습니다.
        int[] tshirtSizes = new int[6];
        for (int i = 0; i < 6; i++) {
            tshirtSizes[i] = scanner.nextInt();
        }

        // 셋째 줄에 티셔츠 묶음 수 T와 펜 묶음 수 P를 입력받습니다.
        int T = scanner.nextInt();
        int P = scanner.nextInt();

        // 티셔츠의 최소 묶음 수를 계산
        int minTshirtBundles = calculateMinTshirtBundles(tshirtSizes, T);

        // 펜 묶음 수와 낱개 수 계산
        int[] penResult = calculatePenBundles(N, P);

        // 결과 출력
        System.out.println(minTshirtBundles);
        System.out.println(penResult[0] + " " + penResult[1]);

        scanner.close();
    }

    // 티셔츠 묶음의 최소 개수를 계산하는 메서드
    private static int calculateMinTshirtBundles(int[] tshirtSizes, int T) {
        int totalBundles = 0;
        for (int size : tshirtSizes) {
            // 각 사이즈에 대해 필요한 묶음의 개수를 계산합니다.
            totalBundles += (size + T - 1) / T; // 올림하여 묶음 수 계산
        }
        return totalBundles;
    }

    // 펜 묶음 수와 낱개 수를 계산하는 메서드
    private static int[] calculatePenBundles(int N, int P) {
        int bundles = N / P;  // 최대 묶음 수
        int remainder = N % P; // 나머지 낱개 수
        return new int[]{bundles, remainder};
    }
}
