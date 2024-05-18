import java.util.Scanner;
public class PrimeNumbersCountBetweenStartAndEndNumbers  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter starting number : ");
		int start = sc.nextInt();

		System.out.print("\nEnter ending number : ");
		int end = sc.nextInt();

		if(start > end){
			System.out.println("\nEnd point must be greater than starting point!!");
			sc.close();
			return;
		}

		int primesCount = findPrimeNumsCount(start,end);

		System.out.println("\nPrime numbers count b/w "+start+" & "+end+" are : "+primesCount);

		sc.close();
	}
	public static int findPrimeNumsCount(int start,int end){
		int primesCount = 0;
		for (int i = start; i <= end; ++i) {
			if(isPrime(i)){
				++primesCount;
			}
		}
		return primesCount;
	}
	public static boolean isPrime(int num){
		if(num <= 1){
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); ++i) {
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}