package sec05;

class Circle{
	private double radius; //�ʵ带 �ܺηκ��� ����
	
	//������(accessors)
	public double getRadius() {
		return radius;
	}
	
	//������(mutators)
	public void setRadius(double r) {
		this.radius = r;
	}
	
	double findArea() {
		return 3.14*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.printf("������ = %.f, ���� = %.1f\n", x, y);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}