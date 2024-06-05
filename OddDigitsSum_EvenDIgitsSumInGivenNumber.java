import java.util.Scanner;
public class OddDigitsSum_EvenDIgitsSumInGivenNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");

		int num = sc.nextInt();

		find_Even_Odd_DigitsSum(num);
		sc.close();
	}
	public static void find_Even_Odd_DigitsSum(int num){
		int temp = num;
		int evenSum = 0 , oddSum = 0;

		while (temp != 0) {
			
			int rem = temp % 10;

			if(rem % 2 == 0){
				evenSum += rem;
			}else{
				oddSum += rem;
			}

			temp /= 10;
		}

		System.out.println("\nEven Digits Sum : "+evenSum);
		System.out.println("Odd Digits Sum : "+oddSum);
	}
}