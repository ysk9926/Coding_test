package Heap;

import java.util.PriorityQueue;

/**
 * 문제 : 여러 음식의 스코빌 지수가 담긴 배열을 제공
 *        스코빌지수가 제공된 k 값보다 낮으면 낮은 음식끼리 섞어서 모든 음식이 k보다 스코빌 지수가 높도록 만든다
 *        음식을 섞은 횟수를 반환
 *
 * @ params int[] scoville = [1, 2, 3, 9, 10, 12] int k = 7
 * @ return int answer = 2
 *
 * 풀이
 * 1. 받은 배열을 heap에 넣어서 heap생성
 * 2. 우선순위가 높은 값을 꺼내와 k보다 낮다면 첫번째와 두번쨰 음식을 꺼내서 새로운 음식 제조
 * 3. k보다 낮은 스코빌 지수가 없을때까지 반복
 */
public class Solution1 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int s : scoville){
            priorityQueue.offer(s);
        }

        int mixCount = 0;

        while (priorityQueue.peek() < K){
            if(priorityQueue.size() == 1){
                return -1;
            }

            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            int newScoville = first + 2*second;
            priorityQueue.offer(newScoville);
            mixCount++;

        }

        return mixCount;
    }
}
