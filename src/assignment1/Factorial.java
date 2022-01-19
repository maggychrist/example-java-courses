package assignment1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
//to find factorial of n numbers
System.out.println("factorial of "+n+" numbers is "+factorial(n));

	}
	public static int factorial(int num) {
		if(num==0 || num==1) return 1;
		else if(num>0) {
			return num*(factorial(num-1));
		}
		return 0; 
	}

}
