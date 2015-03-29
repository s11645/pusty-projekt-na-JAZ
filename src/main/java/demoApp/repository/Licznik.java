package demoApp.repository;

public class Licznik 
{
	private static int licznik;
	
	public static synchronized int getLicznik(){
		return licznik;
	}
	
	public static synchronized void zmniejszLicznik(){
		licznik--;
	}
	
	public static synchronized void setLicznik(int wartosc){
		licznik = wartosc;
	}
}
