package sec03;

class Phone{
	//필드
	String model;
	int value;
	
	//메서드
	void print() {
		System.out.println(value + "만 원자리 " + model + "스마트폰");
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myphone = new Phone(); //Phone 타입의 객체를 생성한 후 myphone이라는 참조 변수에 대입.
		//객체의 필드에 값을 대입
		myphone.model = "아이폰8";
		myphone.value = 200;
		//객체의 메서드를 호출
		myphone.print();
		
		//Phone타입의 객체 생성
		Phone yourphone = new Phone();
		yourphone.model = "갤럭시 11";
		yourphone.value = 150;
		yourphone.print();
	
	}

}
