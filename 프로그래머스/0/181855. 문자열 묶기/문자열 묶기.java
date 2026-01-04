class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] intArr = new int[30];
        for(String str : strArr){
            intArr[str.length() - 1]++;
            if(answer < intArr[str.length()-1]){
                answer = intArr[str.length()-1];
            }
        }
        return answer;
    }
}