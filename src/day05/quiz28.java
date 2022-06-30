package day05;

import java.util.HashMap;

public class quiz28 {

    // Q. 최대공약수와 최소공배수 -- x (어려웠다)
    // >> 두 수의 최대공약수와 최소공배수를 반환하는 함수
    public int[] solution(int n, int m) {

        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd(big, small);
        // 최소 공배수는 입력받은 두 수의 곱에서 최대공약수를 나눠주면 끝난다.
        answer[1] = big * small / answer[0];

        return answer;
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
//        int[] answer = new int[2];
//        HashMap<Integer, Integer> nMap = new HashMap<>();
//        HashMap<Integer, Integer> mMap = new HashMap<>();
//
//        int nKey = 0;
//        int mKey = 0;
//        for (int i = 1; i <= n; i++) {
//            nKey++;
//            if (n % i == 0) {
//                nMap.put(nKey, i);
//            }
//        }
//        for (int i = 1; i <= m; i++) {
//            mKey++;
//            if (n % i == 0) {
//                mMap.put(mKey, i);
//            }
//        }
//
//        return answer;


    public static void main(String[] args) {

        quiz28 q = new quiz28();
        String a = "apple";
        int p = a.indexOf('p');
        System.out.println("p = " + p);  // 1 // 맨 처음값의 위치를 찾음

        String str3 = "총 비용은 $45.76";
        boolean ccc = true;
        String.valueOf(ccc); // String.valueOf()는 거의 모든 타입을 넣을 수 있다.
//        String.copyValueOf(); // String을 .split하고 String.copyValueOf(char[],시작,끝) String으로 리턴
        int a2 = str3.indexOf("$45.76");
        System.out.println("a2 = " + a2); // 6 // 문자열이 시작하는 위치를 찾음
    }
}
