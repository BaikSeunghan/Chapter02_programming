package day07;

import java.util.ArrayList;
import java.util.List;

public class quiz35 {

    //    Q. [1차] 비밀지도
//    1. int[] arr1, int[] arr2 index하나하나를 2진수를 바꾸고
//    2. 둘 중 하나라도 1이 있으면 # 아니면 ""
//    3. String[] = new String[n]
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] store = new String[n];
        String jinsu = "";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {

            // 구글링 검색 - 항상 보면 이해하기 쉽지만 생각하기엔 어렵다
            for (int j = arr1[i]; j > 0; j /= 2) {
                // 10진수를 2진수로 바꾼다.
                jinsu = String.valueOf(j % 2) + jinsu;
            }
            if (jinsu.length() == 4) {
                jinsu = "0" + jinsu;
            }
            list.add(jinsu);
            jinsu = "";
        }
        for (int i = 0; i < arr2.length; i++) {

            // 구글링 검색 - 항상 보면 이해하기 쉽지만 생각하기엔 어렵다
            for (int j = arr2[i]; j > 0; j /= 2) {
                // 10진수를 2진수로 바꾼다.
                jinsu = String.valueOf(j % 2) + jinsu;
            }
            if (jinsu.length() == 4) {
                jinsu = "0" + jinsu;
            }
            list.add(jinsu);
            jinsu = "";
        }


        for (int i = 0; i < store.length; i++) {
            answer[i] = store[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        String jinsu = "";
        int[] arr1 = {9, 20, 28, 18, 11};
        String[] answer = new String[arr1.length];
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {

            // 구글링 검색 - 항상 보면 이해하기 쉽지만 생각하기엔 어렵다
            for (int j = arr1[i]; j > 0; j /= 2) {
                // 10진수를 2진수로 바꾼다.
                jinsu = String.valueOf(j % 2) + jinsu;
            }
            // 앞에 0이 채워지지 않는다. 그래서 "0"을 더해서 해봤다. -> 값이 1인경우 1만 출력된다
            // 그럼 초기값은 00000으로 하고 하나씩 채우는 방식으로 해야하나? 그렇다면 그건 어떻게하지?
//            if (jinsu.length() == 4) {
//                jinsu = "0" + jinsu;
//            }
            if (jinsu.length() != 5) {
                int i1 = 5 - jinsu.length();
                String zero = "";
                for (int k = 0; k < i1; k++) {
                    zero += "0";
                }
                jinsu = "0" + jinsu;
            }
            list.add(jinsu);
            jinsu = "";
        }
        int[] arr2 = {30, 1, 21, 17, 28};
        for (int i = 0; i < arr2.length; i++) {

            // 구글링 검색 - 항상 보면 이해하기 쉽지만 생각하기엔 어렵다
            for (int j = arr2[i]; j > 0; j /= 2) {
                // 10진수를 2진수로 바꾼다.
                jinsu = String.valueOf(j % 2) + jinsu;
            }
            if (jinsu.length() != 5) {
                int i1 = 5 - jinsu.length();
                String zero = "";
                for (int k = 0; k < i1; k++) {
                    zero += "0";
                }
                jinsu = zero + jinsu;
            }
            list2.add(jinsu);
            jinsu = "";
        }
        // 넘어온 배열 2개를 2진수로 변경 완료
        // =============================================

        // 한번 거치고
        for (int i = 0; i < list.size(); i++) {
            String[] temp = new String[list.size()];
            temp[i] = list.get(i).replace("0", " ");
            answer[i] = temp[i].replace("1", "#");
        }
//        s =  #  #
//        s = # #
//        s = ###
//        s = #  #
//        s =  # ##
        // 두번거치면
        for (int i = 0; i < list2.size(); i++) {
            int count = 0;
            if (list2.get(i).charAt(count) == '1' && answer[i].charAt(count) == ' ') {
                count++;
                String replace = answer[i].replace(" ", "#");
                answer[i] = replace;
            }
        }
//        s = #####
//        s = # #
//        s = ###
//        s = #  #
//        s = #####

        for (String s : answer) {
            System.out.println("s = " + s);
        }

    }
}
