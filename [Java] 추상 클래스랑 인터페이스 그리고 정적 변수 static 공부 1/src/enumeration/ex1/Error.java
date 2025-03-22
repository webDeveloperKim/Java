package enumeration.ex1;

public class Error {

	public static void main(String[] args) {
        // `Grade` 열거형 상수 사용
        Grade userGrade = Grade.GOLD;

        // `enum` 상수는 변경할 수 없습니다.
        // 다음 코드는 컴파일 오류를 발생 시킵니다.
        userGrade = Grade.DIAMOND; // userGrade 는 상수가 아니라서 변경 가능
        userGrade = Grade.BASIC; // userGrade 는 상수가 아니라서 변경 가능
//      Grade.GOLD = Grade.DIAMOND; // 컴파일 에러 발생
         
        System.out.println("현재 등급: " + userGrade);
    }
}