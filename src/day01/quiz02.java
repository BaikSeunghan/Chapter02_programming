package day01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz02 {

    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
    public int[] solution(int[] arr, int divisor) {

        int[] answer = {};

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }

        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);

        return answer;
    }

    // 고수 코드
//    int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//    if(answer.length == 0) answer = new int[] {-1};
//    Arrays.sort(answer);
//    return answer;
}
