package techm.urvashi.caselet1;

import java.io.Serializable;
import java.util.Date;

public class Client extends Person implements Serializable {

	private Project projectData;
	private String contactNo;
	
	public Client(){
		
	}
	public Client(String name, Date date, Project projectData, String contactNo){
		super(name,date);
		setProjectData(projectData);
		setContactNo(contactNo);
	}
	
	public Project getProjectData() {
		return projectData;
	}
	public void setProjectData(Project projectData) {
		this.projectData = projectData;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String toString(){
		return super.toString()
				+" ProjectData--- "+(projectData==null?"Unknown":getProjectData().toString())
						+" ContactName: "+getContactNo();
	}
}
