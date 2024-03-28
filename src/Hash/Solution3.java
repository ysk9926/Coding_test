package Hash;

import java.util.HashMap;

public class Solution3 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for(String[] cloth : clothes) {
            String type = cloth[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        System.out.printf("clothesMap = %s \n", clothesMap);

        int answer = 1;
        for(int count : clothesMap.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution.solution(clothes1));
        System.out.println(solution.solution(clothes2));
    }
}
