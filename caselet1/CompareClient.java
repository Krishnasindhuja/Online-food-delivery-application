package techm.urvashi.caselet1;

import java.util.Comparator;

public class CompareClient implements Comparator<Client>{


	private ClientEnum compareOn;
	
	public CompareClient(ClientEnum compareOn){
		this.compareOn = compareOn;
	}
	int compareValue = 0;

	public int compare(Client c1, Client c2) {
		

		switch(compareOn){
			case NAME: compareValue = c1.getName().compareTo(c2.getName()); break;
			case DOB: compareValue = c1.getDob().compareTo(c2.getDob()); break;
			case PROJECTID: compareValue = c1.getProjectData().getProjId().compareTo(c2.getProjectData().getProjId()); break;
			case TITLE: compareValue = c1.getProjectData().getTitle().compareTo(c2.getProjectData().getTitle()); break;
			case STARTDATE: compareValue = c1.getProjectData().getStartDate().compareTo(c2.getProjectData().getStartDate()); break;
			case CONTACTNO: compareValue = c1.getContactNo().compareTo(c2.getContactNo()); break;
			
			default: throw new RuntimeException("No such field to compare");
		}
		
		compareValue = (compareValue>0 ? 1: (compareValue<0? -1 : 0));
		
		return compareValue;
	}
}
