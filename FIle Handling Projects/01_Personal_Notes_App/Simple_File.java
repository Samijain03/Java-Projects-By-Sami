
import java.io.*;
import java.util.Scanner;

// Exception handling 
class WrongInputException extends Exception {
    public WrongInputException(String msg) {
        super(msg);
    }
}

//Main class
class Simple_File{
	String data;
	Scanner s = new Scanner(System.in);
	// Constructor
	public Simple_File(){
	
	while (true) {
	System.out.println("\n---Menu---");
	System.out.println("Enter what u want to do: ");
	System.out.println("1: Write Operation on File");
	System.out.println("2: Read Operation on File");
	System.out.println("3: Clear Old texts");
	System.out.println("4: Exit");
	System.out.print("Your Choice: ");
	//taking Choice Input
	int choice = s.nextInt();
	s.nextLine();
	if(Choice == 1){
	// Calls the method that takes input that will be written in file
	this.data = Input_For_Data();
	//Calls the method that create or update the file
	this.FileWriterCustom();
	}
	else if (Choice == 2){
		//Call Method that read the file and show in Console
		this.FileReaderCustom();
	}
	else if (Choice == 3){
	System.out.print("Write in clean file: ");
	// Calls the method that takes input that will be written in file
	this.data = Input_For_Data();
	//Clears all data in a file
	this.deleteWrittenData();
	}
	else if (Choice == 4){
		//Exits the execution
		System.exit(0);
	}
	else{
		try{
			throw new WrongInputException("Wrong Input");
		}
		catch(WrongInputException e){
			System.out.println(e.getMessage());
		}
	}
	}
	}
	// Input Method 
	public String Input_For_Data(){
			String data = s.nextLine();
			return data;
	}
	// File Writer Method
	public void FileWriterCustom(){
		try(RandomAccessFile raf = new RandomAccessFile("Personal_Notes.txt" , "rw")){
		// Gets the end of the file and move the cursor there
		raf.seek(raf.length());
		if(raf.length() > 0){
			//Changes Line
			raf.writeBytes("\r\n");
		}
		//Writes in File
		raf.writeBytes(this.data);
		System.out.println("Saved!");
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	//File Reader Method
	public void FileReaderCustom(){
		try(RandomAccessFile raf = new RandomAccessFile("Personal_Notes.txt" , "r")){
			String line;
			// Set the cursor at point 0
			raf.seek(0);
			//Will read till the end of the file
			while((line = raf.readLine()) != null){
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	//Truncate the file data
	public void deleteWrittenData(){
		try(RandomAccessFile raf = new RandomAccessFile("Personal_Notes.txt" , "rw"))
		{
			//Wipe all data 
			raf.setLength(0);
			System.out.println("Old Data Deleted.");
			raf.writeBytes(this.data);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String [] args){
		//Creating Object of the Class 
		new Simple_File();
	}
}