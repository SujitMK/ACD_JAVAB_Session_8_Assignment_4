package onlineBusBookingAppPKG;                         // declared a package

public class OnlineBusBookingApp {              // declared and defined a class

	public static void main(String[] args) {                   // main method
		// TODO Auto-generated method stub
		
		// initializing the class Bus Reservation
		BusTicketBooking reserveBus = new BusTicketBooking();
		// initialize the thread to book the tickets
		PassengerThread pt1 = new PassengerThread(2,reserveBus ,"Sujit");
		// initialize the thread to book the tickets
		PassengerThread pt2 = new PassengerThread(3, reserveBus , "Ajit");
		pt1.start();	// Start the Thread
		pt2.start();	// Start the Thread

	}

}
