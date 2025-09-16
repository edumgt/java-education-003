package src.main.java;
interface Greeting {
    void sayHello();
    void sayYes();
} // 코드 블록 종료

public class ImplementsInterface implements Greeting { // 클래스 정의 시작
    public void sayHello() {
        System.out.println("인터페이스 구현 예제입니다.1"); // 콘솔에 메시지 출력
    } // 코드 블록 종료
    public void sayYes() {
        System.out.println("인터페이스 구현 예제입니다.2"); // 콘솔에 메시지 출력
    } // 코드 블록 종료

    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        Greeting g = new ImplementsInterface(); // 값 대입
        g.sayHello();
        g.sayYes();
    } // 코드 블록 종료
} // 코드 블록 종료