package org.MUM.Library.Member;

import java.util.Date;
import org.MUM.Library.Item.ItemCopy;

public class Loan 
{
	private Date check_out_Date;
	private Date return_Date;
	ItemCopy itemCopy;
	Member member;
	
	//Constructor
	public Loan(Date check_out_Date, Date return_Date)
	{
		super();
		this.check_out_Date = check_out_Date;
		this.return_Date = return_Date;
	}
	
	//getters and setters
	public Date getCheck_out_Date() 
	{
		return check_out_Date;
	}
	
	public void setCheck_out_Date(Date check_out_Date)
	{
		this.check_out_Date = check_out_Date;
	}
	
	public Date getReturn_Date() 
	{
		return return_Date;
	}
	
	public void setReturn_Date(Date return_Date) 
	{
		this.return_Date = return_Date;
	}
	
	
	

}
