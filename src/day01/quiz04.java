package day01;

import java.util.ArrayList;
import java.util.List;

public class quiz04 {

    // 완주하지 못한 선수의 이름을 return 하도록
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        // 완주자 리스트 요소 하나하나가 참가자 리스트 요소에 한번씩돌고 그다음 돌고
        for (int i = 0; i < participant.length; i++) {
            boolean flag = true;
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    completion[j] = null;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer += participant[i];
            }
        }
        return answer;
    }

}
