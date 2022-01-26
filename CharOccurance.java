package week1.day1;

public class CharOccurance {
public static void main(String[] args) {
	String str = "welcome to chennai";
	int count =0;
	char[] string = str.toCharArray();
	int length =str.length();
	for (int i=0;i<length;i++)
	{
		if (string[i]=='e')
			count++;
		
	}
	System.out.println("e is repeated"+" "+count+" "+"times");
}
}
