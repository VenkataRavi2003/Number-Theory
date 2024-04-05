import java.util.Scanner;
public class PalindromeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();

		if(isPalindrome(num)){
			System.out.println("\n"+num+" -> Is Palindrome.");
		}else{
			System.out.println("\n"+num+" -> Not Palindrome!!");
		}
		sc.close();
	}
	public static boolean isPalindrome(int num){
		int temp = num;
		int rev = 0;

		while(temp != 0){
			int rem = temp%10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}
		return num == rev;
	}
}