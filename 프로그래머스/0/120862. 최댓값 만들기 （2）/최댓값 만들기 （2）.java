class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1;j < numbers.length; j++){
                int sum = numbers[i] * numbers[j];
                if(sum > answer)
                    answer = sum;
            }
        }
        return answer;
    }
}