package techm.urvashi.caselet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

public class Caselet1Main{

	public static void main(String[] args) throws IOException {

		BufferedReader kbIn = new BufferedReader(new InputStreamReader(System.in));
		String choice = "";
		System.out.println("Employee/Client? ");
		choice = kbIn.readLine();
		
		if(choice.equalsIgnoreCase("employee")){
			
			List<Employee> empList = new ArrayList<Employee>();
			
			String fileName ="TechmEmps.dat";
			
			EmpStoreKeeper.load(empList, fileName);
			
			EmployeeMenu ch = null;
			
			Employee e = null;
			CompareEmployee cmp = null;
			TreeMap<String, Employee> map = null;
			
			do{
				System.out.println("\nMenu\n=================");
				// implementing iterative enumeration
				for(EmployeeMenu menuItem :EmployeeMenu.values())
					System.out.println(menuItem);
				
				System.out.println("Choice? ");
				int menuId = Integer.parseInt(kbIn.readLine());
				ch = EmployeeMenu.getMenu(menuId);
				
				switch(ch){
					case ADD_EMP:
						 e = new Employee();
						
						 System.out.println("Name? ");
						 e.setName(kbIn.readLine());
						 System.out.println("DoB? (dd-mm-yyyy)");
						 	System.out.println("dd?");
						 	int dd1 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" mm?");
						 	int mm1 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" yyyy?");
						 	int yy1 = (Integer.parseInt(kbIn.readLine()));
						 e.setDob(new Date(yy1-1900,mm1-1,dd1));
						 
						 System.out.println("GID? ");
						 e.setGid(kbIn.readLine());
						 System.out.println("Basic? ");
						 e.setBasic(Double.parseDouble(kbIn.readLine()));
						 System.out.println("DoJ? (dd-mm-yyyy)");
						 	System.out.println("dd?");
						 	int dd2 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" mm?");
						 	int mm2 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" yyyy?");
						 	int yy2 = (Integer.parseInt(kbIn.readLine()));
						 e.setDoj(new Date(yy2-1900,mm2-1,dd2));
						
						 BankAccount ba = new BankAccount();
						 
						 System.out.println("Account No? ");
						 ba.setAcntNo(kbIn.readLine());
						 System.out.println("Bank Name? ");
						 ba.setBankName(kbIn.readLine());
						 System.out.println("Branch? ");
						 ba.setBranch(kbIn.readLine());
						 
						 e.setSalaryAcnt(ba);
						 empList.add(e);
						 System.out.println("Employee Record Added");
						 break;
						
					case DISPLAY:
						 for(Employee e1 : empList)
							System.out.println(e1);
						 System.out.println(empList.size()+ " employees found");
						 break;
						 
					case SORT_NAME: cmp = new CompareEmployee(EmployeeEnum.NAME);
				 	 	 Collections.sort(empList,cmp);
				 	 	 System.out.println("Sorted"); 
				 	 	 break;
						
					case SORT_DOB: cmp = new CompareEmployee(EmployeeEnum.DOB);
			 	 	 	 Collections.sort(empList,cmp);
			 	 	 	 System.out.println("Sorted"); 
			 	 	 	 break;	 
			 	 	 	 
					case SORT_DOJ: cmp = new CompareEmployee(EmployeeEnum.DOJ);
		 	 	 	 	 Collections.sort(empList,cmp);
		 	 	 	 	 System.out.println("Sorted"); 
		 	 	 	 	 break; 
					
					case SORT_NETPAY: cmp = new CompareEmployee(EmployeeEnum.NETPAY);
				 	 	 Collections.sort(empList,cmp);
				 	 	 System.out.println("Sorted"); 
				 	 	 break;
				 	 	
					case SORT_GID: cmp = new CompareEmployee(EmployeeEnum.GID);
					 	 Collections.sort(empList,cmp);
					 	 System.out.println("Sorted"); 
					 	 break;
					 	 
					case SEARCH_NAME: 
						 String name = "";
						 while(true){
						 System.out.println("'quit' or 'name?' " );
						 name = kbIn.readLine();
						 if(name.equalsIgnoreCase("quit")) 
							 break;
						 
						 for(Employee emp : empList){
							 if(emp.getName().equalsIgnoreCase(name)) 
								 System.out.println(emp);
						 	}
						 }
						 break;
						 
					case SEARCH_DOB: map= new TreeMap<String, Employee>();
			 	 	 	 for(Employee emp : empList)
			 	 	 		 map.put(emp.getDob().toString(), emp);
			 	 	 	 String dob = "";
			 	 	 	 while(true){
			 	 	 		 System.out.println("'quit' or 'dob?' " );
			 	 	 		 dob = kbIn.readLine();
			 	 	 		 if(dob.equalsIgnoreCase("quit")) 
			 	 	 			 break;
			 	 	 		 e=map.get(dob);
			 	 	 		 if(dob==null) 
			 	 	 			 System.out.println("Employee not found");
			 	 	 		 else System.out.println(e);
			 	 	 	 }
			 	 	 	 map=null; // to close the map
			 	 	 	 break;
					 
					case SEARCH_DOJ: map= new TreeMap<String, Employee>();
		 	 	 	 	 for(Employee emp : empList)
		 	 	 	 		 map.put(emp.getDoj().toString(), emp);
		 	 	 	 	 String doj = "";
		 	 	 	 	 while(true){
		 	 	 	 		 System.out.println("'quit' or 'doj?' " );
		 	 	 	 		 doj = kbIn.readLine();
		 	 	 	 		 if(doj.equalsIgnoreCase("quit")) 
		 	 	 	 			 break;
		 	 	 	 		 e=map.get(doj);
		 	 	 	 		 if(doj==null) 
		 	 	 	 			 System.out.println("Employee not found");
		 	 	 	 		 else System.out.println(e);
		 	 	 	 	 }
		 	 	 	 	 map=null; // to close the map
		 	 	 	 	 break;
					 	 
					case SEARCH_GID: map= new TreeMap<String, Employee>();
						 for(Employee emp : empList)
							 map.put(emp.getGid(), emp);
						 String gid = "";
						 while(true){
							 System.out.println("'quit' or 'gid?' " );
							 gid = kbIn.readLine();
							 if(gid.equalsIgnoreCase("quit")) 
								 break;
							 e=map.get(gid);
							 if(gid==null) 
								 System.out.println("Employee not found");
							 else System.out.println(e);
						 }
						 map=null; // to close the map
						 break;
						 
					case SEARCH_BASIC: 
						 String basic = "";
						 while(true){
						 System.out.println("'quit' or 'basic?' " );
						 basic = kbIn.readLine();
						 if(basic.equalsIgnoreCase("quit")) 
							 break;
						 double b =Double.parseDouble(basic);
						 for(Employee emp : empList){
							 if(emp.getBasic()==b) 
								 System.out.println(emp);
						 }
						
						 }
						 break;
						 
					case DELETE:
						 map = new TreeMap<String,Employee>();
						 for(Employee emp : empList)
							 map.put(emp.getGid(),emp);
						 String gid1="";
						 while(true){
							 System.out.println("'quit' or 'gid?' " );
							 gid1 = kbIn.readLine();
							 if(gid1.equalsIgnoreCase("quit")) 
								 break;
							 Employee emp = map.get(gid1);
						
						 if(emp==null) 
							 System.out.println("Employee not found");
						 else{
							 empList.remove(emp);
							// map.remove(gid1);
						 }
						 }
						 map=null;
						 break;
						 
					case QUIT: 
						 EmpStoreKeeper.save(empList, fileName);
						 System.out.println("The End"); 
						 break;
					
					default: System.out.println("Invalid Choice");
				}
			}while(ch!=EmployeeMenu.QUIT);
		
		}
		
		if(choice.equalsIgnoreCase("client")){
			
			ArrayList<Client> clientList = new ArrayList<Client>();
			
			String fileName ="TechmClients.dat";
			
			ClientStoreKeeper.load(clientList, fileName);
			
			ClientMenu ch = null;
			
			Client c = null;
			CompareClient cmp = null;
			TreeMap<String, Client> map = null;
			
			do{
				System.out.println("\nMenu\n=================");
				// implementing iterative enumeration
				for(ClientMenu menuItem :ClientMenu.values())
					System.out.println(menuItem);
				
				System.out.println("Choice? ");
				int menuId = Integer.parseInt(kbIn.readLine());
				ch = ClientMenu.getMenu(menuId);
				
				switch(ch){
					case ADD_CLIENT:
						 c = new Client();
						
						 System.out.println("Name? ");
						 c.setName(kbIn.readLine());
						 System.out.println("DoB? (dd-mm-yyyy)");
						 	System.out.println("dd?");
						 	int dd1 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" mm?");
						 	int mm1 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" yyyy?");
						 	int yy1 = (Integer.parseInt(kbIn.readLine()));
						 c.setDob(new Date(yy1-1900,mm1-1,dd1));
						 System.out.println("ContactNo? ");
						 c.setContactNo(kbIn.readLine());
						
						 Project prj = new Project();
						 
						 System.out.println("ProjectId? ");
						 prj.setProjId(kbIn.readLine());
						 System.out.println("Title? ");
						 prj.setTitle(kbIn.readLine());
						 System.out.println("Desc? ");
						 prj.setDesc(kbIn.readLine());
						 System.out.println("StartDate? (dd-mm-yyyy)");
						 	System.out.println("dd?");
						 	int dd2 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" mm?");
						 	int mm2 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" yyyy?");
						 	int yy2 = (Integer.parseInt(kbIn.readLine()));
						 prj.setStartDate(new Date(yy2-1900,mm2-1,dd2));
						 System.out.println("EndDate? (dd-mm-yyyy)");
						 	System.out.println("dd?");
						 	int dd3 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" mm?");
						 	int mm3 = (Integer.parseInt(kbIn.readLine()));
						 	System.out.println(" yyyy?");
						 	int yy3 = (Integer.parseInt(kbIn.readLine()));
						 prj.setStartDate(new Date(yy3-1900,mm3-1,dd3));
						 
						 c.setProjectData(prj);
						 clientList.add(c);
						 System.out.println("Client Record Added");
						 break;
						
					case DISPLAY:
						 for(Client c1 : clientList)
							System.out.println(c1);
						 System.out.println(clientList.size()+ " clients found");
						 break;
						 
					case SORT_NAME: cmp = new CompareClient(ClientEnum.NAME);
				 	 	 Collections.sort(clientList, cmp);
				 	 	 System.out.println("Sorted"); 
				 	 	 break;
						
					case SORT_DOB: cmp = new CompareClient(ClientEnum.DOB);
			 	 	 	 Collections.sort(clientList,cmp);
			 	 	 	 System.out.println("Sorted"); 
			 	 	 	 break;
					
					case SORT_PROJECTID: cmp = new CompareClient(ClientEnum.PROJECTID);
				 	 	 Collections.sort(clientList,cmp);
				 	 	 System.out.println("Sorted"); 
				 	 	 break;
				 	 	
					case SORT_TITLE: cmp = new CompareClient(ClientEnum.TITLE);
					 	 Collections.sort(clientList,cmp);
					 	 System.out.println("Sorted"); 
					 	 break;
					 	 
					case SORT_CONTACTNO: cmp = new CompareClient(ClientEnum.CONTACTNO);
				 	 	 Collections.sort(clientList,cmp);
				 	 	 System.out.println("Sorted"); 
				 	 	 break;
					 	 
					case SEARCH_NAME: 
						 String name = "";
						 while(true){
						 System.out.println("'quit' or 'name?' " );
						 name = kbIn.readLine();
						 if(name.equalsIgnoreCase("quit")) 
							 break;
						 
						 for(Client client : clientList){
							 if(client.getName().equalsIgnoreCase(name)) 
								 System.out.println(client);
						 	}
						 }
						 break;
						 
					case SEARCH_DOB: map= new TreeMap<String, Client>();
			 	 	 	 for(Client client : clientList)
			 	 	 		 map.put(client.getDob().toString(), client);
			 	 	 	 String dob = "";
			 	 	 	 while(true){
			 	 	 		 System.out.println("'quit' or 'dob?' " );
			 	 	 		 dob = kbIn.readLine();
			 	 	 		 if(dob.equalsIgnoreCase("quit")) 
			 	 	 			 break;
			 	 	 		 c=map.get(dob);
			 	 	 		 if(dob==null) 
			 	 	 			 System.out.println("Client not found");
			 	 	 		 else System.out.println(c);
			 	 	 	 }
			 	 	 	 map=null; // to close the map
			 	 	 	 break;
					 	 
					case SEARCH_PROJECTID: map= new TreeMap<String, Client>();
						 for(Client client : clientList)
							 map.put(client.getProjectData().getProjId(), client);
						 String prjId = "";
						 while(true){
							 System.out.println("'quit' or 'projectId?' " );
							 prjId = kbIn.readLine();
							 if(prjId.equalsIgnoreCase("quit")) 
								 break;
							 c=map.get(prjId);
							 if(prjId==null) 
								 System.out.println("Client not found");
							 else System.out.println(c);
						 }
						 map=null; // to close the map
						 break;
						 
					case SEARCH_TITLE: map= new TreeMap<String, Client>();
					 	 for(Client client : clientList)
					 		 map.put(client.getProjectData().getTitle(), client);
					 	 String tt = "";
					 	 while(true){
					 		 System.out.println("'quit' or 'title?' " );
					 		 tt = kbIn.readLine();
					 		 if(tt.equalsIgnoreCase("quit")) 
					 			 break;
					 		 c=map.get(tt);
					 		 if(tt==null) 
					 			 System.out.println("Client not found");
					 		 else System.out.println(c);
					 	 }
					 	 map=null; // to close the map
					 	 break;
					 	 
					case SEARCH_CONTACTNO: map= new TreeMap<String, Client>();
				 	 	 for(Client client : clientList)
				 	 		 map.put(client.getProjectData().getTitle(), client);
				 	 	 String no = "";
				 	 	 while(true){
				 	 		 System.out.println("'quit' or 'contact no?' " );
				 	 		 no = kbIn.readLine();
				 	 		 if(no.equalsIgnoreCase("quit")) 
				 	 			 break;
				 	 		 c=map.get(no);
				 	 		 if(no==null) 
				 	 			 System.out.println("Client not found");
				 	 		 else System.out.println(c);
				 	 	 }
				 	 	 map=null; // to close the map
				 	 	 break;
						 
					case DELETE:
						 map = new TreeMap<String,Client>();
						 for(Client client : clientList)
							 map.put(client.getProjectData().getProjId(),c);
						 String id="";
						 while(true){
							 System.out.println("'quit' or 'prjId?' " );
							 id = kbIn.readLine();
							 if(id.equalsIgnoreCase("quit")) 
								 break;
							 Client client = map.get(id);
						
						 	if(client==null) 
						 		System.out.println("Clients not found");
						 	else{
						 		clientList.remove(client);
						 		map.remove(id);
						 	}
						 }
						 break;
						 
					case QUIT: 
						 ClientStoreKeeper.save(clientList, fileName);
						 System.out.println("The End"); 
						 break;
					
					default: System.out.println("Invalid Choice");
				}
			}while(ch!=ClientMenu.QUIT);
		
		}
		else{
			System.out.println("Invalid Choice");
		}
	}

}
