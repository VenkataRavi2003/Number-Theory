import java.util.Scanner;
public class NextPrimePalindromeNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();

		int nextPrimePalindrome = findNextPrimePalindrome(num);

		System.out.println("\nNext Prime Palindrome = "+nextPrimePalindrome);

		sc.close();
	}
	public static int findNextPrimePalindrome(int num){

		int nextNum = num + 1;

		while (true) {
			
			if (isPrime(nextNum) && isPalindrome(nextNum)) {
				
				return nextNum;
			}

			nextNum++;
		}
	}
	public static boolean isPrime(int nextNum){
		if(nextNum < 2){
			return false;
		}

		for (int i = 2; i <= Math.sqrt(nextNum) ; ++i) {
			
			if(nextNum % i == 0){
				return false;
			}
		}

		return true;
	}
	public static boolean isPalindrome(int nextNum){

		int temp = nextNum;

		int rev = 0;

		while (temp != 0) {
			
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}

		return rev == nextNum;
	}
}