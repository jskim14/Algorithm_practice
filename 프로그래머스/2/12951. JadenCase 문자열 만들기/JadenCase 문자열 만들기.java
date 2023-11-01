import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
        public String solution(String s) {
            String[] strings = s.split(" ", -1);

            return Arrays.stream(strings)
                    .map(s1 -> capitalizeWord(s1))
                    .collect(Collectors.joining(" "))
                    ;
        }

        public String capitalizeWord(String word)
        {
            if (word.equals("") || word.length() == 0) {
                return word;
            }
            return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
    }
