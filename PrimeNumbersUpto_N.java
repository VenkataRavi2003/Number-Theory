import java.util.Scanner;
public class PrimeNumbersUpto_N{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter N : ");
		int n = sc.nextInt();

		if(n <= 0){
			System.out.println("\n"+n+" -> Size of N must greater than zero !!");
			sc.close();
			return;
		}

		generatePrimesUptoN(n);

		sc.close();
	}
	public static void generatePrimesUptoN(int n){

		for (int i = 2 ; i <= n ; ++i) {
			
			if(isPrime(i))
				System.out.print(i+",");
		}
	}
	public static boolean isPrime(int num){

		if(num <= 1)return false;

		for (int i = 2 ; i <=Math.sqrt(num) ;++i) {
			
			if(num % i == 0)return false;
		}
		return true;
	}
}