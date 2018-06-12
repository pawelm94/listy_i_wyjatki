public class Lista
{
	public ElementListy pierwszy, element, pomocniczy;
	
	public Lista()
	{
		pierwszy = element = null;
	}
	
	public Lista(LiczbyDodatnie _dodatnia)
	{
		pierwszy = element = new ElementListy(_dodatnia);
	}
	
	public void DopiszNaKoniec(LiczbyDodatnie _dodatnia)
	{
		if(pierwszy == null)
		{
			pierwszy = element = new ElementListy(_dodatnia);
			System.out.println("\nDodano nowy element do listy");
		}
		else if(element.nastepny == null)
		{
			ElementListy nowy = new ElementListy(_dodatnia);
			element.nastepny = nowy;
			element = nowy;
			System.out.println("\nDodano nowy element do listy");
		}
		else
		{
			element = element.nastepny;
			DopiszNaKoniec(_dodatnia);
		}
	}
	
	public void Wypisz()
	{
		if(pierwszy != null)
		{
			pomocniczy = pierwszy;
		
			while(pomocniczy != null)
			{
				System.out.println(pomocniczy.dodatnia);
				pomocniczy = pomocniczy.nastepny;
			}
		}
		else
			System.out.println("\nLista jest pusta!");
	}
	
	public void Wyszukaj(double _liczba)
	{
		pomocniczy = pierwszy;
		int licznik = 0;

		while(pomocniczy != null)
		{
			if(pomocniczy.dodatnia.PobierzLiczbe() == _liczba)
			{
				licznik++;
				System.out.println(pomocniczy.dodatnia);
			}
			
			pomocniczy = pomocniczy.nastepny;
		}
		
		if(licznik == 0) System.out.println("\nNie znaleziono liczby na liście");
	}
	
	public void Usun()
	{		
		while(pierwszy != null)
		{
			element = pierwszy;
			pierwszy = element.nastepny;
			element = null;
		}
		
		pomocniczy = null;
		
		System.out.println("\nLista została usunięta z pamięci");
	}
}

class ElementListy
{
	public LiczbyDodatnie dodatnia;
	public ElementListy nastepny;
	
	public ElementListy(LiczbyDodatnie _dodatnia)
	{
		dodatnia = _dodatnia;
		nastepny = null;
	}
}