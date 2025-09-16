package src.main.java;
public class ThreadExample extends Thread { // 클래스 정의 시작
    public void run() {
        for (int i = 0; i < 5; i++) { // 반복문 시작
            System.out.println("Thread 실행 중: " + i); // 콘솔에 메시지 출력
        } // 코드 블록 종료
    } // 코드 블록 종료

    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        ThreadExample t1 = new ThreadExample(); // 값 대입
        t1.start();
        ThreadExample t2 = new ThreadExample(); // 값 대입
        t2.start();
    } // 코드 블록 종료
} // 코드 블록 종료