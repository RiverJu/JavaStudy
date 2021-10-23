package sec04;

class Circle{
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius; 
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.f, 넓이 = %.1f\n", x,y);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(); // 생성자를 호출해 circle 객체를 생성. 
		
		myCircle.radius = 10.0;
		
		myCircle.show(myCircle.radius, myCircle.findArea());

	}

}
