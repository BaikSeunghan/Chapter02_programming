package day06;

public class quiz33 {

    // Q. 체육복 -- 40점
    // >> n 전체 학생수, lost 도난당한 학생들의 번호, 여별 체육복 들고 온 학생들의 번호
    // 2 <= n <= 30
    // 1 <= lost[].length n <= n , lost
    // 1 <= reserve[].length n <= n
    // if lost안에 reserve가 있으면 -1

    // 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다 -> < n-1 n n+1

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            boolean flag = false;
            for (int j = 0; j < reserve.length; j++) {

                if (i != 0 && reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    if (flag) {
                        continue;
                    }
                    answer++;
                    flag = true;
                }
                // if lost안에 reserve가 있으면 -1
                if (lost[i] == reserve[j]) {
                    answer--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {};
        System.out.println("a = " + a[0]);
    }
}
