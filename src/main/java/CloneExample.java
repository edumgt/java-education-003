package src.main.java;
class Person implements Cloneable { // 클래스 정의 시작
    String name; // 변수 선언 또는 초기화

    Person(String name) { // 변수 선언 또는 초기화
        this.name = name; // 값 대입
    } // 코드 블록 종료

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    } // 코드 블록 종료
} // 코드 블록 종료

public class CloneExample { // 클래스 정의 시작
    public static void main(String[] args) throws CloneNotSupportedException { // 메인 메서드: 프로그램 시작 지점
        Person p1 = new Person("홍길동"); // 값 대입
        Person p2 = p1.clone(); // 값 대입

        System.out.println("원본: " + p1.name); // 콘솔에 메시지 출력
        System.out.println("복제본: " + p2.name); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료