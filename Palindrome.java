package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		String p1= "malayalam";
		char ch[]=p1.toCharArray();
		char ch2[] = new char[ch.length];
		int count = 0;
		boolean flag = true;
		for (int j = ch.length-1; j >= 0; j--)
			{
				ch2[count]=ch[j];
				System.out.println(ch2[count]);
				count++;
			}
		for (int i = 0; i < ch2.length; i++) {
			if (ch[i]!=ch2[i])
				flag=false;
			else 
				continue;
		}
		if (flag)
			System.out.println("The given string is Palindrome " );
		else
			System.out.println("The given string is not Palindrom ");
		}
 
}
