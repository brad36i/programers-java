import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new LinkedHashSet<>();
        int x = 2;
        while(x <= n){
            if(n % x == 0){
                set.add(x);
                n /= x;
            }
            else{
                x++;
            }
        }
        answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}