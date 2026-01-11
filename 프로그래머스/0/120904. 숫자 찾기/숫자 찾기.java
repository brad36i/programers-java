class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] strArr = String.valueOf(num).split("");
        String strK = String.valueOf(k);
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals(strK)){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}