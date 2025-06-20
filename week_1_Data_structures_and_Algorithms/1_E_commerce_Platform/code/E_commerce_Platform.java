import java.util.Scanner;

public class E_commerce_Platform {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Products: ");
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nEnter details of product " + (i + 1) + ":");
			
			System.out.print("Enter Product ID: ");
			int id = sc.nextInt();
			sc.nextLine(); // consume remaining newline
			
			System.out.print("Enter Product name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Product Category: ");
			String category = sc.nextLine();
			
			System.out.print("Enter product price: ");
			long price = sc.nextLong();
			sc.nextLine(); // consume remaining newline
			
			products[i] = new Product(id, name, category, price);
		}
		
		System.out.print("\nEnter target product ID: ");
		int targetID = sc.nextInt();
		
		int indexlinear = ProductSearch.linearSearch(products, targetID);
		
		if(indexlinear != -1) {
			System.out.println("\nLinear Search: Found " + products[indexlinear]);
		} else {
			System.out.println("Linear Search: Product not found.");
		}
		
		ProductSearch.sortById(products);
		
		int indexbinary = ProductSearch.BinarySearch(products, targetID, 0, n - 1);
		
		if(indexbinary != -1) {
			System.out.println("\nBinary Search: Found " + products[indexbinary]);
		} else {
			System.out.println("Binary Search: Product not found.");
		}
		
		sc.close();
	}
}