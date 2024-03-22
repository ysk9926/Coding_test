package Hash;

import java.util.HashMap;

/**
 * 문제 : 정렬되어있지 않는 마라톤 참여자 배열과 완주자 배열을 받는다
 *        완주하지 못한 인원의 이름을 출력한다
 *
 * @ param String[] participant = ["leo", "kiki", "eden"] String[] completion = ["eden", "kiki"]
 * @ return String answer = "leo"
 * @ exception 동명이인이 있을 수 있음
 *
 * 풀이
 * 1. 참가자의 이름과 횟수를 가진 해시맵 생성
 * 2. 완주자의 이름을 순회하며 일치하는 이름의 횟수를 감소시킴
 * 3. 0이 아닌 이름을 반환
 */
public class Solution1 {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(String name : completion){
            map.put(name, map.get(name)-1);
        }
        
        String answer = "";

        for (String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
