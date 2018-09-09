package sort;

public class InsertionSort implements Sort{

	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for(int i = 1;i < n;i++){
			int get = a[i];
			int index = i;
			for(int j = i - 1;j >= 0;j--){
				if(get < a[j]){
					swap(a,index,j);
					index = j;
				}
				else{
					break;
				}
			}
		}
	}

}
