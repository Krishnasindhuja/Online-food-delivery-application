package techm.urvashi.caselet1;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private String acntNo;
	private String bankName;
	private String branch;
	
	public BankAccount(){
		System.out.println("Bank Account");
	}
	public BankAccount(String acntNo, String bankName, String branch, String iFSC_code){
		setAcntNo(acntNo);
		setBankName(bankName);
		setBranch(branch);
	}
	
	public String getAcntNo() {
		return acntNo;
	}
	public void setAcntNo(String acntNo) {
		this.acntNo = acntNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString(){
		return " Account No.: "+getAcntNo()+" Bank Name: "+getBankName()+
				" Bank Branch: "+getBranch();
	}
}
