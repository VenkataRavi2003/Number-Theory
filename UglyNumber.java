import java.util.Scanner;
public class UglyNumber{
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();

			if(isUglyNumber(num)){
				System.out.println("\n"+num+" -> Ugly Number.");
			}else {
				System.out.println("\n"+num+" -> Not Ugly Number!!");
			}
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static boolean isUglyNumber(int num)throws Exception{

		if(num <= 0)return false;

		if(num == 1)return true;

		while (num % 2 == 0) {
			
			num /= 2;
		}

		while(num % 3 == 0){
			num /= 3;
		}

		while(num % 5 == 0){
			num /= 5;
		}

		return num == 1;
	}
}