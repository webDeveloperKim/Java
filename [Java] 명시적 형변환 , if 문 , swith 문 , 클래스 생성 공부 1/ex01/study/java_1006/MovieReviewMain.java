package java_1006;

public class MovieReviewMain {

	public static void main(String[] args) {
//		영화 리뷰 정보 초기화
//		영화 리뷰 정보 출력
		
//		인사이드아웃2 , 리뷰 : 재밌다
//		어바웃타임 , 리뷰  : 재밌다2
//		MovieReview 객체 movie1 , movie2 생성 
		MovieReview movie1 = new MovieReview(); 
		MovieReview movie2 = new MovieReview(); 

//		MovieReview 배열 객체 movieReviews 생성 및 movie1 , movie2 인스턴스 참조 값 대입 
		MovieReview[] movieReviews = new MovieReview[]{movie1, movie2};
//		배열 인덱스로 movie1 , movie2 인스턴스 접근해서 해당 인스턴스 각 필드 값 지정 
		movieReviews[0].title = "인사이드아웃2";
		movieReviews[0].review = "재밌다";
		movieReviews[1].title = "어바웃타임";
		movieReviews[1].review = "재밌다2";
		
//		movie1, movie2 각 필드 값 출력 
		System.out.println(" 영화 제목 : " + movieReviews[0].title + " 영화 리뷰 : " + movieReviews[0].review);
		System.out.println(" 영화 제목 : " + movieReviews[1].title + " 영화 리뷰 : " + movieReviews[1].review);
		
	}
	
}