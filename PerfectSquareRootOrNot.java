import java.util.Scanner;
public class PerfectSquareRootOrNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number : ");
		int num = sc.nextInt();

		if(isPerfectSquare(num))
			System.out.println("\n"+num+" -> Perfect Square.");
		else
			System.out.println("\n"+num+" -> Not Perfect Square!!");

		sc.close();
	}
	public static boolean isPerfectSquare(int num){

		int temp = (int)Math.sqrt(num);

		return (temp * temp) == num;
	}
}