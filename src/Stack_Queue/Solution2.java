package Stack_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  문제 : 진행상황과 하루 진행률을 배열로 받는다
 *         뒤의 프로젝트가 완료가 되더라도 배열의 순서대로 배포가 가능하며
 *         앞의 프로젝트가 배포될때 이미 완성된 뒤의 프로젝트도 같이 배포가 된다
 *         각 배포일마다 몇개의 프로젝트가 배포되는지 배열로 반환하라
 *
 * @ param int[] progress = [93, 30, 55] int[] speeds = [1, 30, 5]
 * @ return int[] result = [2, 1]
 *
 * 풀이
 * 1. 각 프로젝트마다 완성일에 대한 배열 생성
 * 2.
 */
public class Solution2 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i<progresses.length; i++){
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            System.out.println("remain = " + remain + "days = " + days);
            if(remain % speeds[i] != 0){
                days++;
            }
            queue.offer(days);
            System.out.println("queue = " + queue.toString());
        }

        while (!queue.isEmpty()){
            int count = 1;
            int current = queue.poll();

            // 현재 작업이 뒤에 오는 작업들보다 오래 걸리는지 확인
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }
            answerList.add(count);
        }

        System.out.println("answerList Size = " + answerList.size());
        int[] answer = new int[answerList.size()];
        for (int i = 0; i <answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
