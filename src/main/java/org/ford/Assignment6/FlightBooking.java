package org.ford.Assignment6;

public class FlightBooking {


    boolean [] seats = new boolean [6];
    public void  bookSeat(int seatNumber) {

        if (seatNumber<0 || seatNumber>=seats.length){
            throw new ArrayIndexOutOfBoundsException("The seat number exceeds the boundary");
        }
        if (seats[seatNumber]==true){
            throw new IllegalStateException("The seat number is already booked");
        }
        seats[seatNumber] = true;
        System.out.println("Seat booked successfully: " + seatNumber);
    }

    public void printSeatStatus(){
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Unbooked"));
        }

    }
}
