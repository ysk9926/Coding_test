package Day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_4 {
    public static void main(String[] args) {

    }
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query:queries){
            int numA = arr[query[0]];
            int numB = arr[query[1]];
            arr[query[0]] = numB;
            arr[query[1]] = numA;
        }
        return arr;
    }
}
