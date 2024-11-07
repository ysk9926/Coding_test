package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public int solution(int[][] edges) {

        int createEdge = create(edges);

        return 0;
    }

    // 생성 점 찾기
    private int create(int[][] edges) {
        // 출발 지점 생성
        Set<Integer> startEdge = new HashSet<>();
        // 도착 지점 생성
        Set<Integer> endEdge = new HashSet<>();

        for (int[] edge : edges) {
            startEdge.add(edge[0]);
            endEdge.add(edge[1]);
        }

        for (int start : startEdge) {
            if (!endEdge.contains(start)) {
                return start;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution2 pro = new Solution2();
    }
}


// 도넛 -> n-1개를 방문하면 자기자신한테 돌아옴
// 막대 -> n-1개를 방문 가능하며 돌아올 수 없음
// 8자  -> 2n + 2 개의 간선이 있다

//