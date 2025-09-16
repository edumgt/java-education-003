package src.main.java;
public class FinalKeyword { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        final int MAX = 100; // 변수 선언 또는 초기화
        // MAX = 200; // 오류 발생
        System.out.println("최댓값: " + MAX); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료