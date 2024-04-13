import java.util.Scanner;
import java.util.ArrayList;
class HighestPrimeNumberInArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array > ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nEnter the elements > ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nResulted Array >> ");
		for(int item:a){
			System.out.print(item+" ");
		}
		ArrayList<Integer>primeList=new ArrayList<Integer>();
		for(int i=0;i<a.length;++i){
			if(isPrime(a[i])){
				primeList.add(a[i]);
			}else{
				continue;
			}
		}
		System.out.println("\nPrime Numbers List >> "+primeList);
		int maxPrime=primeList.get(0);
		for(int i=0;i<primeList.size();++i){
			if(maxPrime<primeList.get(i)){
				maxPrime=primeList.get(i);
			}
		}
		System.out.println("\nMaximum Prime Number >> "+maxPrime);
	}
	public static boolean isPrime(int n){
		int count=0;
		for(int i=1;i<=n;++i){
			if(n%i==0){
				++count;
			}
		}
		if(count==2){
			return true;
		}
		return false;
	}
}