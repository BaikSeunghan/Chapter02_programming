package day01;

import java.util.Locale;

public class quiz05 {

    // 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴

    // 제한 상황
    // >> 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    // >> 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

    // 규칙찾기
    // split("")으로 단어별로 나눈다 -> 그다음 짝수 홀수 순서대로 대문자 소문자 로 초기화하고
    // 다시 붙여서 출력

    // 회고
    // >> 잘못된 접근이였다. 문자열 전체를 단어별이 아니라 index로 나눴어야했다

    public String solution(String s) {
//        내가한거
//        String answer = "";
//        String[] splits = s.split(" ");
//
//        String s1 = null;
//        for (int i = 0; i < splits[0].length(); i++) {
//            // 짝수
//            if (i % 2 == 0) {
//                s1 = String.valueOf(splits[0].charAt(i)).toUpperCase();
//            } else {
//                s1 = s1 + String.valueOf(splits[0].charAt(i));
//            }
//        }
//        return answer;

        // 일반고수
        // 제한 상황에서 힌트를 얻고 차근하게 나아가자
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(" ")) {   // 단어별 기준 정하는 부분
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }
}

//        // 개고수
//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//        for(String ss : array) {
//            System.out.println("ss = " + ss);
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//        return answer;
