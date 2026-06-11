package com.company.java.Multithreading;
class BookTheaterseat{
    int total_seats=10;
    synchronized void bookseat(int seats){
        if(total_seats>=seats){
            System.out.println(seats + " seat booked successfully");
            total_seats=total_seats-seats;
            System.out.println("seats left:" + total_seats);
        }
        else{
            System.out.println(seats + " Seats cannot booked");
            System.out.println("seats left :" +total_seats);

        }
    }
}
public class MovieBookApp extends Thread {
    static BookTheaterseat b;
    int seats;
    public void run(){
        b.bookseat(seats);
    }
    public static void main(String args[]){
        b=new BookTheaterseat();
        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();
        deepak.start();

        MovieBookApp amith=new MovieBookApp();
        amith.seats=6;
        amith.start();
    }

}
