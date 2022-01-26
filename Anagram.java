package week1.day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	int length1=text1.length();
	int length2=text2.length();
	if(length1 == length2) {
		char[] txt1 = text1.toCharArray();
		char[] txt2 = text2.toCharArray();
		Arrays.sort(txt1);
		Arrays.sort(txt2);
		if (Arrays.equals(txt1, txt2))
		{
			System.out.println("Anagram");
		}
		
		
	}
}
}
