package Day5;

public class pr_1 {
    public String solution(String code) {
        boolean mode = false;
        char[] codeArr = code.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < codeArr.length; i++){
            char ch = codeArr[i];
            if(ch == '1'){
                mode = !mode;
                continue;
            }
            if(!mode){
                if(i % 2 == 0 ){
                    result.append(codeArr[i]);
                }
            }
            if(mode){
                if(i % 2 != 0){
                    result.append(codeArr[i]);
                }
            }
        }
        if (result.length() == 0) {
            return "EMPTY";
        }

        return result.toString();
    }
}
