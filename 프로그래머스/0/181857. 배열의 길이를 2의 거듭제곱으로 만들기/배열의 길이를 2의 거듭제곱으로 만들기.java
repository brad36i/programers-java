import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        int[] twos = new int[11];
        twos[0] = 1;
        for(int i = 1; i <= 10; i++){
            twos[i] = twos[i - 1] * 2;
        }
        for(int i = 0; i <= 10; i++){
            if(twos[i] == arr.length){
                break;
            }
            else if(twos[i] > arr.length){
                int k = arr.length;
                for(int j = k; j < twos[i]; j++){
                    list.add(0);
                }
                break;
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}