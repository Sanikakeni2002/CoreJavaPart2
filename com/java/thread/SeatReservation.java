package com.java.thread;

public class SeatReservation {

	public static void main(String[] args) {
		Reservation reserve=new Reservation();
		Person thread1=new Person(reserve,5);
		thread1.start();
		Person thread2=new Person(reserve, 4);
		thread2.start();
		Person thread3=new Person(reserve, 2);
		thread3.start();
	}

}
class Reservation{
	static int availableSeats=10;
	synchronized void reserveSeat(int requestedSeats){
		System.out.println("Availableseats: "+availableSeats+"RequestedSeats : "+requestedSeats);
		if(availableSeats>requestedSeats){
			System.out.println("Seats available. Reserced now");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e){
				System.out.println("Thread Interrupted");
			}
			System.out.println(requestedSeats+ "Seats Reserved");
			availableSeats = availableSeats-requestedSeats;
		}
		else
		{
			System.out.println("Requested Seats not available");
		}
		System.out.println(Thread.currentThread().getName()+"Leaving...");
		System.out.println("-------------------------------------------------------------");
	}
}
class Person extends Thread{
	Reservation reserve;
	int requestedSeats;
	public Person(Reservation reserve, int requestedSeats){
		this.reserve=reserve;
		this.requestedSeats=requestedSeats;
	}
	public void run(){
		reserve.reserveSeat(requestedSeats);
	}
	
}