package sec06;

class Circle2{//생성자를 선언했기 때문에 기본 생성자를 자동으로 추가 안됨.
	double radius;
	String color;
	
	//생성자1 -> 임의의 반지름과 색상을 가진 객체 생성자
	public Circle2(double radius, String color) {
		radius = radius;
		color = color;
	}
	
	//생성자2 -> 파랑 객체 생성자
	public Circle2(double radius) {
		this.radius = radius;
		this.color = "파랑";
	}
	
	//생성자3 -> 기본 생성자
	public Circle2() {
		this.radius = 10.0;
		this.color = "노랑";
	}
	
	//생성자4 -> 반지름 10.0 생성자
	public Circle2(String color) {
		this.radius = 10.0;
		this.color = color;
	}
	
}

public class CircleDemo2 {
	public static void main(String[] args) {
		//생성자1
		Circle2 c1 = new Circle2(10.0, "빨강");
		//생성자2
		Circle2 c2 = new Circle2(15.0);
		//생성자3
		Circle2 c3 = new Circle2();
		//생성자4
		Circle2 c4 = new Circle2("초록");

	}

}
