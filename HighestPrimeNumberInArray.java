import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class HighestPrimeInArray{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();

		if(size <= 0){
			System.out.println("\n"+size+" -> Array size must be greater than zero!");
			sc.close();
			return;
		}

		int a[] = new int[size];

		System.out.println("\nEnter the elements : ");
		takeInput(sc,a);

		System.out.println("\nResulted Array : ");
		printArray(a);

		List<Integer> primesList = new ArrayList<Integer>();

		int highestPrime = findHighestPrime(a,primesList);

		if(highestPrime != -1){
			System.out.println("\n"+highestPrime+" : Is The Highest Prime.");
		}else{
			System.out.println("\nNo Highest Prime Found !!");
		}

		sc.close();

	}
	public static void takeInput(Scanner sc , int a[]){

		for (int i = 0; i < a.length ; ++i ) {
			 
			 a[i] = sc.nextInt();
		}
	}

	public static void printArray(int a[]){

		for (int item : a) {
			 
			 System.out.print(item+" ");
		}
	}

	public static int findHighestPrime(int a[], List<Integer> primesList){

		for (int item : a) {

			 if(isPrime(item))primesList.add(item);
		}

		System.out.println("\nPrimes List :: "+primesList);

		if(primesList.isEmpty()){

			return -1;// No prime numbers found
		}

		Collections.sort(primesList);

		int highestPrime = primesList.get(primesList.size()-1);

		return highestPrime;

	}
	public static boolean isPrime(int num){

		if(num <= 1)return false;

		for (int i = 2; i<= Math.sqrt(num) ; ++i ) {

			  if(num % i == 0) return false;
		}

		return true;

	}
}
