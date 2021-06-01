

	import java.util.Scanner;

	public class Data {
	private	String firstName;
	private	String lasttName;	
	private	String department;
	private	String password;
	private int mailboxCapacity=500;
	private int randomPassLength=10;
	private String email;
	private String alternateEmail;
	private String changePassword;
	//Generate constructor to achieve  the f & l name 
	public Data (String firstName,String lastName) {
		this.firstName = firstName;
		this.lasttName = lastName;
		System.out.println("The name is "+""+firstName+" "+lastName);
		
		//getting method to the variable set department
		this.department = departmentName();
		System.out.println("The department is :"+this.department);
		
		//random password assigning
		this.password= randomPassword(randomPassLength);
		System.out.println("The password is :  "+this.password );
		
		//generate the email
		email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".company.com";
		System.out.println("Your email is :"+email);
	}
	// get the department 

	private String departmentName() {
	System.out.println("Enter the department \n1 for Sales\n2 for Development \n3 for Accounting \n0 for Non \nPlease enter the no: ");
	Scanner in = new Scanner(System.in); 
	int dipChoice =in.nextInt();
	if (dipChoice==1) {return "salese";}
	else if (dipChoice==2) {return "Development";}  
	else if (dipChoice==3) {return "Accounting";}
	else {return "";}
		
	}

	// random password 

	private String randomPassword(int length){
		String setPassword = "ABCDEFGHIJKLMNOPQRTUVWXYZ1234567890@#$%&*";
		char [] password=new char [length];
		for (int i=0; i<length;i++ ) {
			int rand= (int)(Math.random()*setPassword.length());
			password[i]=setPassword.charAt(rand);
		}return new String (password) ;
	} 
	//set mailbox capacity
	public void setMailbcCapacity(int capacity) {
		this.mailboxCapacity= capacity;
	}
	//set alternate email

	public void setalternateEmail(String alternateEmail) {
		this.alternateEmail= alternateEmail;
	}
	//Change the password
	private void changePasswrd(String changePassword) {
		this.changePassword=changePassword;
	}
	public int getMailbcCapacity() {return mailboxCapacity ;} 
	public String getalternatePassword(){return alternateEmail;} 
	private String  getChangePassword() {return changePassword ;} 
	}


	
	
	
	
	
	
	
	
	
	
	
	
	

