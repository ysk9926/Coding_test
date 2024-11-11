package Class2.date1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 최대공약수와 최소공배수 계산
        int gcd = getGCD(a, b);
        int lcm = getLCM(a, b, gcd);

        // 결과 출력
        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 최대공약수 계산 (유클리드 호제법)
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수 계산
    private static int getLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
