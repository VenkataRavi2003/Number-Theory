import java.util.Scanner;
public class DivisorsCountForGivenNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Number : ");
		int num = sc.nextInt();

		int divisorsCount = findDivisorsCount(num);

		System.out.println("\nno.of divisors for -> "+num+" are : "+divisorsCount);

		sc.close();
	}
	public static int findDivisorsCount(int num){

		int divisorsCount  = 0;

		for(int i = 1; i <= num; ++i){

			if(num % i == 0){
				++divisorsCount;
			}
		}

		return divisorsCount;
	}
}