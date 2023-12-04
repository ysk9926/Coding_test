package Day4;

public class pr_4 {
    public int solution(String ineq, String eq, int n, int m) {
        String comparison = ineq + eq;
        if(comparison.equals(">=")){
            return n >= m ? 1: 0;
        }
        if(comparison.equals("<=")){
            return n <= m ? 1 : 0;
        }
        if(comparison.equals(">!")){
            return n > m ? 1: 0;
        }
        return n < m ? 1: 0;
    }
}
