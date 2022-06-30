package day04;

public class quiz23 {

    // Q. 시저 암호
    // >> 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수

    public String solution(String s, int n) {
        String answer = "";
        char[] splits = s.toCharArray();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < splits.length; i++) {
                if (splits[i] == ' ') {
                    continue;
                } else if (splits[i] == 'z' || splits[i] == 'Z') { // 나는 그냥 +1만 했었다. )
                    splits[i] -= 26;

                }
                splits[i] += 1;
            }
        }

        for (char split : splits) {
            answer += split;
        }
        return answer;
    }
}
