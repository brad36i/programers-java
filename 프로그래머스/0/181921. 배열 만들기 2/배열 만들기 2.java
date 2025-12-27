import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int[] five = new int[65];
        for(int i = 0; i < 65; i++){
            five[i] = Integer.valueOf(Integer.toBinaryString(i+1))*5;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 65; i++){
            if(five[i] >= l && five[i] <= r){
                list.add(five[i]);
            }
        }
        if(list.size() == 0 ){
            list.add(-1);
        }
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}