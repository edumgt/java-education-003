package src.main.java;
public class TryCatch { // 예외 처리 예제 클래스 정의
    public static void main(String[] args) { // 프로그램 진입점
        try {
            // 예외 발생 가능 코드: 0으로 나누는 연산은 산술 예외 발생
            int result = 10 / 0;
            System.out.println("결과: " + result); // 이 줄은 실행되지 않음
        } catch (ArithmeticException e) {
            // ArithmeticException: 0으로 나눌 때 발생하는 예외
            System.out.println("예외 발생: " + e.getMessage());
            // getMessage()는 예외 메시지 ("by zero") 반환
        }
    }
}
