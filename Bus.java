package Hometask.lesson1;

public class Bus {
int number;
String station;

	public void drive(String station) {
		System.out.println("Автобус с номером "+number+ " отъехал от остановки "+ station);		
		//System.out.println("Автобус с номером "+number+ " отъехал от остановки "+ station);	
	}
	public void stop(String station) {
		System.out.println("Автобус с номером "+number+ " остановился на остановке "+station);
	}

}
