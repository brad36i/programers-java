import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        Integer[] intArr = new Integer[score.length];
        int[] intArr2 = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            intArr[i] = score[i][0] + score[i][1];
            intArr2[i] = score[i][0] + score[i][1];
        }
        
        Arrays.sort(intArr, Collections.reverseOrder());
        int rank = 1;
        int[] rankArr = new int[score.length];
        rankArr[0] = rank;
        for(int i = 1; i < intArr.length; i++){
            if(intArr[i] == intArr[i-1])
                rankArr[i] = rankArr[i-1];
            else{
                rankArr[i] = i + 1;
            }
        }
        
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr.length; j++){
                if(intArr[j] == intArr2[i]){
                    intArr2[i] = rankArr[j];
                    break;
                }
            }
        }
        answer = intArr2;
        return answer;
    }
}