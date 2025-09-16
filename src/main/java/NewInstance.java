package src.main.java;
class Message { // 클래스 정의 시작
    public void print() {
        System.out.println("동적으로 인스턴스를 생성했습니다."); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

public class NewInstance { // 클래스 정의 시작
    public static void main(String[] args) throws Exception { // 메인 메서드: 프로그램 시작 지점
        Class<?> clazz = Class.forName("Message"); // 값 대입
        Object obj = clazz.getDeclaredConstructor().newInstance(); // 값 대입
        ((Message) obj).print();
    } // 코드 블록 종료
} // 코드 블록 종료