package Day5;

public class pr_2 {
    public int solution(int a, int d, boolean[] included) {
        int aCnt = 0;
        int bCnt = 0;
        for(int i = 0; i < included.length; i++){
            if(included[i]){
                aCnt++;
                bCnt+=i;
            }
        }

        return aCnt * a + bCnt * d;
    }
}
