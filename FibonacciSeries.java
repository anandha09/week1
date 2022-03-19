package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int f=0,s=1,t,i,range=8;
		System.out.println(f);
		System.out.println(s);
		for(i=2;i<range;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		

	}
}

		