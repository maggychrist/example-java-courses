package assignment1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		//to count sum of n numbers from 1 to n
		int sum=sumOfNumbers(n);
		System.out.println("Sum of "+n+" numbers is "+sum);
		
		
	}
	public static int sumOfNumbers(int num) {
		int sum=0;
		
		while(!(num<=0)) {
			sum+=num;
			num--;
		}
		return sum; 
	}

}
