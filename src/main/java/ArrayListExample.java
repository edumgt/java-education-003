package src.main.java;
import java.util.ArrayList; // 필요한 클래스 import

public class ArrayListExample { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        ArrayList<String> fruits = new ArrayList<>(); // 값 대입
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");
        fruits.add("딸기기");

        for (String fruit : fruits) { // 반복문 시작
            System.out.println("과일: " + fruit); // 콘솔에 메시지 출력
        } // 코드 블록 종료
    } // 코드 블록 종료
} // 코드 블록 종료