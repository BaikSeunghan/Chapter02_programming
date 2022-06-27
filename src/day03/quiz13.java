package day03;

public class quiz13 {

    // Q. 3진법 뒤집기
    // >> n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return
    public int solution(int n) {
        int answer = 0;

        // 10 --> 3
        String s = Integer.toString(n, 3);

        String[] splits = s.split("");
        String[] ss = new String[splits.length];
        String preAnswer = "";

        int count = splits.length - 1;

        for (int i = 0; i < splits.length; i++) {
            ss[i] = splits[(count)];
            preAnswer += ss[i];
            count--;
        }
        // 3 --> 10
        return answer = Integer.parseInt(preAnswer, 3);
    }
}
