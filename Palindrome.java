package java8;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Palindrome {

	public boolean isPalindrome(String str) {
		String temp=str.replaceAll("\\s+", "").toLowerCase();
		
		return IntStream.range(0, temp.length()/2)
				.noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
		
	}
	public static void main(String[] args) {
		
		Palindrome p=new Palindrome();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter text");
		String userInput=sc.nextLine();
		
		System.out.println(p.isPalindrome(userInput));
		
		sc.close();

	}

}
