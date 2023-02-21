import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        /*int를 string 배열로 바꿔서 다시 int[]로*/
        String[] strings = String.valueOf(n).split(""); // {1,2,3}
        int[] ints = new int[strings.length];
        for(int i = 0; i<strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
            answer += ints[i];
        }

        return answer;
    }
}