class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int answerindex = 0;
        if(n == 1){
            answer = new int[slicer[1] + 1];
            for(int i =0; i <= slicer[1]; i++){
                answer[answerindex] = num_list[i];
                answerindex++;
            }
        }
        else if(n == 2){
            answer = new int[num_list.length - slicer[0]];
            for(int i = slicer[0]; i < num_list.length; i++){
                answer[answerindex] = num_list[i];
                answerindex++;
            }
        }
        else if(n == 3){
            answer = new int[slicer[1] - slicer[0] + 1];
            for(int i = slicer[0]; i <= slicer[1]; i++){
                answer[answerindex] = num_list[i];
                answerindex++;
            }
            
        }
        else if(n == 4){
            String str = "";
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                str += "d";
            }
            answer = new int[str.length()];
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                answer[answerindex] = num_list[i];
                answerindex++;
            }
            
        }
        return answer;
    }
}