package Class2.date1114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15분


public class Bronze2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        int[][] apt = new int[15][15];

        // 기본 값 셋팅
        for(int i = 0; i <= 14; i++) {
            apt[0][i] = i;
        }

        // 각 측의 값 추가
        for(int i = 1; i <= 14; i++) {
            for(int n = 1; n <= 14; n++) {
                apt[i][n] = apt[i - 1][n] + apt[i][n - 1];
            }
        }

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());

            System.out.println(apt[k][n]);
        }

        bf.close();
    }
}

/*
    입력 값
    1 - 테스트 케이스
    두쌍 씩 - 층, 호수

    0층
    i = i

    1층
    i =
 */