import java.util.Arrays;
import java.util.Scanner;


public class HeapSort {
	public static void main(String args[]){
		int size = 0, i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of the array");
		size = in.nextInt();
		int arr[] = new int[size];
		for ( i = 0 ;i < size; i++ ){
			arr[i] = in.nextInt();
		}
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		heapSort(arr,arr.length);
		System.out.println("Sorted Sequence : "+Arrays.toString(arr));
		in.close();
	}
	
	public static void heapSort(int arr[],int len){
		int i=0 ;
		//To Create heap
		for(i=len/2;i>=0;i--){
			maxHeap(arr,i,len);
		}
		//To arrange the max heap
		for( i = len-1 ; i>=0 ;i-- ){
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			//Max heap on reduced array size
			maxHeap(arr,0,i);
		}
	}
	public static void maxHeap( int a[],int largeIndex ,int len){
		int max = largeIndex;
		int left = 2*largeIndex;
		System.out.println("Left : "+left);
		int right = left + 1;
		System.out.println("Right : "+right);
		//If left is max than the current root element
		if( left < len && a[max]<a[left]){
			max = left;
		}
		//If left is max than the current root element
		if( right < len && a[max]<a[right]){
			max = right;
		}
		//Swap if the current node and passed node are different and recurse on maxheap.
		if ( max != largeIndex ){
			int temp = a[max];
			a[max] = a[largeIndex];
			a[largeIndex] = temp;
			maxHeap(a, max, len);
		}
	}
}
