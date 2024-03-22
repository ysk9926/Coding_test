import Hash.Solution1;

public class Main {
    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution.solution(participant, completion));
    }
}