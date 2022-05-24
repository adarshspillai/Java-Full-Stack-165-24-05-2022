package machinetest;

public class Customer {

	String name;
	int id;
	int discount;
	
	

	public Customer(String name, int id, int discount) {
		super();
		this.name = name;
		this.id = id;
		this.discount = discount;
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getDiscount() {
		return discount;
	}




	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return "Name"+name +"id"+id+"Discount"+discount;
	}




	public static void main(String[] args) {
		Customer c=new Customer("Sooryan",2,10);
		

	}

}
