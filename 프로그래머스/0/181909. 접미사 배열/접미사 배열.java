import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i));
        }
        list.sort(String::compareTo);
        answer = list.toArray(new String[0]);
        return answer;
    }
}