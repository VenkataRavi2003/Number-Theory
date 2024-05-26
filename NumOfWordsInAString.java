import java.util.Scanner;
class NumOfWordsInAString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the sentence -> ");
		String str=sc.nextLine();
		int wordCount=1;
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)==' '){
				++wordCount;
			}
		}
		System.out.println("\nNo.Of Words -> "+wordCount);
		sc.close();
	}
}
