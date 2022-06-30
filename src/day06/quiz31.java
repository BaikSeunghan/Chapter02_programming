package day06;

import java.util.ArrayList;
import java.util.List;

public class quiz31 {

    // Q. 소수 찾기 - o
    // >> 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수
    public int solution(int n) {
        int answer = 0;

        // 1 ~ n 사이의 숫자 넣고
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            intList.add(i);
        }
        for (int i = 0; i < intList.size(); i++) {
            if (isPrime(intList.get(i))) {
                answer++;
            }
        }
        return answer-1;
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        quiz31 quiz31 = new quiz31();

        int answer = 5;

        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= answer; i++) {
            intList.add(i);
            System.out.println("i = " + i);
        }

    }
}
