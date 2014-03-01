package org.MUM.Library.Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.MUM.Library.Item.*;
import org.MUM.Library.Member.*;

public class Main
{
	static Main m = new Main();
	ArrayList<Member> members = new ArrayList<Member>();
	ArrayList<ItemCopy> items = new ArrayList<ItemCopy>();

	public static void main(String[] args)
	{

		Member nazanin = new Member("123","Nazanin", "Room157,1000 N 4th Street,Fairfield,Iowa", "641-2330256");
		Member shokoofeh = new Member ("124","Shokoofeh", "Room 146,1000 N 4th Street,Fairfield,Iowa", "641-9542346");
		Member jane = new Member("125", "Jane", "Iowa city", "641-9876543");


		Book parallelProgramming = new Book ("Parallel Programming book","12345678", 3);
		Book AliceInTheWonderLand = new Book ("Alice In The WonderLand book", "87654321", 2 );
		Book DataBases = new Book ("Data Bases book","98765432", 2);
		Book learningJava = new Book ("Learning Java book", "28374656", 3);
		Book tammingText = new Book ("Tamming text book", "90875983", 1);

		parallelProgramming.addAnAuthor(new Author("Lily day"));
		AliceInTheWonderLand.addAnAuthor(new Author("Kelly vhu"));
		DataBases.addAnAuthor(new Author("C J Date"));
		learningJava.addAnAuthor(new Author("Michael hui"));
		tammingText.addAnAuthor(new Author("Mary Gort"));
		
		Magazine ieee = new Magazine("IEEE magazine", "876", 4);
		Magazine technologyDay = new Magazine ("Technology Day", "943", 3);
		Magazine beautySalon = new Magazine ("Beauty Salon", "955", 2);

		//Making item copies-----------------------------------------------------------------------------------------

		ItemCopy tammingTextCopy1 = new ItemCopy("tm1", true);
		m.items.add(tammingTextCopy1);
		tammingText.addACopy(tammingTextCopy1);
		tammingTextCopy1.setItem(tammingText);
		//
		ItemCopy DataBasesCopy1 = new ItemCopy("db1",true);
		m.items.add(DataBasesCopy1);
		DataBases.addACopy(DataBasesCopy1);
		DataBasesCopy1.setItem(DataBases);
		
		ItemCopy DataBasesCopy2 = new ItemCopy("db1",true);
		m.items.add(DataBasesCopy2);
		DataBases.addACopy(DataBasesCopy2);
		DataBasesCopy2.setItem(DataBases);
		//
		ItemCopy ieee1 = new ItemCopy("db1",true);
		m.items.add(ieee1);
		ieee.addACopy(ieee1);
		ieee1.setItem(ieee);
		
		ItemCopy ieee2 = new ItemCopy("db1",true);
		m.items.add(ieee2);
		ieee.addACopy(ieee2);
		ieee2.setItem(ieee);
		
		ItemCopy ieee3 = new ItemCopy("db1",true);
		m.items.add(ieee3);
		ieee.addACopy(ieee3);
		ieee3.setItem(ieee);
		
		ItemCopy ieee4 = new ItemCopy("db1",true);
		m.items.add(ieee4);
		ieee.addACopy(ieee4);
		ieee4.setItem(ieee);
		
		//adding members-----------------------------------------------------------------------------------------------------------

		m.members.add(shokoofeh);
		m.members.add(nazanin);
		m.members.add(jane);

		//Taming text book--------------------------------------------------------------------------------

	
	
		nazanin.borrowItem(tammingTextCopy1);
		nazanin.returnItem(tammingTextCopy1);
		nazanin.borrowItem(tammingTextCopy1);
		shokoofeh.borrowItem(tammingTextCopy1);
		nazanin.reserveItem(tammingTextCopy1);
		nazanin.cancelReservation(tammingTextCopy1);



		//Database Book
		
	
		shokoofeh.borrowItem(DataBasesCopy1);
		shokoofeh.returnItem(DataBasesCopy1);
		shokoofeh.borrowItem(DataBasesCopy1);
		shokoofeh.reserveItem(DataBasesCopy1);
		nazanin.reserveItem(DataBasesCopy1);
		shokoofeh.cancelReservation(DataBasesCopy1);


		//ieee magazine
	
		
		jane.borrowItem(ieee1);
		nazanin.borrowItem(ieee1);
		nazanin.reserveItem(ieee1);
		shokoofeh.reserveItem(ieee1);
		jane.returnItem(ieee1);
	}

	

}
