package machinetest;

public class Invoice {
	int id;
	Customer customer;
	double amount;
	
	

	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return customer.id;
	}
	public String getCustomerName() {
		return customer.name;
	}
	public int getCustomerDiscount() {
		return customer.discount;
	}
	public double getAmountAfterDiscount() {
		return amount-customer.discount;
	}
	public String toString() {
		return "invoice[ id="+id+", customer ="+customer.name+"("+customer.id+")("+customer.discount+"%),"+"amount="+amount+"]";
	}	




	public static void main(String[] args) {
		Customer c=new Customer("Sooryan",2,10);
		Invoice i=new Invoice(1,c,100d);
		
		
	
		}
		

	}




}
