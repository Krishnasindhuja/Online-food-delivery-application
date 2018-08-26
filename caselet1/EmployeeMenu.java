package techm.urvashi.caselet1;

public enum EmployeeMenu {

	ADD_EMP(1,"Add an employee"),
	DISPLAY(2, "Display all employees"),
	
	SORT_NAME(3,"Sort on NAME"),
	SORT_DOB(4,"Sort on DOB"),
	SORT_DOJ(5,"Sort on DOJ"),
	SORT_NETPAY(6,"Sort on NETPAY"),
	SORT_GID(7,"Sort on GID"),
	
	SEARCH_NAME(8,"Search by NAME"),
	SEARCH_DOB(9,"Search by DOB"),
	SEARCH_DOJ(10,"Search by DOJ"),
	SEARCH_BASIC(11,"Search by BASIC"),
	SEARCH_GID(12,"Search by GID"),
	
	DELETE(13,"Delete  Record"),
	QUIT(14, "Quit");
	
	private int menuId;
	private String msg;
	
	private EmployeeMenu(int menuId, String msg){
		this.menuId = menuId;
		this.msg = msg;
	}
	
	public static EmployeeMenu getMenu(int menuId){
		EmployeeMenu menu = null;
		
		for(EmployeeMenu menuItem : EmployeeMenu.values())
			if(menuItem.menuId == menuId){
				menu = menuItem;
				break;
			}
		
		return menu;
	}
	
	public String toString(){
		return menuId + "\t" + msg;
	}
}
