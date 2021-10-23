package sec06;

class Circle3{
	double radius;
	static int numOfCircles = 0; //정적변수
	int numCircles = 0;
	
	public Circle3(double radius) {
		this.radius = radius;
		numOfCircles++; //공유변수 -> 객체를 생성할 때마다 값이 초기화x, 값이 하나씩 증가
		numCircles++; //객체를 생성할 때 하나씩 증가, but 객체마다 별도의 기억공간을 사용x 하상 0에서 증가
	}
}

public class CircleDemo3 {
	public static void main(String[] args) {
		//Circle3 -> 정적변수 numOfCircles 사용 가능
		System.out.println(Circle3.numOfCircles);
		//Circle3 -> 정적변수 numCircles 사용 불가능
		//System.out.println(Circle3.numCircles);
	}
}
