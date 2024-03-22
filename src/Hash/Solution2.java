package Hash;

import java.util.HashMap;

/**
 * 문제 : 전화번호 리스트가 주어지고 한 번호가 다른번호의 접두어인 경우는 true 없다면 false 반환
 *
 * @ param String[] phone_book = ["119", "97674223", "1195524421"]
 * @ return boolean answer = false
 *
 * 풀이
 * 1. 각 번호들이 담겨있는 해시맵을 생성
 * 2.
 *
 */
public class Solution2 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String num : phone_book){
            map.put(num, 1);
        }

        for(String num : phone_book){
            for(int i = 1; i<num.length();i++){
                String prefix = num.substring(0, i);
                if(map.containsKey(prefix)){
                    return true;
                }
            }
        }

        return false;
    }
}
