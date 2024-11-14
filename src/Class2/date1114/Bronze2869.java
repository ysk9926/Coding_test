package Class2.date1114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(calculateDate(a, b, v));

        bf.close();

    }

    private static int calculateDate(int a, int b, int v) {
        // 정상에 도달한 후에는 미끄러지지 않으므로, 마지막 날은 a만큼 올라가는 것만 고려합니다.
        int effectiveHeight = v - b;
        int dailyClimb = a - b;

        // 필요한 일수를 계산하고, 나머지가 있으면 하루를 추가합니다.
        return (effectiveHeight + dailyClimb - 1) / dailyClimb;
    }
}


/*
    달팽이가 하루에 올라갈 수 있는 높이 a
    밤에 떨어지는 높이 b
    정상 v

    i날에 올라갈 수 있는 높이
    (a-b)*i

    위의 값들의 합이 정상보다 높은 날이 결과 값
 */