package Day5;

public class pr_3 {
    public int solution(int a, int b, int c) {
        int sameCnt = countSameCnt(a, b, c);

        if(sameCnt == 0){
            return case1(a, b, c);
        }
        if(sameCnt == 2){
            return case2(a, b, c);
        }
        return case3(a, b, c);

    }

    public int countSameCnt(int a, int b, int c) {
        int sameCnt = 0;

        if (a == b) {
            sameCnt++;
        }
        if (a == c) {
            sameCnt++;
        }
        if (b == c) {
            sameCnt++;
        }

        return sameCnt;
    }

    public int case1 (int a, int b, int c){
        return a + b + c;
    }

    public int case2 (int a, int b, int c){
        return (a + b + c) * ((int) Math.pow(a,2) + (int) Math.pow(b,2) + (int) Math.pow(c,2)) ;
    }

    public int case3 (int a, int b, int c){
        return (a + b + c) * ((int) Math.pow(a,2) + (int) Math.pow(b,2) + (int) Math.pow(c,2)) * ((int) Math.pow(a,3) + (int) Math.pow(b,3) + (int) Math.pow(c,3)) ;
    }
}
