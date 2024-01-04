package problem1to10;

public class ExponentionalSearch {
	
	//function to for exponential search
	public static int expSearch(int arr[], int target) {
		
		int n=arr.length;
		//to check the the target is at first element
		
		if(arr[0]==target) {
			
			return 0;
		}
		
		//setting range for binary search
		
		int i=1;
		while(i<n && arr[i]<=target) {
			i*=2;
		}
		
		return binarySearch(arr,target,i/2, Math.min(i, n-1));
		
	}

	private static int binarySearch(int[] arr, int target, int left, int right) {
		// TODO Auto-generated method stub
		
		while(left<=right) {
			
			int mid=left+right/2;
			 if(arr[mid]==target) {
				 
				 return mid;
				 
			 }else if(arr[mid]<target){
				 
				 
				 left=mid+1;
				 
				 }else {
					 right=mid-1;
				 }
			
		}
		
		System.out.println("Element not found");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,5,6,7,8,9,};
		int target=5;
		int result= expSearch(arr,target);
		
		if(result != -1)
			System.out.println("element founf" + target);
//		} else{        thrwing errors
//			
//			System.out.println("element not found");
//		}
		

	}
}

