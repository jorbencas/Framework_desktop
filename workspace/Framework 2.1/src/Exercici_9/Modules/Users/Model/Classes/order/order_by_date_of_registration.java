package Exercici_9.Modules.Users.Model.Classes.order;

import java.util.Comparator;
import Exercici_9.Modules.Users.Model.Classes.Client;

public class order_by_date_of_registration implements Comparator <Client>{

	public int compare (Client c1, Client c2) {
		int d = 0;
		int var = c1.getFecha_de_alta().comparaFechas(c2.getFecha_de_alta());
		if(var == 2)
			d = 1;
		else if(var == 1)
			d = -1;
		else if(var == 3)
			d = 0;
		System.out.println("The value" + var + "\n"+"The result" +d);
		return d;
	}
}
