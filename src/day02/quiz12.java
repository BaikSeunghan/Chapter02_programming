package day02;

public class quiz12 {

    // 하샤드 수
    public boolean solution(int x) {

        boolean answer = true;
        int abc = 0;
        String[] a = Integer.toString(x).split("");
        for (String aa : a) {
            abc += Integer.parseInt(aa);
        }
        if (x % abc != 0) {
            answer = false;
        }

        return answer;
    }
}
