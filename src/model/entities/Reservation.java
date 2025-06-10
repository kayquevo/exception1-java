package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // diferença em milisec
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte milisec para dias
	}
	public void updateDates(Date checkIn, Date checkOut) {
			this.checkIn = checkIn;
			this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Room " + roomNumber +
				", check-in: " + sdf.format(checkIn) +
				", checkout: " + sdf.format(checkIn) +
				", " + duration() + " nights";
	}
	
	

}
