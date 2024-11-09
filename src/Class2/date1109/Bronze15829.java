package Class2.date1109;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 23분

public class Bronze15829 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열의 길이
        int L = scanner.nextInt();
        scanner.nextLine();

        // 문자열
        String inputString = scanner.nextLine();

        System.out.println(hashing(L, inputString));

        scanner.close();


    }

    private static int hashing(int L, String inputString) {
        int PRIME = 31;
        int MOD = 1234567891;

        // 알파벳 해시맵 생성
        Map<Character, Integer> alphabetMap = new HashMap<>();

        for(char c = 'a'; c <=  'z'; c++) {
            alphabetMap.put(c, c - 'a' + 1);
        }

        int result = 0;
        int power = 1;

        for(int i = 0; i < L; i++) {
            char currentChar = inputString.charAt(i);
            int value = alphabetMap.get(currentChar);

            result = (result + value * power) % MOD; // 모듈러 연산 적용
            power = (power * PRIME) % MOD; // 31^i를 효율적으로 계산하면서 모듈러 연산 적용
        }

        return result;
    }
}


/*

    1. a~z의 알파벳을 1~26으로 저장
    2. 입력값을 받아옴
        첫 줄 : 문자열의 길이
        둘쨋 줄 : 문자
    3. 각 문자를 위에서 지정한 해시맵을 통해 숫자로 변형하고 31을 곱하여 해시값을 추출
    4. 추출된 해시값 반환
 */