package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {13,2,11,54,6,42,7};
		int[] b = {11,25,8,42,2,7,71};
		int t1 = a.length;
		int t2 = b.length;
		int temp=0;
		int[] ans = new int[6];
		
		for (int i = 0; i < t1; i++) {
		//	System.out.println("Loop: " + i + " Value: " + a[i]);
			
			for (int j = 0; j < t2; j++) {
				//System.out.println(a[i] + " " + b[j]);
				if (a[i] == b[j]) {
					ans[temp] = a[i];
				//	System.out.println(ans[temp]);
					temp++;		
				}
			}
		}
		
		for (int i = 0; i < temp; i++) {
			System.out.println(ans[i]);
		}
	}
}

