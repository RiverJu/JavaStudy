package sec06;

class Circle2{//�����ڸ� �����߱� ������ �⺻ �����ڸ� �ڵ����� �߰� �ȵ�.
	double radius;
	String color;
	
	//������1 -> ������ �������� ������ ���� ��ü ������
	public Circle2(double radius, String color) {
		radius = radius;
		color = color;
	}
	
	//������2 -> �Ķ� ��ü ������
	public Circle2(double radius) {
		this.radius = radius;
		this.color = "�Ķ�";
	}
	
	//������3 -> �⺻ ������
	public Circle2() {
		this.radius = 10.0;
		this.color = "���";
	}
	
	//������4 -> ������ 10.0 ������
	public Circle2(String color) {
		this.radius = 10.0;
		this.color = color;
	}
	
}

public class CircleDemo2 {
	public static void main(String[] args) {
		//������1
		Circle2 c1 = new Circle2(10.0, "����");
		//������2
		Circle2 c2 = new Circle2(15.0);
		//������3
		Circle2 c3 = new Circle2();
		//������4
		Circle2 c4 = new Circle2("�ʷ�");

	}

}
