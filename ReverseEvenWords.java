package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "My name is Divya";
		String[] words = inputString.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
            if (i%2 ==0)
            {
            	for (int j = word.length()-1; j >= 0; j--) 
            	{
            		reverseWord = reverseWord + word.charAt(j);
            	}
            reverseString = reverseString + reverseWord + " ";
            }
            else
            	reverseString = reverseString + word + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);	}

}
