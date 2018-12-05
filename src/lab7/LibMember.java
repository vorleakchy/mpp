package lab7;

public class LibMember extends Person {
	private String id;
	
	public LibMember(String id, String firstName, String lastName, String phoneNumber, Address address) {
		super(firstName, lastName, phoneNumber, address);
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", address=" + getAddress()
				+ ", phoneNumber=" + getPhoneNumber() + "]";
	}
}
