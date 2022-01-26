package week1.day1;

public class Palindrome {
public static void main(String[] args) {
	String name ="madam";
	String rev="";
	int length =name.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
		if (rev.equals(name))
		{
			System.out.println("palindrome");
		}
	}
	
	
}
}
