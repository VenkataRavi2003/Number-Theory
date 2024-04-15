import java.util.Scanner;
public class GeneratingArmstrongNumbersUptoN{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter N  : ");
		int n =sc.nextInt();

		System.out.println("\nArmstrong Numbers Upto : "+n);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 1; i <= n; ++i){

			if(isArmstrongNumber(i)){
				System.out.print(i+",");
			}
		}

		sc.close();
	}
	public static boolean isArmstrongNumber(int num){

		int temp = num;
		String str = Integer.toString(temp);
		int len = str.length();
		int sum = 0;

		while(temp != 0){

			int rem = temp % 10;
			sum += (int)Math.pow(rem,len);
			temp /= 10;
		}

		return sum == num;

	}
}