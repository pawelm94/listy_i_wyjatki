public class Wyjatki extends Exception
{
	public static final int BLAD_NIEZNANY = 0;
	public static final int LICZBA_UJEMNA = 1;
	public static final int PUSTE_DANE = 2;
	
	private int kod;
	
	public Wyjatki(int _kod)
	{
		super();
		
		if(_kod < BLAD_NIEZNANY) kod = BLAD_NIEZNANY;
		else kod = _kod;
	}
	
	public String toString()
	{
		switch(kod)
		{
			case BLAD_NIEZNANY:
				return "Błąd nieznany";
			
			case LICZBA_UJEMNA:
				return "Podana liczba jest ujemna!";
			
			case PUSTE_DANE:
				return "Nic nie wpisano!";
				
			default:
				return "Dane są poprawne";
		}
	}
}