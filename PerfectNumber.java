import java.util.Scanner;
public class PerfectNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();

		if(isPerfectNum(num)){
			System.out.println("\n"+num+" -> is perfect number.");
		}else {
			System.out.println("\n"+num+" -> not perfect number.");
		}

		sc.close();
	}
	public static boolean isPerfectNum(int num){
		int sum = 0;
		for (int  i = 1; i < num ; ++i) {
			
			if(num % i == 0){
				sum += i;
			}
		}

		return sum == num;
	}
}