package sec06;

class Circle{
	private double radius;
	
	//�ٸ� �����ڰ� �ϳ��� ������, �⺻ �����ڸ� �ڵ� �߰� x -> CircleŬ������ �⺻ ������ x
	public Circle(double r) {
		radius = r;
	}
}

public class CircleDemo1 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		
		//�⺻ �����ڰ� ������ ���x
		//Circle yourCircle = new Circle();
	}
}
