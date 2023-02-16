import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        String[] temp = sb.reverse().toString().split("");
        int[] answer = new int[temp.length];
        for(int i= 0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(temp[i]);
        }

        return answer;
    }
}