package techm.urvashi.caselet1;

import java.util.Date;

public class Person {
	
	protected String name;
	protected Date dob;
	
	public Person(){
		
	}
	public Person(String name, Date date){
		setName(name);
		setDob(dob);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String toString(){
		return "PersonalDetails--- "+" Name: "+getName()+" DoB: "+(dob==null?"Unknown":getDob().toString());
	}

}
