package day01;

import java.util.Arrays;
import java.util.HashMap;

public class quiz04 {

    // 완주하지 못한 선수의 이름을 return 하도록 -- X
    public String solution(String[] participant, String[] completion) {

        // HASH
//        String answer = "";
//
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0) {
//                answer = key;
//                System.out.println(answer);
//                break;
//            }
//        }
//        return answer;

        // sort 방법
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];

    }

}
