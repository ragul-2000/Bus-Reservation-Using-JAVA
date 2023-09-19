package com.busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {

    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + busNo + " AC: " + ac + " Total Capacity: " + capacity);
    }

	public int getBusNo() {
		// TODO Auto-generated method stub
		return busNo;
	}
}


