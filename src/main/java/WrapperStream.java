package src.main.java;
import java.io.*; // 필요한 클래스 import

public class WrapperStream { // 클래스 정의 시작
    public static void main(String[] args) throws IOException { // 메인 메서드: 프로그램 시작 지점
        FileInputStream fis = new FileInputStream("flush_test.txt"); // 값 대입
        BufferedInputStream bis = new BufferedInputStream(fis); // 값 대입

        int data; // 변수 선언 또는 초기화
        while ((data = bis.read()) != -1) { // 값 대입
            System.out.print((char) data);
        } // 코드 블록 종료 

        bis.close();
    } // 코드 블록 종료
} // 코드 블록 종료