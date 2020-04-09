package Bifunctions;

public class Product {

	String name;
	int price;
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + ", Category=" + Category + ", grade=" + grade + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	String Category;
	String grade;
	public Product(String name, int price, String category, String grade) {
		super();
		this.name = name;
		this.price = price;
		Category = category;
		this.grade = grade;
	}

}
