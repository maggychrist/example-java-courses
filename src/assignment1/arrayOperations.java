package assignment1;

public class arrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n= {1,3,4,5,6,7,0, -9};
//System.out.println(n.length);
System.out.println(" Min of the given array is "+ minNo(n));
System.out.println(" Avg of the given array is "+ avgNo(n));
System.out.println(" Max of the given array is "+ maxNo(n));
	}
public static int minNo(int[] num) {
	int length=num.length;
	int min=num[0];
	for(int i=0;i<length;i++) {
		if(num[i]<min) {
			min=num[i];
		}
	}
	return min;
}
//public static double avgNo(int[] num) {
public static int avgNo(int[] num) {
	int length=num.length;
	//double sum=0;
	int sum=0;
	for(int i=0;i<length;i++) {
		sum+=num[i];
	}
	//System.out.println(sum);
	return sum/length;
}
public static int maxNo(int[] num) {
	int length=num.length;
	int max=num[0];
	for(int i=0;i<length;i++) {
		if(num[i]>max) {
			max=num[i];
		}
	}
	return max;
}
}
