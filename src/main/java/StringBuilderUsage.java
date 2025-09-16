package src.main.java;
public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder 객체 생성
        sb
                .append("Java ")
                .append("StringBuilder ")
                .append("예제"); // 문자열 연결
        String result = sb.toString(); // 완성된 문자열 반환
        System.out.println("최종 문자열: " + result); // 출력
    }
}