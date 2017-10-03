import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {
	public static void main( String args[]){
		int size = 0, i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of the array");
		size = in.nextInt();
		int arr[] = new int[size];
		for ( i = 0 ;i < size; i++ ){
			arr[i] = in.nextInt();
		}
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Sorted Sequence : "+Arrays.toString(arr));
	}
	
	public static void insertionSort ( int a[] ){
		int i = 0 , j = 0 , l = 0 , key =0 ;
		l = a.length;
		for ( i=1;i<l;i++){
			key = a[i];
			j = i-1;
			while( j >= 0 && a[j] > key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1]= key; 
		}
	}
}
