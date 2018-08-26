package techm.urvashi.caselet1;

//to implement persistent layer i.e. data is copied from file to a data structure.The actual
//file is not disturbed. When we quit the data from the data structure overwrites the file.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class EmpStoreKeeper {

	//to save data from data structure onto the file.
	public static void save(List<Employee> empList, String fileName){
		
		File store = new File(fileName);
		
		if(store.exists())
			store.delete();
		
		try{
			store.createNewFile();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(store));
			oos.writeInt(empList.size());
			for(Employee e : empList)
				oos.writeObject(e);
			oos.close();
		}
		catch(IOException ex){
			System.out.println("Saving failed");
			System.out.println(ex.getMessage());
		}
	}
		
	//to fetch data from file into data structure
	public static void load(List<Employee> empList, String storeName){
			
		File store = new File(storeName);
			
			try{
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(store));
				int recCount = ois.readInt();
				for(int i=1; i<=recCount; i++)
					empList.add((Employee)ois.readObject());
				ois.close();
			}
			catch(FileNotFoundException ex){
				System.out.println("Saving failed");
				System.out.println(ex.getMessage());
			}
			catch(IOException ex){ // IOException is the parent exception class of 
				//FileNotFound. So it should be caught before IOException
				System.out.println("Saving failed");
				System.out.println(ex.getMessage());
			}
			catch(ClassNotFoundException ex){//this exception is in java.lang
				//so imported by default
				System.out.println("Loading failed");
				System.out.println(ex.getMessage());
			}
	}
	
}
