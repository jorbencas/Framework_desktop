package Exercici_9.Modules.Users.Model.BLL.BLL_dummies.CRUD_dummies;

import javax.swing.JOptionPane;
import Exercici_9.Menu;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_find;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;

import Exercici_9.Utils.menus;

public class functions_delete_dummies {

	public static void delete_admin_dummies (Admin a1) {
		int menu, location = -1;
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			
			String [] tipo = {languages.getInstance().getProperty("deletea"), languages.getInstance().getProperty("delete1")};
			menu = menus.menu(tipo, languages.getInstance().getProperty("delete-m"), languages.getInstance().getProperty("delete-t"));
			switch (menu){
				case 0:
						 Singleton.useradmin.clear();
					break;
				case 1:
					location = -1;
					a1 = functions_find.IDadmin();
					location = functions_find.find_admin(a1);
					if (location != -1) {
						Singleton.useradmin.remove(location);
						JOptionPane.showMessageDialog(null, "Error de delete","delete", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "errortitle", JOptionPane.ERROR_MESSAGE);
					}
				break;
				
			}
		}
	}
	
	public static void delete_usernormal_dummies (User a1) {
		int menu, location = -1;
		
		if(Singleton.userregister.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			String [] tipo = {languages.getInstance().getProperty("deletea"), languages.getInstance().getProperty("delete1")};
			menu = menus.menu(tipo, languages.getInstance().getProperty("delete-m"), languages.getInstance().getProperty("delete-t"));
			switch (menu){
				case 0:
						 Singleton.userregister.clear();
					break;
				case 1:
					location = -1;
					a1 = functions_find.IDuser();
					location = functions_find.find_user(a1);
					if (location != -1) {
						Singleton.userregister.remove(location);
						JOptionPane.showMessageDialog(null, "Error de delete","delete", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "errortitle", JOptionPane.ERROR_MESSAGE);
					}
				break;
				
			}
			
		}
	}
	
	public static void delete_client_dummies (Client a1) {
		int menu, location = -1;
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("error1"), "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			String [] tipo = {languages.getInstance().getProperty("deletea"), languages.getInstance().getProperty("delete1")};
			menu = menus.menu(tipo, languages.getInstance().getProperty("delete-m"), languages.getInstance().getProperty("delete-t"));
			switch (menu){
				case 0:
					Singleton.userregister.clear();
				break;
				case 1:
					location = -1;
					a1 = functions_find.IDclient();
					location = functions_find.find_client(a1);
					if (location != -1) {
						Singleton.userclient.remove(location);
						JOptionPane.showMessageDialog(null, "Error de delete","delete", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("erroruser"), "errortitle", JOptionPane.ERROR_MESSAGE);
					}
				break;
			}
		}
	}
}
