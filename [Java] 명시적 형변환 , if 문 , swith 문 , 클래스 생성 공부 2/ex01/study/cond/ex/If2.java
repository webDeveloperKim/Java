package cond.ex;

public class If2 {

	public static void main(String[] args) {
		
	
//	문제2
//	온라인 쇼핑몰의 할인 시스템을 개발해야 한다
//	한 사용자가 어떤 상품을 구매할 때 , 여러 할인 조건에 따라
//	총 할인 받는 금액이 달라집니다.
	
//	할인조건
//	물건 가격이 10000원 이상일때 : 1000원 할인
//	사용자 나이가 10살 이하일때 : 1000원 할인
//	핵심 기능 : 한명의 사용자가 동시에 여러 할인을 받을 수 있도록
//	예를 들어 , 10000원 짜리 물건을 구매할 때 1000원을 할인받고
//	동시에 10살 이하를 만족하는 경우, 추가로 1000원을 더 할인 받도록
//	if else 문과 if 문을 적절히 섞어서 작성해보기
	
int price = 10000;
int age = 10;
int discount = 0;
	
	if (price >= 10000) {
		discount += 1000; // discount = discount + 1000;
	}else {
		discount += 0; // discount = discount + 0;
	}
	if(age <= 10) {
		discount += 1000;
	}
	
	System.out.println("사용자가 할인 받는 금액은 : "+ discount + "원 입니다.");
	System.out.println("사용자가 지불한 금액은 : "+ (price - discount) + "원 입니다.");
	
	}
}
