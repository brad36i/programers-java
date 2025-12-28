import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            num = Integer.valueOf(intStrs[i].substring(s, s + l));
            if(k < num){
                list.add(num);
            }
        }
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}