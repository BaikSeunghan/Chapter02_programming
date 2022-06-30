package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class quiz30 {

    // Q. 나머지가 1이 되는 수 찾기
    // >> n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
    public int solution(int n) {

        List<Integer> intList = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i  == 1) {
                intList.add(i);
            }
        }

        intList.sort(Comparator.naturalOrder());

        return intList.get(0);
    }
    // List 사용없이 더 간단하게
//    int answer = 0;
//        for (int i=2; i<n; i++) {
//        if (n % i == 1) {
//            answer = i;
//            break;
//        }
//    }
//        return answer;

}
