package Exercici_9.Modules.Users.Model.Classes.order;

import java.util.Comparator;

import Exercici_9.Modules.Users.Model.Classes.Class_user;


public class order_by_addres implements Comparator <Class_user> {

	public int compare (Class_user u1, Class_user u2) {
		if(u1.getdireccion().compareTo(u2.getdireccion())>0)
			return 1;
		if(u1.getdireccion().compareTo(u2.getdireccion())<0)
			return -1;
		return 0;
	}
}
