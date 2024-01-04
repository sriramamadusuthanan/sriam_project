package problem1to10;
import java.util.Scanner;
public class LinearSearch {
	
	public static int linearSearch(int arr[],int target) {
		
		for (int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				
				System.out.println("Element found "+ arr[i]);
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    
		System.out.println("Enter the size of the : ");
		int size = sc.nextInt();
		
		int array[]= new int[size]; 
		int tg;
		
		System.out.println("Enter the element of the array");
		for (int i = 0; i<size; i++) {
			
			array[i]= sc.nextInt();
			
		}
		
		

		System.out.println("Enter the number to search");
		
		tg= sc.nextInt();
		linearSearch(array,tg);

	}

}
