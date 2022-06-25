package day01;

public class quiz06 {

    public int solution(int n) {
        int answer = 0;

        String[] a = Integer.toString(n).split("");
        for (String aa : a) {
            answer += Integer.parseInt(aa);
        }
        return answer;
    }
}
