public class LiczbyDodatnie
{
	protected double liczba;
	
	public LiczbyDodatnie(double _liczba) throws Wyjatki
	{
		if(_liczba < 0) throw new Wyjatki(Wyjatki.LICZBA_UJEMNA);
		else liczba = _liczba;	
	}
	
	public double PobierzLiczbe() { return liczba; }
	
	public String toString()
	{
		return "\nLiczba.............. " + liczba;
	}
}