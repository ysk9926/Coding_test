package Day5;

public class pr_4 {
    public int solution(int[] num_list) {
        int sum = 0;
        int square = 0;
        int product = 1;

        for(int num:num_list){
            sum += num;
            product = product * num;
        }

        square = (int) Math.pow(sum,2);

        System.out.printf("%d %d", square, product);
        return square > product ? 1 : 0;
    }
}
