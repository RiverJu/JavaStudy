package sec06;

class Circle{
	private double radius;
	
	//다른 생성자가 하나라도 있으면, 기본 생성자를 자동 추가 x -> Circle클래스에 기본 생성자 x
	public Circle(double r) {
		radius = r;
	}
}

public class CircleDemo1 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		
		//기본 생성자가 없으니 사용x
		//Circle yourCircle = new Circle();
	}
}
