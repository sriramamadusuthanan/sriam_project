package problem1to10;

public class BinarySearch {
	
	static int  arr[]= {1,2,3,4,5,6,78,9,};
	static int target=5;
	
	public static int binarySearch(int arr[],int target) {
		
		int left=0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid= (left+right)/2;
			
			if (arr[mid]==target) {
				return mid;
				
				
			}else if(arr[mid]<target){
				
				left= mid+1;
				
			}
			else {
				right= mid-1;
			}
		}
	
		System.out.println("element not found");
		return -1;
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	
		
		int result= binarySearch(arr, target);
		System.out.println(result);

	}

}
