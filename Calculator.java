package week1.day2;

public class Calculator {
	
	public int add(int a,int b,int c) {
		
		return a+b+c;
		}
	private int sub(int a,int b, int c) {
		return a-b-c;

	}
	private  int mul(int a, int b,int c) {
		return a*b*c;

	}
	private int div(int a, int b, int c) {
		return a/b/c;
		

	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.sub(10,1 , 2));
		int mul = cal.mul(1, 02, 03);
	System.out.println(mul);
	int div = cal.div(10, 5, 2);
	System.out.println(div);
		System.out.println(cal.add(1, 2,3));
		
		
		
		
	}
}
