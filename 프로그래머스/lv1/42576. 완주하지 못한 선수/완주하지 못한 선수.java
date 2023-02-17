import java.util.*;
import java.util.stream.*;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> lParticipant = (List<String>) Arrays.asList(participant).stream().sorted().collect(Collectors.toList());
        List<String> lCompletion = (List<String>) Arrays.asList(completion).stream().sorted().collect(Collectors.toList());

        int iCompSize = lCompletion.size();
        int idx = lParticipant.size()-1;;

        for(int i = 0; i < iCompSize ; i++ ) {
            if(!lCompletion.get(i).equals(lParticipant.get(i))) {
                idx = i;
                break;
            }
        }

        answer = lParticipant.get(idx);

        return answer;
    }
}