package Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD;

import javax.swing.JOptionPane;
import Exercici_9.Menu;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Modules.Users.Model.DAO.Functions_Users;


public class functions_update {

	public static void update_admin (Admin a1) {
		int location1 = -1;
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			//a1 = (Admin)Functions_Users.crear_users_dni(1);
			a1 = functions_find.IDadmin();
			location1 = functions_find.find_admin(a1);
			if (location1 != -1) {
				a1 = Singleton.useradmin.get(location1);
				Functions_Users.update_users_generic(a1);
				Singleton.useradmin.set(location1, a1);
			}else {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void update_usernormal (User a1) {
		int location1 = -1;
		
		if(Singleton.userregister.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			a1 = functions_find.IDuser();
			location1 = functions_find.find_user(a1);
			if (location1 != -1) {
				a1 = Singleton.userregister.get(location1);
				Functions_Users.update_users_generic(a1);
				Singleton.userregister.set(location1, a1);
			}else {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void update_client (Client a1) {
		int location1 = -1;
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			a1 = functions_find.IDclient();
			location1 = functions_find.find_client(a1);
			if (location1 != -1) {
				a1 = Singleton.userclient.get(location1);
				Functions_Users.update_users_generic(a1);
				Singleton.userclient.set(location1, a1);
			}else {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
