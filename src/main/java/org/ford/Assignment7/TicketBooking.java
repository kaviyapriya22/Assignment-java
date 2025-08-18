package org.ford.Assignment7;

public class TicketBooking {

    public void bookTickets(String movieName, int cnt) throws TicketLimitExceededException {
        if (cnt > 6) {
            throw new TicketLimitExceededException("Cannot book more that 6 tickets at once");
        }
    }
}
