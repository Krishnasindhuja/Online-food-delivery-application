package techm.urvashi.caselet1;
public enum ClientMenu {

	ADD_CLIENT(1,"Add a client"),
	DISPLAY(2, "Display all clients"),
	SORT_NAME(3,"Sort on NAME"),
	SORT_DOB(4,"Sort on DOB"),
	SORT_PROJECTID(5,"Sort on PROJECTID"),
	SORT_TITLE(6,"Sort on TITLE"),
	SORT_CONTACTNO(7,"Sort on CONTACTNO"),
	SEARCH_NAME(8,"Search by NAME"),
	SEARCH_DOB(9,"Search by DOB"),
	SEARCH_PROJECTID(10,"Search by PROJECTID"),
	SEARCH_TITLE(11,"Search by TITLE"),
	SEARCH_CONTACTNO(12,"Search by CONTACTNO"),
	DELETE(13,"Delete  Record"),
	QUIT(14, "Quit");
	
	private int menuId;
	private String msg;
	
	private ClientMenu(int menuId, String msg){
		this.menuId = menuId;
		this.msg = msg;
	}
	public static ClientMenu getMenu(int menuId){
		ClientMenu menu = null;
		
		for(ClientMenu menuItem : ClientMenu.values())
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
