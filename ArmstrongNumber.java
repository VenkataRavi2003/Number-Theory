import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();
		
		String temp = Integer.toString(num);
		int len = temp.length();
		
		if(isArmStrongNum(num,len)){
			System.out.println("\n"+num+" -> Is Armstrong Number.");
		}else{
			System.out.println("\n"+num+" -> Not Armstrong Number !!");
		}
		
		sc.close();
	}
	public static boolean isArmStrongNum(int num , int len){
		
		int temp = num , sum = 0;
		
		while(temp != 0){
			
			int rem = temp%10;
			sum += (int)Math.pow(rem,len);
			temp /= 10;
		}
		
		return sum == num;
	}		
}