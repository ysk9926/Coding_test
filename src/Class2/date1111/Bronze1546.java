package Class2.date1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 22분

public class Bronze1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 숫자 개수 n
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄: 점수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 계산
        int max = getMax(scores);

        // 평균 계산
        double avg = getAdjustedAverage(scores, max);

        System.out.println(avg);

        br.close();
    }

    private static int getMax(int[] scores) {
        int max = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    private static double getAdjustedAverage(int[] scores, int max) {
        double sum = 0;
        for (int score : scores) {
            sum += ((double) score / max) * 100;
        }
        return sum / scores.length;
    }
}

/*
    입력 값 : 과목 갯수
             과목 별 점수

     1. 과목 점수 중 최댓 값 찾기 ( 해시 )
     2. 새로운 평균 값 반환

 */