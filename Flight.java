package classAndObjects;
class FlightDetails{
	private String flightNumber;
	private String from;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private double ticketPrice;
	private static int totalFlightsAvailable;
	{
		totalFlightsAvailable++;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public static int getTotalFlightsAvailable() {
		return totalFlightsAvailable;
	}
	void printFlightDetails() {
		System.out.println(flightNumber);
		System.out.println(from);
		System.out.println(destination);
		System.out.println(arrivalTime);
		System.out.println(departureTime);
		System.out.println(ticketPrice);
		
	}
	
}

public class Flight {

	public static void main(String[] args) {
		FlightDetails f1=new FlightDetails();
		
		f1.setFlightNumber("IG871");
		f1.setFrom("Chennai");
		f1.setDestination("Goa");
		f1.setDepartureTime("12:10 hrs");
		f1.setArrivalTime("14:30 hrs");
		f1.setTicketPrice(5678);
		f1.printFlightDetails();
		
		FlightDetails f2=new FlightDetails();
		
		f2.setFlightNumber("AI071");
		f2.setFrom("TRICHY");
		f2.setDestination("GUWAHATI");
		f2.setDepartureTime("10:10 hrs");
		f2.setArrivalTime("01:30 hrs");
		f2.setTicketPrice(8786);
		f2.printFlightDetails();
		
		System.out.println(FlightDetails.getTotalFlightsAvailable());
	}

}
