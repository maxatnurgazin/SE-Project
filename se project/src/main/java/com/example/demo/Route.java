package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "route")
public class Route {

    private int IdRoutes;

    private String origin;
    private String destination;
    private String departure;
    private String departure_time;
    private String arrival;
    private String arrival_time;
    private int seats = 20;
    private int price;

    public Route(int id, String origin, String destination, String departure, String arrival, int price){
        this.IdRoutes = id;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }
    public Route(){
        this.IdRoutes = 0;
        this.origin = null;
        this.destination = null;
        this.departure = null;
        this.arrival = null;
        this.price = 0;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public int getIdRoutes(){
        return IdRoutes;
    }
    public void setIdRoutes(int origin) {
        this.IdRoutes = origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Column(name = "available_seats")
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Column(name="ticket_price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }
}
