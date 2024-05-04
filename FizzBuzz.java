import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter n : ");
		int n = sc.nextInt();

		printFizzBuzz(n);// for 3 multiples we have to print -> Fizz
		                 // for 5 multiples we have to print -> Buzz
		                 // for both 3 & 5 multiples we have to print -> FizzBuzz

		sc.close();
	}
	public static void printFizzBuzz(int n){

		for (int i = 1;i<=n;++i) {

			if(i % 3 == 0 && i % 5 == 0 )
			   System.out.println("FizzBuzz");

			if(i % 3 == 0)
				System.out.println("Fizz ");

			else if(i % 5 == 0)
				System.out.println("Buzz ");

			else
				System.out.println(i+" ");
			
		}
	}

}