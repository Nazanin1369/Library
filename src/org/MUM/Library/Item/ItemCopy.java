package org.MUM.Library.Item;

import org.MUM.Library.Member.Loan;

public class ItemCopy implements IItemCopy
{
	private String copyId;
	private boolean available;
	private boolean isBorrowed = false;
	private boolean isReserved = false;
	
	AItem item;
	Loan loan;
	
	public ItemCopy(String copyId, boolean available)
	{
		this.copyId = copyId;
		this.available = available;
	}
	
	
	

	//getters and setters

	public boolean isBorrowed() 
	{
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) 
	{
		this.isBorrowed = isBorrowed;
	}

	public boolean isReserved()
	{
		return isReserved;
	}
	public void setReserved(boolean isReserved) 
	{
		this.isReserved = isReserved;
	}
	public AItem getItem() 
	{
		return item;
	}
	public void setItem(AItem item) 
	{
		this.item = item;
	}

	public Loan getLoan()
	{
		return loan;
	}

	public void setLoan(Loan loan) 
	{
		this.loan = loan;
	}

	public String getCopyId() 
	{
		return copyId;
	}
	public void setCopyId(String copyId) 
	{
		this.copyId = copyId;
	}
	
	public boolean isAvailable() 
	{
		  return available;
	}
	public void setAvailable(boolean available) 
	{
		this.available = available;
	}
	

}
