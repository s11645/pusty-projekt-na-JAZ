package demoApp.mod;

import demoApp.mod.Unit;

public class Osoba extends Unit
{
	public Osoba()
	{
		super();
	}
	
	public Osoba(String Imie, String Naz, String email, String Pracodawca, String Praca, String info)
	{
		super();
		this.setImie(Imie);
		this.setNaz(Naz);
		this.setEmail(email);
		this.setPracodawca(Pracodawca);
		this.setPraca(Praca);
		this.setInfo(info);
	}
	
	private String Imie = "";
	private String Naz = "";
	private String email = "";
	private String Pracodawca = "";
	private String Praca = "";
	private String info = "";
	
	public String getImie() 
	{
		return Imie;
	}
	
	public void setImie(String Imie) 
	{
		this.Imie = Imie;
	}
	
	public String getNaz() 
	{
		return Naz;
	}
	
	public void setNaz(String Naz) 
	{
		this.Naz = Naz;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPracodawca() 
	{
		return Pracodawca;
	}
	
	public void setPracodawca(String Pracodawca) 
	{
		this.Pracodawca = Pracodawca;
	}
	
	public String getPraca() 
	{
		return Praca;
	}
	
	public void setPraca(String Praca) 
	{
		this.Praca = Praca;
	}
	
	public String getInfo() 
	{
		return info;
	}
	
	public void setInfo(String info) 
	{
		this.info += info + "<br>";
	}
	
	public void clearInfo()
	{
		this.info = "";
	}
}