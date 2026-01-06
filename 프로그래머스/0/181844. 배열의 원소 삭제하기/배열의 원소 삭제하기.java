import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int exist = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(delete_list[j] == arr[i]){
                    exist = 1;
                }
            }
            if(exist == 0){
                list.add(arr[i]);
            }
            exist = 0;
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}