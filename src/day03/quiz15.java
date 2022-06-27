package day03;

import java.util.ArrayList;

public class quiz15 {

//    같은 숫자는 싫어
    public int[] solution(int[] arr) {

        // 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

        // 문제풀이
        // - response해야할 배열의 크기를 알 수 없기 때문에 ArrayList 형태의 인스턴스를 생성한다.
        // - int value값을 생성하여 이전값에 대해서 초기화 한다.
        // - 이전값과 비교하여 중복되지 않으면 값을 배열에 저장하고 같지 않으면 배열에 저장하지 않는다.
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }

        // 출처: https://cpdev.tistory.com/108 [하루하나:티스토리]
        // List<Integer> -> int[] 로 변환하는 방법  >> Java8 Stream 이용
        return answerList.stream().mapToInt(i -> i).toArray();


        // 고수분의 코드
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//        int preNum = 10;
//        for(int num : arr) {
//            if(preNum != num)
//                tempList.add(num);
//            preNum = num;
//        }
//        int[] answer = new int[tempList.size()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = tempList.get(i).intValue();
//        }
//        return answer;

    }
}
