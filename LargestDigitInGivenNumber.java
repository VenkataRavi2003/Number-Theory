import java.util.Scanner;
public class LargestDigitInGivenNumber{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();
			int largestDigit =  findLargestDigitInNumber(num);
			System.out.println("\nLargest Digit = "+largestDigit);
 		}catch (Exception e) {
 			System.out.println("\nException Occured :: "+e.getMessage());
 		}
	}
	public static int findLargestDigitInNumber(int num)throws Exception{

		int temp = num;
		int largestDigit = 0;

		while (temp != 0) {
			
			int rem = temp % 10;
			if(largestDigit < rem){
				largestDigit = rem;
			}
			temp /= 10;
		}

		return largestDigit;
	}
}