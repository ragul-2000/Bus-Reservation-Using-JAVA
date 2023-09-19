package com.busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class Booking {
	String PassangerName;
	int busNo;
	Date date;
 Booking(){
	 Scanner s = new Scanner(System.in);
	System.out.println("Enter Name of the Passanger");
	PassangerName = s.nextLine();
	System.out.println("Enter Bus Number");
	busNo = s.nextInt();
	System.out.println("Enter Date dd-mm-yyyy");
	String dateInput = s.nextLine();
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
    try {
		date = dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
    
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo)
              capacity = bus.getCapacity();
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
		
	}
}

