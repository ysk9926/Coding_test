package Stack_Queue;

import java.util.Stack;

/**
 * 문제 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거 후, 남은 수들을 배열arr의 원소 순서 유지하며 반환
 *
 * @ param arr = [1, 1, 3, 3, 0, 1, 1 ]
 * @ return result = [1, 3, 0, 1]
 *
 * 풀이
 * 1. 결과를 받아올 stack 생성
 * 2. 맨 위의 인자를 불러와 현재 숫자와 비교하여 같지 않으면 스택에 추가
 * 3. stack을 배열로 변환하여 반환
 */
public class Solution1 {
    public int[] solution(int []arr) {

        Stack<Integer> st = new Stack();
        for (int num : arr) {
            if (st.isEmpty() || st.peek() != num) {
                st.push(num);
            }
        }

        int[] answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }


        return answer;
    }
}