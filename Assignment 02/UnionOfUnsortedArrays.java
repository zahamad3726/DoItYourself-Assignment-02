import java.util.*;
import java.io.*;
class UnionOfUnsortedArrays{
	public static void main(String args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		for(int i=0;i<size1;i++){
			arr2[i]=sc.nextInt();
		}
		set<int> s;
		for(int i=0;i<size1;i++){
			s.insert(arr1[i]);
		}
		for(int i=0;i<size1;i++){
			s.insert(arr2[i]);
		}
		System.out.println("The union of given arrays is "+s);
		}
}