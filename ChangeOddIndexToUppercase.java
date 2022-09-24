package week1.day3;

import org.apache.poi.xslf.model.CharacterPropertyFetcher;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String s1 = "seleniumclass";
		char ch[]=s1.toCharArray();
		int count=0;
		char temp;
		for (int i = 0; i < ch.length; i++) {
			temp=ch[i];
			if (i%2 != 0)
			{
				ch[i]=Character.toUpperCase(temp);
				System.out.println(ch[i]);
			
			}
//			else
//				System.out.println(ch[i]);
//			
		}
	}
}
