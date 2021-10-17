package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; c2는 int타입으로 변환되어서 1과 연산되기 떄문에 연산결과는 int타입이 되어야 함. 그런데 char라서 에러
		char c3 = (char) (c2 + 1);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);

	}

}
