package Day_2;

public class pr_5 {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] myStringArr = my_string.toCharArray();
        char[] overWriteArr = overwrite_string.toCharArray();

        for(int i = 0;i<overWriteArr.length;i++){
            myStringArr[i+s] = overWriteArr[i];
        }
        return new String(myStringArr);
    }
}
