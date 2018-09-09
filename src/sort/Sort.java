package sort;

public interface Sort {

	public void sort(int [] a);
	
	default void swap(int [] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
