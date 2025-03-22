package enumeration.ex1;

public class Test {
	public static void main(String[] args) {
        // `Grade` 열거형 상수를 사용
        Grade userGrade = Grade.GOLD;

        System.out.println("현재 등급: " + userGrade); // 출력: 현재 등급: GOLD

        // `enum`의 값은 변경 불가하므로 컴파일 시 오류가 발생합니다.
    }
}

