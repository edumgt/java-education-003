package src.main.java;
import java.util.regex.*; // 필요한 클래스 import

public class RegexExample { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        String input = "user@example.com"; // 변수 선언 또는 초기화
        String pattern = "^[\\w.-]+@[\\w.-]+\\.\\w+$"; // 변수 선언 또는 초기화

        boolean matches = Pattern.matches(pattern, input); // 값 대입
        System.out.println("이메일 형식 유효성 검사 결과: " + matches); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료