package sort;

public class QuickSort implements Sort{

	@Override
	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	private void quickSort(int [] a, int left, int right){
		if(left >= right){
			return;
		}
		
		int pivotIndex = partition(a,left,right);
		quickSort(a, left, pivotIndex - 1);
		quickSort(a, pivotIndex + 1, right);
	}

	private int partition(int[] a, int left, int right) {
		int pivot = a[right];
		int index = left - 1;
		for(int i = left;i < right;i++){
			if(a[i] <= pivot){
				swap(a, ++index, i);
			}
		}
		
		swap(a, index + 1, right);
		return index + 1;
	}

}
