
class IntersectionOfArrays{
	public static void main(String args[]){
		int arr1 []={1,5,8,12};
		int arr2 []={2,4,5,12};
		System.out.println("The intersection of given arrays is/are: ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
}