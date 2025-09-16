package src.main.java;
public class SwitchCase { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        int day = 6; // 변수 선언 또는 초기화
        switch (day) {
            case 1: System.out.println("월요일"); break; // 콘솔에 메시지 출력
            case 2: System.out.println("화요일"); break; // 콘솔에 메시지 출력
            case 3: System.out.println("수요일"); break; // 콘솔에 메시지 출력
            default: System.out.println("기타 요일"); // 콘솔에 메시지 출력
        } // 코드 블록 종료
    } // 코드 블록 종료
} // 코드 블록 종료