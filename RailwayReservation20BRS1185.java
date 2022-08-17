/*
 * On the 75th Year of India's Independence the Railway department decides to offer special discounts to Freedom Fighters on select trains between select cities. Create a class named RailwayReservation which captures the details such as passenger name, age, seatno, train no, freedom fighter (Y / N), source, destination and ticket fare. The source and destination details and the corresponding fare are populated as below:
     Source Station Chennai Chennai Chennai
Delhi Delhi Mumbai
Destination Mumbai Delhi Kolkata Mumbai Kolkata Kolkata
Ticket Fare 500
800
700
800 700 800
                     
These details should be initialized as the passenger object is created. While creating the object the passenger will enter the source and destination and these details should be populated automatically and the ticket fare should be returned. If the passenger is a freedom fighter he will pass an additional parameter namely freedomFighter = Y while creating the object. The ticket fare should be waived by 50% for the freedom fighter based on his choice of source and destination. Construct a class with suitable constructors, methods, fields etc.
 * 
 */
public class RailwayReservation20BRS1185 {
    private String passengerName;
    private int age;
    private int seatNo;
    private int trainNo;
    private boolean freedomFighter;
    private String source;
    private String destination;
    private double ticketFare;
    
    public RailwayReservation20BRS1185(String passengerName, int age, int seatNo, int trainNo, boolean freedomFighter,
            String source, String destination) {
        this.passengerName = passengerName;
        this.age = age;
        this.seatNo = seatNo;
        this.trainNo = trainNo;
        this.freedomFighter = freedomFighter;
        this.source = source;
        this.destination = destination;
        this.ticketFare = getTicketFare();
        if (freedomFighter) {
            this.ticketFare = this.ticketFare * 0.5;
        }
    }
    


    public RailwayReservation20BRS1185(String passengerName, int age, int seatNo, int trainNo, String source, String destination) {
        this.passengerName = passengerName;
        this.age = age;
        this.seatNo = seatNo;
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;
        this.ticketFare = getTicketFare();
    }
    
    public double getTicketFare() {
        if (source.equals("Chennai") && destination.equals("Mumbai")) {
            ticketFare = 500;
        } else if (source.equals("Chennai") && destination.equals("Delhi")) {
            ticketFare = 800;
        } else if (source.equals("Chennai") && destination.equals("Kolkata")) {
            ticketFare = 700;
        } else if (source.equals("Delhi") && destination.equals("Mumbai")) {
            ticketFare = 800;
        } else if (source.equals("Delhi") && destination.equals("Kolkata")) {
            ticketFare = 700;
        } else if (source.equals("Mumbai") && destination.equals("Kolkata")) {
            ticketFare = 800;
        }
        return ticketFare;
    }
    
    public void display() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Train No: " + trainNo);
        System.out.println("Freedom Fighter: " + freedomFighter);
        System.out.println("Source" + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Fare: " + ticketFare);
    }

    public static void main(String[] args) {
        RailwayReservation20BRS1185 passenger1 = new RailwayReservation20BRS1185("Abdul", 20, 1, 1, true, "Chennai", "Mumbai");
        RailwayReservation20BRS1185 passenger2 = new RailwayReservation20BRS1185("Samik", 20, 2, 2, "Delhi", "Delhi");
        RailwayReservation20BRS1185 passenger3 = new RailwayReservation20BRS1185("Abhinav", 20, 3, 3, "Chennai", "Kolkata");
        passenger1.display();
        passenger2.display();
        passenger3.display();
    }
    
}
