package sec06;

class Person{
	String name;
	int age;
	
	//��ȯ Ÿ�� ������ Ŭ����
	public Person setName(String name) {
		this.name = name;
		return this; //������ ��ü �ڽ��� ��ȯ
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("�ȳ�, ���� "+name+"�̰� "+age+" ���̾�");
	}
}

public class MethodChainDemo {
	public static void main(String[] args) {
		Person person = new Person();
		//����ȣ��
		person.setName("�α�").setAge(21).sayHello();

	}

}
