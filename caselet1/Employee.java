package techm.urvashi.caselet1;

import java.io.Serializable;
import java.util.Date;

public class Employee extends Person implements Serializable {

	private Date doj;
	private double basic;
	private BankAccount salaryAcnt;
	private String gid;
	
	public Employee(){
		
	}
	public Employee(String name, Date date,Date doj, double basic, BankAccount salaryAcnt,String gid){
		super(name,date);
		setDoj(doj);
		setBasic(basic);
		setSalaryAcnt(salaryAcnt);
		setGid(gid);
	}
	
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public BankAccount getSalaryAcnt() {
		return salaryAcnt;
	}
	public void setSalaryAcnt(BankAccount salaryAcnt) {
		this.salaryAcnt = salaryAcnt;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public double getHra(){
		return basic*0.03;
	}
	public double getTa(){
		return basic*0.02;
	}
	public double getNetPay(){
		return basic+getHra()+getTa();
	} 
	
	public String toString(){
		return super.toString()+" GID: "+getGid()+" DoJ: "+(doj==null?"Unknown":getDoj().toString())
		+" NetPay: "+getNetPay()+" SalaryAccountDetails--- "+(salaryAcnt==null?"No Bank Account":getSalaryAcnt().toString());
	}
}
