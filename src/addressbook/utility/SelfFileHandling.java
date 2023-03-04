package addressbook.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import addressbook.model.Contacts;

public class SelfFileHandling {

	static File file = new File("AddressBook.txt");
	static int index  = -1;
	//create file
	public void createFile() {
		try {
		file.createNewFile();
		System.out.println(" File Created :: " + file.getName());
		}catch(IOException e) {
			e.printStackTrace();
			System.err.println(" Unable to Create File");
		}
	}
	
	//write file
	public int writeFile(Contacts contacts) {
		try {
		FileWriter fileWriter = new FileWriter(file,true);
		fileWriter.append(contacts.toString()+'\n');
		index++;
		fileWriter.close();
		return index;
		}catch (IOException e) {
			e.printStackTrace();
			return -2;
		}
	}
	
	//read file
	public void readFile() {
		try {
			Scanner readFile = new Scanner(file);
			while(readFile.hasNextLine()) {
				String readLine = readFile.nextLine();
				System.out.println(readLine);
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//delete file
	public void deleteFile() {
		if(file.delete()) {
			System.out.println(" File deleted :: " + file.getName());
		}else {
			System.err.println(" Unable to delete file ");
		}
	}
	
//	
//	public static void main(String[] args) {
//		
//		Scanner userInput = new Scanner(System.in);
//		SelfFileHandling selfFileHandlingObj = new SelfFileHandling();
//		
//		
//		
//		
//		try {
//		do {
//			System.out.println(" Press 1 :: Create file :: " +'\n'
//								+" Press 2 :: Write file :: " +'\n'
//								+" Press 3 :: Read file :: " +'\n'
//								+" Press 4 :: Delete file :: ");
//			System.out.println(" Enter option :: ");
//		switch (userInput.nextByte()) {
//		case 1:
//			selfFileHandlingObj.createFile(file);
//			break;
//		case 2:
//			selfFileHandlingObj.writeFile(file);
//			break;
//		case 3:
//			selfFileHandlingObj.readFile(file);
//			break;
//		case 4:
//			selfFileHandlingObj.deleteFile(file);
//			break;
//		default:
//			System.out.println(" Invalid Option ");
//		}
//		System.out.println(" Press 1 :: Re-Visit Menu"+'\n'+" Press 0 :: Exit Menu");
//		}while(userInput.nextByte() == 1);
//		
//		}catch (InputMismatchException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	
//	}

}
