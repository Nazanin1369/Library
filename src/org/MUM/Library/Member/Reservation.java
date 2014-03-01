package org.MUM.Library.Member;
import java.util.Date;
import org.MUM.Library.Item.IItem;
import org.MUM.Library.Item.ItemCopy;

public class Reservation implements IItem
{
	private Date reservationDate;
	ItemCopy item;

	public Reservation(Date reservationDate,ItemCopy item )
	{
		this.reservationDate = reservationDate;
		this.item = item;
	}
	
	//Methods
	
	@Override
	public boolean checkAvailibility()
	{
		if(item.isAvailable())
			return true;
		else return false;
	}

	//getters and setters
	
		public Date getReservationDate() {
			return reservationDate;
		}


		public void setReservationDate(Date reservationDate) {
			this.reservationDate = reservationDate;
		}


}
