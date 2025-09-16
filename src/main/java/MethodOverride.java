package src.main.java;
class Parent { // 클래스 정의 시작
    void greet() {
        System.out.println("안녕하세요. 부모입니다."); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

class Child extends Parent { // 클래스 정의 시작
    @Override
    void greet() {
        System.out.println("안녕하세요. 자식입니다."); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

public class MethodOverride { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        Parent obj = new Child(); // 값 대입
        obj.greet();  // 자식의 greet() 호출
        
    } // 코드 블록 종료
} // 코드 블록 종료