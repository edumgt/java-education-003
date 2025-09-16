package src.main.java;
public class VarargsExample {
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        int result = sum(10, 20, 30, 40); // 가변 인자 사용
        System.out.println("총합: " + result); // 결과 출력
    }
}