package Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD;

import java.util.Collections;
import javax.swing.JOptionPane;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_addres;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_age;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_date;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_date_of_registration;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_name;
import Exercici_9.Modules.Users.Model.Classes.order.order_by_number_of_comments;
import Exercici_9.Utils.menus;

public class functions_order {

	public static void change_orderadmin () {
		String [] options = { languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("age2"), languages.getInstance().getProperty("adress2")}; 
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			String menu = menus.menucombo(options, "Order", "Order" );
			switch (menu) {
				case "DNI":
					Collections.sort(Singleton.useradmin);
					break;
				case "Nombre":
				case "Name":
				case "Nom":
					Collections.sort(Singleton.useradmin, new order_by_name());
					break;
				case "Fecha de nacimiento":
				case "Date birthday":
				case "Data de naixement":
					Collections.sort(Singleton.useradmin, new order_by_date());
					break;
				case "Age":
				case "Edad":
					Collections.sort(Singleton.useradmin, new order_by_age());
					break;
				case "Dirección":
				case "Adress":
				case "Direcció":
					Collections.sort(Singleton.useradmin, new order_by_addres());
					break;
			}
		}
	}
	
	public static void change_orderclient (){
String [] options = { languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("age2"), languages.getInstance().getProperty("adress2"), languages.getInstance().getProperty("date_regist1")}; 
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			String menu = menus.menucombo(options, "Order", "Order" );
			switch (menu) {
				case "DNI":
					Collections.sort(Singleton.userclient);
					System.out.println("pepe");
					break;
				case "Nombre":
				case "Name":
				case "Nom":
					Collections.sort(Singleton.userclient, new order_by_name());
					break;
				case "Fecha de nacimiento":
				case "Date birthday":
				case "Data de naixement":
					Collections.sort(Singleton.userclient, new order_by_date());
					break;
				case "Age":
				case "Edad":
					Collections.sort(Singleton.userclient, new order_by_age());
					break;
				case "Dirección":
				case "Adress":
				case "Direcció":
					Collections.sort(Singleton.userclient, new order_by_addres());
					break;
				case "Date of registration":
				case "Fecha de alta":
				case "Data de alta":
					Collections.sort(Singleton.userclient, new order_by_date_of_registration());
					break;
			}
		}
	}
	
	public static void change_orderuser (){
String [] options = { languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("age2"), languages.getInstance().getProperty("adress2"), languages.getInstance().getProperty("numcoments2")}; 
		
		if(Singleton.userregister.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			String menu = menus.menucombo(options, "Order", "Order" );
			switch (menu) {
				case "DNI":
					Collections.sort(Singleton.userregister);
					break;
				case "Nombre":
				case "Name":
				case "Nom":
					Collections.sort(Singleton.userregister, new order_by_name());
					break;
				case "Fecha de nacimiento":
				case "Date birthday":
				case "Data de naixement":
					Collections.sort(Singleton.userregister, new order_by_date());
					break;
				case "Age":
				case "Edad":
					Collections.sort(Singleton.userregister, new order_by_age());
					break;
				case "Dirección":
				case "Adress":
				case "Direcció":
					Collections.sort(Singleton.userregister, new order_by_addres());
					break;
				case "Number of coments":
				case "Numero de comentarios":
				case "Numero de Comentaris":
					Collections.sort(Singleton.userregister, new order_by_number_of_comments());
					break;
				}
			}
		}

	
}
