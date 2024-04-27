import java.util.Scanner;
class DecimalToBinary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();
		convertDecToBinary(num);
		sc.close();
	}
	public static void convertDecToBinary(int num){
		int binary[]=new int[30];
		int index=0;
		while(num>0){
			binary[index++]=num%2;
			num=num/2;
		}
		System.out.println();
		for(int i=index-1;i>=0;--i){
			System.out.print(binary[i]);
		}
	}
}
