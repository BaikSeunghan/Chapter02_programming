package day01;


public class quiz03 {

    public String solution(int n) {

        String supark = "";

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                supark += "수";
            } else {
                supark += "박";
            }

        }
        return supark;

        // 더 깔끔하게
//        for (int i = 0; i < n; i++) {
//            supark += i % 2 == 0 ? "수" : "박";
//        }
//        return supark;
    }
}
