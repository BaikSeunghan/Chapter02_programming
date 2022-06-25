package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quiz10 {

    // Q. 정수를 저장한 배열 arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
    // ** 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴

    // 접근
    // >> min_num을 설정하고, 인덱스를 리스트로 바꾸고 index끼리 비교를 해서 리턴할 값 제외하고
    // 다시 int정렬로 바꿔서 최종리턴

    // 제일 작은 수 제거하기
    public int[] solution(int[] arr) {

        //배열 길이가 1인 경우
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        //배열길이가 1보다 클 때
        //가장 작은 수를 뺀 길이로 초기화
        int[] answer = new int[arr.length-1];

        int min = arr[0]; //하나의 값을 기준으로 잡음.
        //제일 작은 수를 구한다.
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        //반복문 index 용
        int index = 0;

        //가장 작은 수를 제외한 배열 만들기
        for(int i=0; i<arr.length; i++){
            //배열의 값이 가장 작은 수라면
            if(arr[i] == min){
                //continue를 이용해 배열에 넣지 않고 넘어간다.
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;

        // 받아온 정수 배열을 List로 형번환
//        List<Integer> intList = new ArrayList<>();
//        for (int element : arr) {
//            intList.add(element);
//        }
//        if (intList.size() == 1) {
//            intList.set(0, -1);
//        } else {
//            int min_num = intList.get(0);
//
//            for (int i = 1; i < intList.size(); i++) {
//                if (intList.get(i) < min_num) {
//                    min_num = intList.get(i);
//                } else if (min_num == intList.get(i)) {
//                    Integer min_num_index = intList.get(i);
//                    intList.remove(min_num_index);
//                }
//            }
//        }
//        int min_num = intList.get(0);
//
//        for (int i = 0; i < intList.size(); i++) {
//            if (intList.get(i) < min_num) {
//                min_num = intList.get(i);
//                System.out.println("m = " + min_num);
//            } else if (min_num == intList.get(i)) {
//                Integer min_num_index = intList.get(i);
//                intList.remove(min_num_index);
//            }
////            for (int j = 0; j < intList.size(); j++) {
////                if (min_num == intList.get(j)) {
////                    Integer min_num_index = intList.get(j);
////                    intList.remove(min_num_index);
////                }
////            }
//        }
//        int[] answer = intList.stream().mapToInt(i -> i).toArray();
//        System.out.println("ints = " + Arrays.toString(answer));
//        return answer;

    }

}
