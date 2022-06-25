package day01;

import java.util.ArrayList;
import java.util.List;

public class quiz02 {

    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
    public List solution(int divisor) {

        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3, 2, 6};

        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % divisor == 0) {
                answer.add(arr3[i]);
            } else if (answer.size() == 0) {
                answer.add(-1);
            }
        }
        return answer;
    }
}
