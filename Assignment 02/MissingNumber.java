class MissingNumber{
	public static void main(String args[]){
		int arr[]={1,2,4,5,6};
		int size=arr.length;
		int actSize=arr.length+1;
		int actSum=actSize*(actSize+1)/2;
		int arrSum=0;
		for(int i=0;i<arr.length;i++){
			arrSum=arrSum+arr[i];
		}
		int missNum=actSum-arrSum;
		System.out.println("The missing number is "+missNum);
		
	}
}