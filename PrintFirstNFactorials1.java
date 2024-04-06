import java.util.Scanner;
class PrintFirstNFactorials1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter 'N' > ");
		int n=sc.nextInt();
		long factorial=1;
		for(int i=1;i<=n;++i){
			factorial*=i;
			System.out.println(i+" != "+factorial);
		}
	}
}