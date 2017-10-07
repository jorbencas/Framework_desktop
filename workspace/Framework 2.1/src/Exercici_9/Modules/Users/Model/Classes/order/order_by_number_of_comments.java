package Exercici_9.Modules.Users.Model.Classes.order;

import java.util.Comparator;
import Exercici_9.Modules.Users.Model.Classes.User;


public class order_by_number_of_comments implements Comparator <User>{

	public int compare (User u1, User u2) {
		if(u1.getnum_comentarios()>u2.getnum_comentarios())
			return 1;
		if(u1.getnum_comentarios()<u2.getnum_comentarios())
			return -1;
		return 0;
	}
}
