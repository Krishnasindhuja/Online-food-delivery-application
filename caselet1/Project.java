package techm.urvashi.caselet1;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable {

	private String projId;
	private String title;
	private String desc;
	private Date startDate;
	private Date endDate;
	
	public Project(){
		
	}
	public Project(String projId, String title, String desc, Date startDate, Date endDate){
		setProjId(projId);
		setTitle(title);
		setDesc(desc);
		setStartDate(startDate);
		setEndDate(endDate);
	}
	
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String toString(){
		return "Project ID: "+getProjId()+" Title: "+getTitle()+" Description: "+getDesc()
				+" Start Date: "+getStartDate()+" End Date: "+getEndDate();
	}
}
