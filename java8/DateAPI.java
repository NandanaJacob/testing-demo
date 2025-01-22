package java8;

import java.time.*;

public class DateAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Local date = "+ld);

        System.out.println("date after 2 days = "+ld.plusDays(2));
        System.out.println("date after 3 months = "+ld.plusMonths(3));
        System.out.println("date before 4 days = "+ld.minusDays(4));
        //suppose we want to get a diff date, not now() ka date, we want to enter manually:
        LocalDate ld1 = LocalDate.of(2002, 6, 1);
        System.out.println("my birthday = " + ld1);
        System.out.println("is my birthday a leap year? : " + ld1.isLeapYear());

        //lets start local time interface
        LocalTime t = LocalTime.now(); //better than getting time in milliseconds like we did before in Date dt.getTime()
        System.out.println(t);
    }
}
