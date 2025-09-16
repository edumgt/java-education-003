package src.main.java;
import java.io.*; // 필요한 클래스 import

public class BufferedReaderUsage { // 클래스 정의 시작
    public static void main(String[] args) throws IOException { // 메인 메서드: 프로그램 시작 지점
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 값 대입
        System.out.print("이름을 입력하세요: ");
        String name = reader.readLine(); // 변수 선언 또는 초기화
        System.out.println("입력한 이름: " + name); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료