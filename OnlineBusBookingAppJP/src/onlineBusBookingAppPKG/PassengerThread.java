package onlineBusBookingAppPKG;         // declred package

//This represent a Passenger. The reasons for extending the Thread class is that this should carry the data of number of seats.
public class PassengerThread extends Thread{
	// Declare variable of type integer
	private int seatsNeeded;
	
	// Declare constructor of class
	public PassengerThread(int seats, Runnable target, String name) {
		super(target,name); // calling the master constructor
		this.seatsNeeded = seats; // set the value given by user
	}

	//function return required seats from customer
	public int getSeatsNeeded() {
		return seatsNeeded; // Returns the value of seats booked
	}

}