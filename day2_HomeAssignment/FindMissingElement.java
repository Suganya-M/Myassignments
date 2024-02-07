package week1.day2_HomeAssignment;
import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int a[]={1,4,3,2,8, 6,7};
		int l=a.length;
		Arrays.sort(a);
		System.out.println("Sorted: "+Arrays.toString(a));
		for (int i=0;i < l-1 ; i++) {
			if (a[i]+1!=a[i+1]) {
				System.out.println("Missing number:");
				System.out.println(a[i]+1);
				break;
			}
		}
		

	}

}
