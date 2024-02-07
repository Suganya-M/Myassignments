package week1.day2_HomeAssignment;

public class findIntersection {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		int len=a.length;
		int m;
		//System.out.println(len);
		
for (int i = 0; i < len; i++) {
	for (int j = 0; j < len; j++) {
		if(a[i]==b[j]) {
			m=a[i];
			System.out.println(m);
			
		}
		
	}
	
}
	}

}
