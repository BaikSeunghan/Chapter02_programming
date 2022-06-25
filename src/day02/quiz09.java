package day02;

public class quiz09 {

    // 정수 제곱근 판별
    public long solution(long n) {
        long answer = 0;

        // 자바에서 특정값의 제곱근(루트)을 구하려면 java.lang.Math 클래스의 sqrt()메소드를 사용
        // 반환 타입은 double이기 때문에 long으로 형변환
        long x = (long)Math.sqrt(n);
        if (n == x * x) {
            answer = (x + 1) * (x + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
