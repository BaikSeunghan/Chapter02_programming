package day02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class quiz08 {

    // 정수 내림차순으로 배치하기
    public long solution(long n) {

        List<String> list = new ArrayList<String>();

        String[] splits = Long.toString(n).split(""); // --> 1 2 3 4 5 --> 5 4 3 2 1
        for (String s : splits) {
            list.add(s);
            list.sort(Comparator.reverseOrder());
        }

        String answer = "";
        for (String a : list) {
            answer += a;
        }
        long l = Long.parseLong(answer);
        return l;
    }
    // 고수분의 코드
//    public class ReverseInt {
//        String res = "";
//        public int reverseInt(int n){
//            res = "";
//            Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//            return Integer.parseInt(res);
//        }
//
//        // 아래는 테스트로 출력해 보기 위한 코드입니다.
//        public static void  main(String[] args){
//            ReverseInt ri = new ReverseInt();
//            System.out.println(ri.reverseInt(118372));
//        }
//    }
}
