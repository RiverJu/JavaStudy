package sec06;

class Circle3{
	double radius;
	static int numOfCircles = 0; //��������
	int numCircles = 0;
	
	public Circle3(double radius) {
		this.radius = radius;
		numOfCircles++; //�������� -> ��ü�� ������ ������ ���� �ʱ�ȭx, ���� �ϳ��� ����
		numCircles++; //��ü�� ������ �� �ϳ��� ����, but ��ü���� ������ �������� ���x �ϻ� 0���� ����
	}
}

public class CircleDemo3 {
	public static void main(String[] args) {
		//Circle3 -> �������� numOfCircles ��� ����
		System.out.println(Circle3.numOfCircles);
		//Circle3 -> �������� numCircles ��� �Ұ���
		//System.out.println(Circle3.numCircles);
	}
}
