package week1.day2;

public class PrimeInRange {
	
	public static void main(String[] args) {
		int num=10;
		int count;
		for (int i=2;i<=num;i++) {
			count=0;
			for (int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
		}}
			
		if(count==0) {
			System.out.println(i+" is a prime number");}
		else {
			System.out.println(i+" is not a prime number");}
		
		
	}
	
}

}
