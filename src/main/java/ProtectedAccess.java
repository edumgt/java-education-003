package src.main.java;
// 상위 클래스 정의: Animal 클래스는 다른 클래스가 상속받을 수 있도록 설계됨
class Animal {

    // protected 접근 제어자: 같은 패키지나 하위 클래스에서 접근 가능
    protected void makeSound() {
        System.out.println("동물의 소리"); // 기본 동작: 동물이 내는 소리 출력
    }
}

// ProtectedAccess 클래스는 Animal 클래스를 상속받아 기능 확장
public class ProtectedAccess extends Animal {

    // 상속받은 makeSound 메서드를 오버라이딩
    // 접근 제어자는 protected 이상이어야 오버라이딩이 유효함
    @Override
    protected void makeSound() {
        System.out.println("소리를 낸다!"); // 오버라이드된 동작: 사용자 정의 메시지 출력
    }

    // 프로그램의 시작점: JVM이 가장 먼저 호출하는 메서드
    public static void main(String[] args) {
        // ProtectedAccess 클래스의 인스턴스를 생성
        ProtectedAccess obj = new ProtectedAccess();

        // 오버라이딩된 makeSound() 메서드 호출
        obj.makeSound(); // 결과: "소리를 낸다!" 출력
    }
}
