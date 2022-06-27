package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class quiz20 {

    // Q. 문자열 내림차순으로 배치하기
    // >> 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수

    public String solution(String s) {
        // 1~3
        String answer = "";

        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        for (String part : split) {
            answer += part;
        }

        return answer;
    }

    // 고수의 코드 - 0.5 언더
//    char[] sol = s.toCharArray();
//    Arrays.sort(sol);
//    return new StringBuilder(new String(sol)).reverse().toString();

//    new StringBuilder(a).reverse().toString(); - 다음엔 이런걸 잘 써보자
}
