import java.util.*;
class AverageOfArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the elements of array");
		float arr[]=new float[size];
		float sum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextFloat();
			sum=sum+arr[i];
		}
		
		double avg=sum/size;
		System.out.println("The average of given array is "+avg);
	}
}