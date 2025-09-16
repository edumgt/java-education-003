package src.main.java;
abstract class Animal { // 클래스 정의 시작
    abstract void makeSound();
    public void breathe() {
        System.out.println("숨을 쉽니다."); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

class Dog extends Animal { // 클래스 정의 시작
    public void makeSound() {
        System.out.println("멍멍!"); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료

public class AbstractClass { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        Animal a = new Dog(); // 값 대입
        a.breathe();
        a.makeSound();
    } // 코드 블록 종료
} // 코드 블록 종료