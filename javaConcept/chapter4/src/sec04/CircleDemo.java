package sec04;

class Circle{
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius; 
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.f, ���� = %.1f\n", x,y);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(); // �����ڸ� ȣ���� circle ��ü�� ����. 
		
		myCircle.radius = 10.0;
		
		myCircle.show(myCircle.radius, myCircle.findArea());

	}

}
