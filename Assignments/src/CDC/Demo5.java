package CDC;

public class Demo5 {
	private String FirstName;
	private String LastName;
	private String EmailId;
	private String PhoneNo;
	public void setFirstName(String fn) {
		FirstName=fn;
	}
	public void setLastName(String ln) {
		LastName=ln;
		
	}
	public void setEmail(String ei) {
		EmailId=ei;
	}
	public void setPhoneNo(String pn) {
		PhoneNo=pn;
	}
	
	public String getFirstName() {
		return FirstName;
		
		
	}
	public String getLastName() {
		return LastName;
		
	}
	public String getEmailId() {
		return EmailId;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public static void main(String[] args) {
		Demo5 d1=new Demo5();
		d1.setFirstName("Kontham");
		d1.setLastName("Srija");
		d1.setEmail("srija@gmail.com");
		d1.setPhoneNo("9999999999");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmailId());
		System.out.println(d1.getPhoneNo());
	}
	
}
