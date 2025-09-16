package src.main.java;
public class StringCompare { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        String a = "hello"; // 변수 선언 또는 초기화
        String b = "hello"; // 변수 선언 또는 초기화
        String c = new String("hello"); // 변수 선언 또는 초기화

        System.out.println("a == b: " + (a == b)); // 콘솔에 메시지 출력
        System.out.println("a == c: " + (a == c)); // 콘솔에 메시지 출력
        System.out.println("a.equals(c): " + a.equals(c)); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료