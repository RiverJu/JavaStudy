package sec03;

class Phone{
	//�ʵ�
	String model;
	int value;
	
	//�޼���
	void print() {
		System.out.println(value + "�� ���ڸ� " + model + "����Ʈ��");
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myphone = new Phone(); //Phone Ÿ���� ��ü�� ������ �� myphone�̶�� ���� ������ ����.
		//��ü�� �ʵ忡 ���� ����
		myphone.model = "������8";
		myphone.value = 200;
		//��ü�� �޼��带 ȣ��
		myphone.print();
		
		//PhoneŸ���� ��ü ����
		Phone yourphone = new Phone();
		yourphone.model = "������ 11";
		yourphone.value = 150;
		yourphone.print();
	
	}

}
