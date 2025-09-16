package src.main.java;
import java.io.*; // 필요한 클래스 import

class User implements Serializable { // 클래스 정의 시작
    String name; // 변수 선언 또는 초기화
    transient String password; // 변수 선언 또는 초기화

    public User(String name, String password) { // 변수 선언 또는 초기화
        this.name = name; // 값 대입
        this.password = password; // 값 대입
    } // 코드 블록 종료
} // 코드 블록 종료

public class Transient { // 클래스 정의 시작
    public static void main(String[] args) throws Exception { // 메인 메서드: 프로그램 시작 지점
        User user = new User("홍길동", "1234"); // 값 대입

        ObjectOutputStream oos = 
        new ObjectOutputStream(new FileOutputStream("user.ser")); // 값 대입
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = 
        new ObjectInputStream(new FileInputStream("user.ser")); // 값 대입
        User savedUser = (User) ois.readObject(); // 값 대입
        ois.close();

        System.out.println("이름: " + savedUser.name); // 콘솔에 메시지 출력
        System.out.println("비밀번호: " + savedUser.password);  // null 출력 // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료