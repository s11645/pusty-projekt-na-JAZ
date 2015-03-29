package demoApp.repository;

import java.util.*;

import demoApp.repository.Licznik;
import demoApp.mod.Osoba;

public class Lista 
{
	private ArrayList<Osoba> lista = new ArrayList<Osoba>();

	public void add(Osoba Osoba)
	{
		Osoba newOsoba = new Osoba(Osoba.getImie(), Osoba.getNaz(), Osoba.getEmail(), Osoba.getPracodawca(), Osoba.getPraca(), Osoba.getInfo());
		lista.add(newOsoba);
		Licznik.zmniejszLicznik();
	}
	
	public List<Osoba> getAll()
	{
		return lista;
	}
}
