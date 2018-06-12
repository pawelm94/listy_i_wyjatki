import java.util.*;

public class Zadanie
{
	private static String PobierzDane(String tekst) throws Wyjatki
    {        
		System.out.print(tekst);
        
		String wynik = System.console().readLine().trim();
		if(wynik == "") throw new Wyjatki(Wyjatki.PUSTE_DANE);
		return wynik;
    }
	
	public static void main(String[] args)
	{
		Lista lista = new Lista();
		
		int opcja = 0;
		
		while(opcja != 5)
		{
			System.out.println("\nWybierz opcję:");
			System.out.println("1 - Dopisz liczbę do listy");
			System.out.println("2 - Pokaż całą listę");
			System.out.println("3 - Wyszukaj liczbę");
			System.out.println("4 - Usuń listę z pamięci RAM");
			System.out.println("5 - Zakończ działanie programu");
			
			try
			{
				opcja = Integer.parseInt(PobierzDane("\nCo chcesz zrobić? "));
			}
			catch(NumberFormatException e1)
			{
				System.out.println("\nWystąpił błąd: Należy podać liczbę");
			}
			catch(Exception e2)
			{
				System.out.println("\nWystąpił błąd: " + e2);
			}
			
			if(opcja == 1) 
			{
				try
				{
					lista.DopiszNaKoniec(new LiczbyDodatnie(Double.valueOf(PobierzDane("\nWpisz liczbę dodatnią: "))));
				}
				catch(NumberFormatException e1)
				{
					System.out.println("\nWystąpił błąd: Należy podać liczbę");
				}
				catch(Exception e2)
				{
					System.out.println("\nWystąpił błąd: " + e2);
				}
			}
			else if(opcja == 2)
			{
				lista.Wypisz();
			}
			else if(opcja == 3)
			{
				try
				{
					lista.Wyszukaj(Double.valueOf(PobierzDane("\nWpisz liczbę dodatnią: ")));
				}
				catch(NumberFormatException e1)
				{
					System.out.println("\nWystąpił błąd: Należy podać liczbę");
				}
				catch(Exception e2)
				{
					System.out.println("\nWystąpił błąd: " + e2);
				}
			}
			else if(opcja == 4)
			{
				lista.Usun();
			}
		}
		
		lista.Usun();
	}
}