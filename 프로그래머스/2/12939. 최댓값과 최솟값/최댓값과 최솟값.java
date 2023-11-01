import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
            String[] strings = s.split(" ");
            List<Integer> collect = Arrays.stream(strings).map(s1 -> Integer.parseInt(s1)).sorted().collect(Collectors.toList());
        
        return String.valueOf(collect.get(0)) + " " + String.valueOf(collect.get(collect.size()-1));
    }
}