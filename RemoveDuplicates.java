package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "We learn java basics as part of java session in java week1";
		int count =0;
		char c1[] = S1.toCharArray();
		String S2 = new String(c1);
		for (int i = 0; i < c1.length; i++) {
			int j;
			for (j = 0; j < c1.length; j++) {
				if(c1[i]==c1[j])
					break;
				else continue;
			}
			if(j ==i)
			{
				c1[count]=c1[i];
		//		System.out.println(c1[count]);
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(c1[i]);
		}
	}

}
