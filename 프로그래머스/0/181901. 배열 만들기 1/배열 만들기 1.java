import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int knum = k;
        while(n >= knum){
            list.add(knum);
            knum += k;
        }
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}