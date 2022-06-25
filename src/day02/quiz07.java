package day02;

public class quiz07 {

    // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴

    public int[] solution(long n) {

        String[] splits = Long.toString(n).split(""); // --> 1 2 3 4 5 --> 5 4 3 2 1

        int[] answer = new int[splits.length];

        // length 는 5 , 마지막 인덱스는 4, 처음이 0
        int count = splits.length - 1;

        for (int i = 0; i < splits.length; i++) {
            answer[i] = Integer.parseInt(splits[(count)]);
            count--;

        }
        return answer;
    }
}
