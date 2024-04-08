import java.util.Scanner;
public class NthFebinocci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("\nEnter N : ");
		int n = sc.nextInt();
		int res = findNthFebinocci(n);
		System.out.println("\n"+n+" th febinocci : "+res);
		sc.close();
	}
	public static int findNthFebinocci(int n){
		if(n <= 1){
			return n;
		}
		return findNthFebinocci(n-1)+findNthFebinocci(n-2);
	}
}