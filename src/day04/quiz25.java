package day04;

import java.util.ArrayList;
import java.util.List;

public class quiz25 {

    //    Q. 약수의 개수와 덧셈 -- o
    // >> L ~ F 까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    // >> 약수의 개수가 홀수인 수는 뺀 수를 return
    public int solution(int left, int right) {
        int answer = 0;

        int[] intList = new int[right - left + 1];

        List<Integer> yaksuList = new ArrayList<Integer>();
        for (int i = 0; i < intList.length; i++) {
            intList[i] = left;
            left++;

            // 약수값을 구하는 핵심로직
            for (int b = 1; b <= intList[i]; b++) {
                if (intList[i] % b == 0) {
                    yaksuList.add(b);
                }
            }
            if (yaksuList.size() % 2 == 0) {
                intList[i] = +intList[i];
                yaksuList.clear();
            } else if (yaksuList.size() % 2 != 0) {
                intList[i] = -intList[i];
                yaksuList.clear();
            }
        }

        for (int c : intList) {
            answer += c;
        }
        return answer;
    }

    // 나와 비슷한 코드
//    for( int i =left; i <= right; i++ ){
//
//        int count = 0;
//
//        for(int j = 1; j <= i; j++){
//
//            if( i%j == 0 )
//                count++;
//        }
//
//        if( count % 2 == 0)
//            answer += i;
//        else
//            answer -= i;
//    }
//
//        return answer;
}
