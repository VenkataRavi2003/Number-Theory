import java.util.Scanner;
import java.math.BigInteger;
public class FactorialOfGivenNumber{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.print("\nEnter the number : ");
		 int num = sc.nextInt();

		 BigInteger factorial = findFactorial(num);

		 System.out.println("\n"+num+" != "+factorial);

		 sc.close();
	}
	public static BigInteger findFactorial(int num){

		if(num == 0){
			return BigInteger.valueOf(1);
		}

		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= num ; ++i ) {

		     factorial =  factorial.multiply(BigInteger.valueOf(i));	
		}

		return factorial;
	}
}