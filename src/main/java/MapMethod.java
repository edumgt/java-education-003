package src.main.java;
import java.util.Arrays; // 필요한 클래스 import
import java.util.List; // 필요한 클래스 import
import java.util.stream.Collectors; // 필요한 클래스 import

public class MapMethod { // 클래스 정의 시작
    public static void main(String[] args) { // 메인 메서드: 프로그램 시작 지점
        List<String> names = Arrays.asList("kim", "lee", "park"); // 값 대입
        List<String> upperNames = names.stream() // 값 대입
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    } // 코드 블록 종료
} // 코드 블록 종료