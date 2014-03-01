package org.MUM.Library.Item;

import java.util.ArrayList;


public abstract class AItem implements IItem
{
	private String title;
	ArrayList<ItemCopy> itemCopies = new ArrayList<ItemCopy>();
	

	
	//Constructor
	
	public AItem(String title) 
	{
		this.title = title;
	}


	//Methods
	
	public boolean checkAvailability()
	{
		if(itemCopies.size() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	//-------------------------------------------
	
	public void addACopy(ItemCopy itemCopy)
	{
		itemCopies.add(itemCopy);
	}
	//getters and setters
	
	public ArrayList<ItemCopy> getItemCopies()
	{
		return itemCopies;
	}


	public void setItemCopies(ArrayList<ItemCopy> itemCopies)
	{
		this.itemCopies = itemCopies;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
