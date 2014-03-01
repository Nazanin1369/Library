package org.MUM.Library.Member;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.MUM.Library.Item.ItemCopy;

public class Member implements IMember 
{
	private String id;
	private String name;
	private String address;
	private String phone;
	ArrayList<Loan> loans = new ArrayList<Loan>();
	ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	//Constructor
	public Member(String id, String name, String address, String phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	//Methods
	public void addALone(Loan loan)
	{
		loans.add(loan);
	}

	//---------------------------------------------------------

	public void addAReservation(Reservation reservation)
	{
		reservations.add(reservation);
	}
	//RESERVE---------------------------------------------------

	public void reserveItem(ItemCopy item)
	{
		if(item.isAvailable() == false)
		{
			System.out.println("\n!Can not reserve--------!!!!");
			System.out.println("This item is not available");
			return;
		}

		else if(item.isBorrowed() == false) 
		{
			System.out.println("\n!Can not reserve--------!!!!");
			System.out.println("This item is not borrowed. you can borrow it now.");
			return;
		}

		else if(item.isReserved() == true)
		{
			System.out.println("\n!Can not reserve--------!!!!");
			System.out.println("This item has been already reserved. ");
			return;
		}

		else
		{
			item.setReserved(true);
			Date d = new Date();
			Reservation reserve = new Reservation(d, item);
			reservations.add(reserve);
			System.out.println("\nReservation--------RRRRRR");
			System.out.println(item.getItem().getTitle() + " is reserved by "+this.getName() + " on:\n" + d);
		}

	}


	//BORROW--------------------------------------------------------

	public void borrowItem(ItemCopy item)
	{

		if(item.isAvailable() == false)
		{
			System.out.println("\n!Can not Borrow--------!!!!");
			System.out.println("This item is not available");

		}
		else if(item.isBorrowed() == true)
		{
			System.out.println("\n!Can not Borrow--------!!!!");
			System.out.println("This item has been borrowed.");

		}
		else if(item.isReserved() == true)
		{
			System.out.println("\n!Can not Borrow--------!!!!");
			System.out.println("This item is reserved you can not borrow it at the moment.");

		}
		else
		{
			GregorianCalendar calOut = new  GregorianCalendar();
			GregorianCalendar calIn = new  GregorianCalendar();
			Date now = new Date();
			calIn.setTime(now);
			int year = calIn.get(Calendar.YEAR);
			int month = calIn.get(Calendar.MONTH);
			int day = calIn.get(Calendar.DAY_OF_MONTH);
			calOut.set(year, month+1, day);
			Date d = calOut.getTime();
			
			item.setBorrowed(true);
			Loan loan = new Loan(now, d);
			this.addALone(loan);
			System.out.println("\nBorrow-------->>>>>");
			System.out.println(item.getItem().getTitle()+ " is borrowed by "+this.getName());
			System.out.println("Check_in_date: "+ loan.getCheck_out_Date() );
			System.out.println("Check_out_date: "+loan.getReturn_Date());
		}


	}

	//RETURN-------------------------------------------

	public void returnItem(ItemCopy item)
	{
		Date d = new Date();
		item.setBorrowed(false);
		System.out.println("\nReturn--------<<<<<");
		System.out.println(item.getItem().getTitle()+ " is returned by "+this.getName()+ " on :\n"+ d );
		for(Loan l : loans)
		{
			if(item.getLoan() == l)
			{
				System.out.println("Check_out_date:\n"+l.getReturn_Date());
			}
		}

	}

	//-------------------------------------------

	public void cancelReservation(ItemCopy item)
	{
		item.setReserved(false); 
		System.out.println("\nCancel Reservation------CCCC");
		System.out.println("Reservation on item, "+item.getItem().getTitle()+ " got canceled by "+this.getName() );

	}
	//getters and setters
	public String getId() 
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public ArrayList<Loan> getLoans() 
	{
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) 
	{
		this.loans = loans;
	}

	public ArrayList<Reservation> getReservations() 
	{
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations)
	{
		this.reservations = reservations;
	}

}

