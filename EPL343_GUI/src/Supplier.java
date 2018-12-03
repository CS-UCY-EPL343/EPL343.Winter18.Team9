public class Supplier {
	String id1,company1,supplier1,address1,telephone1,email1;
	
	public Supplier(String id1, String company1, String supplier1,String address1,String telephone1 ,String email1){
		this.id1=id1;
		this.company1 = company1;
		this.supplier1=supplier1;
		this.address1=address1;
		this.telephone1=telephone1;
		this.email1=email1;
	}
	
	public String getCompany() {
		return company1;
	}
	
	public String getID() {
		return id1;
	}
	
	public String getSupplier() {
		return supplier1;
	}
	public String getAddress() {
		return address1;
	}
	public String getTelephone() {
		return telephone1;
	}
	public String getEmail() {
		return email1;
	}
}
