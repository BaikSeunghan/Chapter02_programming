package day07;

public class Test220630 {

//    Q. 자연수 뒤집어 더하기
//    자연수 n의 각 자리 숫자를 뒤집은 순서로 더해 출력하는 수식을 리턴해주세요.
//    예를들어 n이 12345이면 "5+4+3+2+1=15" 라는 문자열을 리턴합니다.

    public String solution(int n) {
//        공부를 했다면 이렇게 간단하게 풀었을 것이다.
//        String temp = n + "";   // String으로 형변환
//        StringBuffer sb = new StringBuffer(temp);
//        String[] split = sb.reverse().toString().split("");// 뒤집고 문자열 배열로
//        int sum = 0;
//        for (String s : split) {
//            sum += Integer.parseInt(s);
//            sum += String.valueOf(s);
//        }
//        return String.join("+", split) + "=" + sum;
//        ===========================================================

//        시험 볼때 푼 코드
        String[] split = Integer.toString(n).split("");
        int length = split.length;
        int sum = 0;
        String[] answer = new String[split.length];
        String result = "";

        for (int i = 0; i < split.length; i++) {
            // answer[] 배열에 뒤집어서 넣기
            answer[i] = split[length - 1];
            length--;
            // 모든 숫자를 더한 값 sum
            sum += Integer.parseInt(answer[i]);
        }

        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1) {
                result += answer[i] + "=" + sum;
            } else {
                result += answer[i] + "+";
            }
        }
        return result;

        // 공부하면서 얻은 것
//        return String.join("+", sb) + "=" + sum; //  훨씬 편하다

    }

    public static void main(String[] args) {
//        int n = 12345;
//        String[] split = Integer.toString(n).split("");
//        int length = split.length;
//        int sum = 0;
//        String[] answer = new String[split.length];
//        String result = "";
//
//        for (int i = 0; i < split.length; i++) {
//            // answer[] 배열에 뒤집어서 넣기
//            answer[i] = split[length - 1];
//            length--;
//            // 모든 숫자를 더한 값 sum
//            sum += Integer.parseInt(answer[i]);
//        }
//
//        for (int i = 0; i < answer.length; i++) {
//            if (i == answer.length - 1) {
//                result += answer[i];
//            } else {
//                result += answer[i] + "+";
//            }
//        }
//
//        System.out.println("result = " + result);
//        System.out.println("result = " + result + "=" + sum);

        Test220630 test02 = new Test220630();
        System.out.println("test02.solution(12345 = " + test02.solution(718253));

        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        StringBuffer sb1 = sb.append("ZZ");
        System.out.println("sb1 = " + sb1);
        if (sb == sb1) {                // append는 추가하고, StringBuffer의 참조를 반환
            System.out.println("true"); // --> true (sb == sb1)
        } else {
            System.out.println("false");
//        }
        }
    }
}
