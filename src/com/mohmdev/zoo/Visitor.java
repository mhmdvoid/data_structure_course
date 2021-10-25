package com.mohmdev.zoo;

import java.util.List;

class Ticket {

    enum TicketLevel {
        BasicTour, FullTour  // شامل
    }

    TicketLevel ticketLevel;
    private float price;
    private boolean isActive = false;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Ticket(TicketLevel ticketLevel) {
        this.ticketLevel = ticketLevel;
    }

    public void setTicketLevel(TicketLevel ticketLevel) {
        this.ticketLevel = ticketLevel;
    }

    public TicketLevel getTicketLevel() {
        return ticketLevel;
    }

    public float price() {
        // TODO
        switch (this.ticketLevel) {
            case FullTour -> price = 50f;
            case BasicTour -> price = 20f;
        }
        return price;
    }
}


public class Visitor {

    private int age;
    List<Ticket> tickets; // can be more than one;

}

