import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) < 95){
                answer += String.valueOf(a.charAt(i)).toLowerCase();
            }
            else{
                answer += String.valueOf(a.charAt(i)).toUpperCase();
            }
        }
        
        
        System.out.println(answer);
    }
}