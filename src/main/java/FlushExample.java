package src.main.java;
import java.io.*; // 필요한 클래스 import

public class FlushExample { // 클래스 정의 시작
    public static void main(String[] args) throws IOException { // 메인 메서드: 프로그램 시작 지점
        FileWriter writer = new FileWriter("flush_test.txt"); // 값 대입
        writer.write("ABCDEFGH...TEST");
        writer.flush();
        writer.close();
        System.out.println("flush()를 사용하여 데이터를 즉시 파일에 씀"); // 콘솔에 메시지 출력
    } // 코드 블록 종료
} // 코드 블록 종료 