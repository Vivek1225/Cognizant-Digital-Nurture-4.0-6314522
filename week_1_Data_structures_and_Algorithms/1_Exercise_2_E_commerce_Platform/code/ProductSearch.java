
public class ProductSearch {
	public static int linearSearch(Product[] products, int target) {
		for(int i=0;i<products.length;i++) {
			if(products[i].productID == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(Product[] products, int target, int low, int high) {
		
		if (low > high) {
	        return -1; // Base case: target is not found
	    }
		
		int mid = (low+high)/2;
		int val = products[mid].productID;
		if(val == target) {
			return mid;
		}
		else if(val < target) {
			return BinarySearch(products, target, mid+1, high);
		}
		else if(val > target) {
			return BinarySearch(products, target, low , mid-1);
		}
		return -1;
	}
	
	public static void sortById(Product[] products) {
		for(int i=0;i<products.length -1 ;i++) {
			for(int j=i+1;j<products.length;j++) {
				if(products[i].productID > products[j].productID) {
					int temp = products[i].productID;
					products[i].productID = products[j].productID;
					products[j].productID = temp;
				}
			}
		}
	}
}
