import java.util.Arrays;
import java.util.Scanner;


public class QuickSort {
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
		quickSort(arr,0,size-1);
		System.out.println("Sorted Sequence : "+Arrays.toString(arr));
	}
	public static void quickSort(int a[],int st, int end){
		if ( st < end ){
			//Partition the given element into based on pivot = a[end] 
			int pivotPos = partArray(a,st,end);
			//Recurse on quick sort with new partitioned array
			quickSort(a, st, pivotPos-1);
			quickSort(a,pivotPos+1, end);
		}
	}
	public static int partArray(int a[],int start ,int end){
		int pos = 0 , j = start-1;
		int pivot = a[end];
		for ( int i=start;i<end;i++){
			if ( a[i] < pivot){
				j++;
				//Swapping of elements
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//Swap the pivot and return its position
		pos = j+1;
		int tmp = a[end];
		a[end]=a[pos];
		a[pos]= tmp;
		return (pos);
	}
}
