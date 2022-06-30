package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz29 {

    // Q. K번째수
    // >>

    // 1. i번째 숫자부터 j번째 숫자까지 자르고 정렬
    public int[] solution(int[] array, int[][] commands) {

        // 비슷한 느낌의 다른 사람 문제 풀이
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int a, b, c;
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int[] temp = Arrays.copyOfRange(array, a - 1, b);
            // 더 짧게
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
            answer[i] = temp[c - 1];
        }
        return answer;

        // 나랑 90프로 비슷한
//        int[] answer = new int[commands.length];
//        int a = 0;
//        for(int[] info : commands){
//            int i = info[0];
//            int j = info[1];
//            int k = info[2];
//
//            int[] buf = Arrays.copyOfRange(array,i-1,j);
//            Arrays.sort(buf);
//            answer[a] = buf[k-1];
//            a++;
//        }
//
//        return answer;

        // 내 풀이
//        int[] answer = new int[commands.length];
//        int start = 0;
//        int end = 0;
//        int pick = 0;
//        int[] temp = {};
//        int z = 0;
//
//        List<Integer> list = new ArrayList<>();
//        for (int[] command : commands) {
//            start = command[0];
//            end = command[1];
//            pick = command[2];
//
//            // 2. s~e 추출 -> 정렬 -> pick
//            for (int i = start; i <= end; i++) {
//                temp = new int[end - start + 1];
//                z = 0;
//                temp[z] = start;
//                z++;
//            }
//            Arrays.sort(temp);
//            list.add(temp[pick]);
//        }
//        answer = list.stream().mapToInt(i -> i).toArray();
//        return answer;
    }
}
