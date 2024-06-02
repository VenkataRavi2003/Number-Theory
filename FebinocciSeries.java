import java.util.Scanner;
public class FebinocciSeries{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of series : ");
			int size = sc.nextInt();

			if(size < 0){
				System.out.println("\n"+size+" -> size can't be negative..!");
				sc.close();
				return;
			}
			
			// Print an empty line for better output formatting
			System.out.println();

			printFebinocciSeries(size);

		}
	}
	public static void printFebinocciSeries(int size){

		int firstTerm = 0 , secondTerm = 1;

		for (int i = 1 ; i <= size ; ++i) {

			System.out.print(firstTerm+" ");

			int nextTerm = firstTerm + secondTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}