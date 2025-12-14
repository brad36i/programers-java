import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        if(n % 2 != 0){
            str += n + " is odd"; 
        }
        else{
            str+= n + " is even";
        }
        System.out.println(str);
    }
}