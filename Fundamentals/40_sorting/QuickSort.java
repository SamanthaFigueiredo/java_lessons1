public class QuickSort{

public static int partition (int arr[], int start, int end)  
{  
    int pivot = arr[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        // If current element is smaller than the pivot  
        if (arr[j] < pivot)  
        {  
            i++; // increment index of smaller element  
            int t = arr[i];  
            arr[i] = arr[j];  
            arr[j] = t;  
        }  
    }  
    int t = arr[i+1];  
    arr[i+1] = arr[end];  
    arr[end] = t;  
    return (i + 1);  
}  

public static void quick(int arr[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
{  
    if (start < end)  
    {  
        int p = partition(arr, start, end); //p is the partitioning index  
        quick(arr, start, p - 1);  
        quick(arr, p + 1, end);  
    }  
}  

	public static void main(String[]args){

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Array Before Bubble Sort\n");  

            for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
            } 

        quick(arr, 0, arr.length-1);

        System.out.println("\nArray After Bubble Sort\n");  

            for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
            } 


	}
}