package sec05;

public class Method2Demo {

	public static void main(String[] args) {
		System.out.println("��(1~10) : " + sum(1,10));
		System.out.println("��(1~10) : " + sum(10,100));
		System.out.println("��(1~10) : " + sum(100,1000));

	}
	
	public static int sum(int a, int b) {
		int sum = 0;
		
		for(int i=a; i<b; i++)
			sum += i;	
		
		return sum;
	}

}
