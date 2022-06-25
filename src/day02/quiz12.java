package day02;

public class quiz12 {

    // 하샤드 수
    public boolean solution(int x) {

        boolean answer = true;
        int b = 0;
        String[] a = Integer.toString(x).split("");
        for (String aa : a) {
            b += Integer.parseInt(aa);
        }
        if (x % b != 0) {
            answer = false;
        }

        return answer;
    }
}
