import java.util.Scanner;
public class FactorsOfGivenNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();
		
		if(num<0){
			System.out.println("\n"+num+" -> No factors for negative values !!");
			sc.close();
			return;
		}
		
		System.out.println("\nFactors Of : "+num);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=1;i<=num;++i){
			
			if(num%i==0){
				System.out.print(i+",");
			}
		}
		sc.close();
	}
}