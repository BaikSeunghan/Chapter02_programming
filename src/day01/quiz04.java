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
//         HashMap의 put은 key가 존재하면 value를 새로운 값으로 바꿔주기때문에 같은 방식으로 한다.
//         완주 배열에 있을 경우 1 - 1 = 0 (단, 동명이인이라면 2,3,4...)
//         완주 배열에 없을 경우 value값 변경없이 그대로 1
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0) {

//            if (hm.get(key) == 1) { // 나는 이렇게 해봤지만, != 0 쪽이 미세하지만 더 빠르고 효율이 좋다
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
