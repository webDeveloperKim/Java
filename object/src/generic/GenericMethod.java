package generic;

public class GenericMethod {

	// 상한을 지정
	public static <T extends Comparable<T>> T findMax(T[] array) {
		T max = array[0];
		
		for (T item : array) {
			// 현재 배열의 요소값이 0보다 크면
			if(item.compareTo(max) > 0) {
				max = item; // 최대값을 갱신함		
			}
		}
		return max;
		
	}
}
