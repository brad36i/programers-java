

import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] stringarr = my_string.split("");
        Arrays.sort(indices);
        int index = 0;
        for(int i = 0; i < stringarr.length; i++){
            if(index < indices.length && indices[index] == i){
                index++;
                continue;
            }
           answer += stringarr[i];
        }
        return answer;
    }
}