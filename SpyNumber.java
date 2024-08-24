import java.util.Scanner;
public class SpyNumber{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();

			if(isSpyNumber(num)){
				System.out.println("\n"+num+" -> Spy Number.");
			}else {
				System.out.println("\n"+num+" -> Not Spy Number!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static boolean isSpyNumber(int num)throws Exception{

		int temp = num;
		int prod = 1 , sum = 0;

		while (temp != 0) {
			int rem = temp % 10;
			sum += rem;
			prod *= rem;
			temp /= 10;
		}
		return prod == sum;
	}
}