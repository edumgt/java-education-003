package src.main.java;
public class Hexadecimal { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        int number = 1255; // 변수 선언 또는 초기화
        String hex = Integer.toHexString(number); // 변수 선언 또는 초기화
        System.out.println("10진수: " + number); // 콘솔에 메시지 출력
        System.out.println("16진수: " + hex.toUpperCase()); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료