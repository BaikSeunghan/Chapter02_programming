package day04;

public class quiz21 {

    // Q. 소수 만들기
    // >> nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return

    // Is_Prime메서드는 입력받은 파라미터의 약수의 갯수를 반환

    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int z = j + 1; z < nums.length; z++) {
                    temp = nums[i] + nums[j] + nums[z];
                    boolean prime = isPrime(temp);

                    if (prime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public Boolean isPrime2(int num){
//        int cnt = 0;
//        for(int i = 1; i <= (int)Math.sqrt(num); i ++){ // 제곱근까지만 돌아도 된다는 멋진 접근
//            if(num % i == 0) cnt += 1;
//        }
//        return cnt == 1;
//    }

//    private static int isPrime3(int num) {
//        int count = 0;
//
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0)
//                count += 1;
//            if (count >= 3)
//                return count;
//        }
//
//        return count;
//    }

    public static void main(String[] args) {
        quiz21 q = new quiz21();
        int[] a = {1, 2, 3, 4};
        System.out.println("q.solution() = " + q.solution(a));


    }
}
