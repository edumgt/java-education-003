package src.main.java;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        double amount = 1234567.89; // 포맷할 숫자

        NumberFormat defaultFormat = NumberFormat.getInstance(); // 기본 숫자 형식
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // 통화 형식
        NumberFormat percentFormat = NumberFormat.getPercentInstance(); // 백분율 형식
        NumberFormat germanFormat = 
        NumberFormat.getInstance(Locale.CHINA); // 독일 형식

        System.out.println("기본 숫자 형식: " + defaultFormat.format(amount)); // 기본 포맷 출력
        System.out.println("통화 형식: " + currencyFormat.format(amount)); // 통화 포맷 출력
        System.out.println("백분율 형식: " + percentFormat.format(0.75)); // 백분율 포맷 출력
        System.out.println("독일 숫자 형식: " + germanFormat.format(amount)); // 로케일 적용 포맷 출력
    }
}