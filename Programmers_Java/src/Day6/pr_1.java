package Day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_1 {
    public static void main(String[] args) {
        int[][] numList = {{2, 1, 6},{5,2,1,7,5}};
        Stream<int[]> numListStream = Arrays.stream(numList);
        numListStream.forEach((numlist)->{
            int[] answer = solution(numlist);
            System.out.println(Arrays.toString(answer));

        });
    }
    public static int[] solution(int[] num_list) {
        int numA = num_list[num_list.length - 1];
        int numB = num_list[num_list.length - 2];
        int[] answer = new int[num_list.length + 1];

        // 기존 배열의 내용을 새로운 배열로 복사
        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        if(numA > numB){
            answer[answer.length - 1] = numA - numB;
        }
        if(numA <= numB){
            answer[answer.length - 1] = numA *2;
        }
        return answer;
    }
}
