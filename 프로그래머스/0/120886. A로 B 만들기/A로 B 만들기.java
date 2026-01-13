import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] bArr = before.split("");
        String[] aArr = after.split("");
        int length = before.length();
        int match = 0;
        int out = 0;
        for(int i =0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(bArr[i].equals(aArr[j])){
                    aArr[j] = null;
                    match++;
                    break;
                }
                else if(j == length -1)
                    out = 1;
            }
            if(out == 1)
                break;
        }
        if(match == length){
            answer = 1;
        }
        
        return answer;
    }
}