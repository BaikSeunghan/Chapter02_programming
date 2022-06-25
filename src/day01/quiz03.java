package day01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class quiz03 {

    public String solution(int n) {
        String supark = "";
        for (int i = 0; i < 5; i++) {
            supark += "수";
            if (supark.substring(i) != null) {
                supark += "박";
            }
        }
        System.out.println("supark = " + supark);
        return supark.substring(0,n);
    }
}
