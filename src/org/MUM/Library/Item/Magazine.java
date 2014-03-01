package org.MUM.Library.Item;


public class Magazine extends AItem
{
	private String issueNumber;
	private int limit;

	//Constructor
	public Magazine(String title,String issueNumber, int limit) 
	{
		super(title);
		this.issueNumber = issueNumber;
		this.limit = limit;
		
	}

	//Methods
	@Override
	public boolean checkAvailibility() 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	
	//getters and setters
	public String getIssueNumber() 
	{
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber)
	{
		this.issueNumber = issueNumber;
	}

	public int getLimit() 
	{
		return limit;
	}

	public void setLimit(int limit) 
	{
		this.limit = limit;
	}

}
