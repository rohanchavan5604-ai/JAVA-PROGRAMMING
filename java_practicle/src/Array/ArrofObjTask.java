package Array;

class Product {
	int productId;
	String productName;
	float price;
	int quantity;

	Product(int pid, String pname, float p, int q) {

		productId = pid;
		productName = pname;
		price = p;
		quantity = q;
	}

	void display() {

		System.out.println("Product ID : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println();
	}
}

public class ArrofObjTask {

	public static void main(String[] args) {

		Product p[] = {

				new Product(101, "Laptop", 55000, 5), new Product(102, "Mouse", 800, 20),
				new Product(103, "Keyboard", 1200, 15), new Product(104, "Monitor", 9500, 8)

		};

		System.out.println("All Products");

		for (Product x : p) {
			x.display();
		}

		System.out.println("Products with Price Greater Than 1000");

		for (Product x : p) {

			if (x.price > 1000) {
				x.display();
			}
		}

		float total = 0;

		for (Product x : p) {

			total = total + (x.price * x.quantity);
		}

		System.out.println("Total Inventory Value = " + total);

		Product min = p[0];

		for (Product x : p) {

			if (x.price < min.price) {

				min = x;
			}
		}

		System.out.println("\nLowest Price Product");

		min.display();

		for (Product x : p) {

			x.price = x.price + (x.price * 10 / 100);
		}

		System.out.println("After 10% Price Increase");

		for (Product x : p) {

			x.display();
		}
	}
}
