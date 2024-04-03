import java.util.Scanner;
public class SumOfDigitsInNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();
		
		int sum = findDigitsSum(num);
		System.out.println("\nSum : "+sum);
		
		sc.close();
	}
	public static int findDigitsSum(int num){
		int temp = num;
		int sum = 0;
		
		while(temp != 0){
			int rem = temp%10;
			sum += rem;
			temp /= 10;
		}
		return sum;
	}
}