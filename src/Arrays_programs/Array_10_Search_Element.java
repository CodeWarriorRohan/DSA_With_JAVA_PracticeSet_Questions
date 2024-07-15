package Arrays_programs;

public class Array_10_Search_Element {
	
	// Linear Search in an array
	
	void searchInArray()
	{
		int a[] = {3, 7, 1, 0, 5, 2};
		int x = 1;
		
		int ans = -1;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == x) {
				ans = i;
				break;
			}
		}
		if(ans == -1) {
			System.out.println("Not found");
		}else {
			System.out.println("Element "+ x +" found at index " + ans);
		}
	}
	public static void main(String[] args) {
		
		Array_10_Search_Element search = new Array_10_Search_Element();
		search.searchInArray();
	}

}
