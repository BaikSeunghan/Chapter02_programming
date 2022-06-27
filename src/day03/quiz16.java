package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class quiz16 {

    // Q. 두 개 뽑아서 더하기
    // >> 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
    // >> 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return

    public int[] solution(int[] numbers) {

        // 구글링 답안
        ArrayList<Integer> list = new ArrayList<>();

        int result = 0;

        // 핵심 로직
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result = numbers[i] + numbers[j];
                if (!list.contains(result)) {
                    list.add(result);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
    // 내 답안
//        int[] answer = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (i != (numbers.length-1) ) {
//                answer[i] = numbers[i] + numbers[i + 1];
//            }
//        }
//        IntStream distinct = Arrays.stream(answer).distinct();
//        answer = distinct.toArray();
//        Arrays.sort(answer);
//
//        return answer;
}
