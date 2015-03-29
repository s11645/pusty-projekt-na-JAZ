package demoApp.repository;

import java.util.ArrayList;
import java.util.List;

public class Rejestruj 
{
	private static List<String> lista = new ArrayList<String>();

	public static synchronized List<String> getLista() {
		return lista;
	}

	public static synchronized void dodajdoListy(String value){
		lista.add(value);
	}
}
