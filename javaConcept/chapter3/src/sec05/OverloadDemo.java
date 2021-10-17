package sec05;

public class OverloadDemo {

	public static void main(String[] args) {
		int x=3, y=7, z=10;
		double a=7.0, b=3.0;
		
		System.out.printf("max(%d, %d) = %d\n", x, y, max(x,y));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", a, b, max(a,b));
		System.out.printf("max(%d, %d, %d) = %d\n", x, y, z, max(x,y,z));

	}
	
	public static int max(int n1, int n2) {
		int result = n1 > n2 ? n1:n2;
		return result;
	}
	
	public static double max(double n1, double n2) {
		double result = n1 > n2 ? n1:n2;
		return result;
	}
	
	public static int max(int n1, int n2, int n3) {
		return max(max(n1,n2), n3);
	}

}
