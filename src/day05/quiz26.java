package day05;

public class quiz26 {

    // Q. 약수의 합
    // >> 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴

    public int solution(int n) {
        int answer = 0;

        // 약수값을 구하는 핵심로직
        for (int b = 1; b <= n; b++) {
            if (n % b == 0) {
                answer += b;
            }
        }

        return answer;
    }
}
