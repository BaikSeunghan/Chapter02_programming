package day02;

public class quiz11 {

    // 콜라츠 추측
//    1-1. 입력된 수가 짝수라면 2로 나눕니다.
//    1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//    2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    public int solution(int num) {
        // 나의 코드 -- 실패ㅎㅎㅎ..
        int answer = 0; //
        if (num == 1) {
            answer = -1;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            answer++;

        }
        if (answer == 500) {
            answer = -1;
        }
        return answer;

        // 다른분의 코드
//        int answer = 0;
//        int a = num;
//
//        while(a != 1 && answer != 500){
//            if(a % 2 == 0){
//                a = a/2;
//            } else if(a %2==1){
//                a = (a*3) + 1;
//            }
//            answer++;
//        }
//        if(answer == 500) {
//            answer = -1;
//        }
//
//        return answer;

        // 1등 코드
//        public int collatz(int num) {
//            long n = (long)num;
//            for(int i =0; i<500; i++){
//                if(n==1) return i;
//                n = (n%2==0) ? n/2 : n*3+1;
//            }
//            return -1;


    }

}
