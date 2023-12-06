package Day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{3,4,2},{0,3,2},{0,2,2}};
        int[] answer = solution(arr,queries);

        System.out.println("result" + Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int index = 0;

        for(int[] query:queries){
            int[] newArray = new int[query[1]+1];
            System.arraycopy(arr, query[0], newArray, 0, query[1]+1-query[0]);
            int numA = query[2];

            int[] sortArray = Arrays.stream(newArray)
                    .filter(num -> num > numA)
                    .sorted()
                    .toArray();
            result[index] = sortArray.length == 0 ? -1 : sortArray[0];
            index++;
        }

        return result;
    }
}
