package Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD;

import javax.swing.JOptionPane;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Modules.Users.Model.DAO.Functions_Users;


public class functions_create {

	public static void create_user_admin (Admin a1){
		int location = -1;
		
			a1 = (Admin)Functions_Users.crear_users_dni(1);
			location = functions_find.find_admin(a1);
			System.out.println(location);
			
			if (location != -1) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error",JOptionPane.ERROR_MESSAGE);
			} else {
				a1 = (Admin) Functions_Users.crear_users_generic(1);
				Singleton.useradmin.add(a1);
			}
		}
	public static void create_user_normal (User a1){
		int location = -1;
		
			a1 = (User)Functions_Users.crear_users_dni(0);
			location = functions_find.find_user(a1);
			System.out.println(location);
			
			if (location != -1) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error",JOptionPane.ERROR_MESSAGE);
			} else {
				a1 = (User) Functions_Users.crear_users_generic(0);
				Singleton.userregister.add(a1);
			}
		}
	public static void create_user_client (Client a1){
		int location = -1;
		
			a1 = (Client)Functions_Users.crear_users_dni(2);
			location = functions_find.find_client(a1);
			System.out.println(location);
			if (location != -1) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error",JOptionPane.ERROR_MESSAGE);
			} else {
				a1 = (Client) Functions_Users.crear_users_generic(2);
				Singleton.userclient.add(a1);
			}
		}
}
