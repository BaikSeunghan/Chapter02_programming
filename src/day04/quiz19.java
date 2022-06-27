package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class quiz19 {

    // Q. 문자열 내 마음대로 정렬하기
    public String[] solution(String[] strings, int n) {

        // 내 코드
//        char[] list = {};
//        for (int i = 0; i < strings.length; i++) {
//            list[i]=(strings[i].charAt(n));
//        }
//        Arrays.sort(list);
//
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].contains("list[i]")) {
//                answer[i] = strings[i];
//            }
//        }
//        Arrays.sort(answer);
//
//        return answer;

        // 다른 사람 (구글링)
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (strings[i].charAt(n) + strings[i]);
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
