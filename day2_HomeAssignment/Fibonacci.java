package week1.day2_HomeAssignment;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8;
		int n1=0;
		int n3,n2=1;
		System.out.println(n1+"\n"+n2);
		for (int i= 2; i<n; i++)
		{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				
			}
			
		}}
		
