
public class Product {
	int productID;
	String productName;
	String category;
	long price;
	public Product(int productID, String productName, String category, long price){
		this.productID = productID;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public String toString() {
		return "Product ID : "+productID+"\nName : "+productName+"\nCategory : "+category+"\nPrice : "+price;
	}
}
