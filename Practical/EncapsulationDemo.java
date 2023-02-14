 class Student{
	
	//private data members
	private int sid;
	private String name;
	private String email;
	private long phoneno;
	
	//getter setter method
	public int getSid(){
		return sid;
	}
	
	public void setSid(int sid){
		this.sid = sid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public long getPhoneno(){
		return phoneno;
	}
	
	public void setPhoneno(long phoneno){
		this.phoneno = phoneno;
	}
	
}

class EncapsulationDemo{
	public static void main(String args[]){
		
		Student s = new Student();
		s.setSid(3047);
		s.setName("MUTHUSELVAN");
		s.setEmail("SELLU@OUTLOOK.com");
		s.setPhoneno(702543815);
		
		System.out.println("DATA IS  :" + s.getSid() + "\n  " + s.getName() + "\n  " + s.getEmail() + "\n  " + s.getPhoneno());
	}
}