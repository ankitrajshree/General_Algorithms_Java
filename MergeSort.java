import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
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
		mergeSort(arr,0,size);
		System.out.println("Sorted Sequence : "+Arrays.toString(arr));
	}
	public static void mergeSort(int a[],int start,int end){
		int mid = 0 ;
		if ( start < end ){
			mid = (start + end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			mergeArray(a,start,mid,end);
		}
	}
	
	public static void mergeArray(int b[],int st,int mid,int end){
		int l1 = 0 , l2 = 0 , i=0,j=0;
		l1 = mid-st+1;
		l2 = end-mid;
		int h1[] = new int[l1];
		int h2[] = new int[l1];
		for ( i =0 ;i<l1 ; i++){
			h1[i] = b[st+i];
		}
		for ( j =0 ;j<l2;j++){
			h2[j]= b[mid+1+j];
		}
	}
}
