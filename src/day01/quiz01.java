package day01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class quiz01 {

    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
//        System.out.println("date.getClass().getName() = " + date.getClass().getName());
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return answer;
    }


    // 문제 풀이
//    1월 1일이 금요일 이므로, 금요일부터 시작하여 요일 이름을 저장.
//    모든 날짜를 더해 % 7로 나눠준다.
//    배열은 0부터 시작이므로 a - 1까지 모든 월의 일수를 더한다.
//    b - 1을 더함으로 1월 1일부터 a월 b일까지 모든 날짜를 더한 값을 얻는다.

    // 구글링 답안 코드
    class Solution {
        public String solution(int a, int b) {
            String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
            int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int date = 0;
            for (int i = 0; i < a - 1; i++) {
                date += month[i];
            }
            date += b - 1;
            return day[date % 7];
        }
    }
}
