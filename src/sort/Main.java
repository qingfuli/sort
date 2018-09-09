package sort;

public class Main {

	public static void main(String[] args) {
		int [] a = {2,6,3,5,9,4,8,1,7};
		
		System.out.println("排序前数组：");
		
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i] + " ");
		}
		Sort sort = null;
//		sort = new InsertionSort();
		sort = new QuickSort();
		
		sort.sort(a);
		
		System.out.println();
		System.out.println("排序后数组：");
		
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i] + " ");
		}
	}

}
