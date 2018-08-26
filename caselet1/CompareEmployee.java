package techm.urvashi.caselet1;

import java.util.Comparator;

public class CompareEmployee implements Comparator<Employee> {

	private EmployeeEnum compareOn;
	
	public CompareEmployee(EmployeeEnum compareOn){
		this.compareOn = compareOn;
	}
	int compareValue = 0;

	public int compare(Employee e1, Employee e2) {
		

		switch(compareOn){
			case NAME: compareValue = e1.getName().compareTo(e2.getName()); break;
			case DOB: compareValue = e1.getDob().compareTo(e2.getDob()); break;
			case DOJ: compareValue = e1.getDoj().compareTo(e2.getDoj()); break;
			case NETPAY: compareValue = (int)(e1.getNetPay()-e2.getNetPay()); break;
			case GID: compareValue = e1.getGid().compareTo(e2.getGid()); break;
			
			default: throw new RuntimeException("No such field to compare");
		}
		
		compareValue = (compareValue>0 ? 1: (compareValue<0? -1 : 0));
		
		return compareValue;
	}

}
