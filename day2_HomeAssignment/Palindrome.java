package week1.day2_HomeAssignment;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int n=121, rev=0, rem, temp;
		  
        temp = n;
  
        for(int i=0;n>0;i++)
        {
            rem = n % 10;
            rev= (rev*10)+ rem;
            n=n/10;
        }
        if (temp==rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");

	}

}
