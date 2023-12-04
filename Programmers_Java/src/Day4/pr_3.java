package Day4;

public class pr_3 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for(int i = 0;i<=n;i++){
                if(i%2==0){
                    answer += (int) Math.pow(i,2);
                    System.out.printf("%d + %d", answer, i);
                }
            }
            return answer;
        }
        for(int i = 0;i<=n;i++){
            if(i%2 !=0) {
                answer += i;
                System.out.printf("%d + %d", answer, i);
            }
        }
        return answer;
    }
}
