package Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD;

import javax.swing.JOptionPane;

import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Class_user;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Modules.Users.Model.Utils.Datos_user;
import Exercici_9.Utils.menus;
import Exercici_9.Modules.Users.Model.DAO.Functions_Users;

public class functions_find {

	public static int find_admin(Admin admin) { 
		for (int i = 0; i<=(Singleton.useradmin.size()-1); i++){
			if((Singleton.useradmin.get(i)).equals(admin) )
				return i;
		}
		return -1;
	}
	
	public static int find_client(Client client) { 
		for (int i = 0; i<=(Singleton.userclient.size()-1); i++){
			if((Singleton.userclient.get(i)).equals(client) )
				return i;
		}
		return -1;
	}
	
	public static int find_user(User user) { 
		for (int i = 0; i<=(Singleton.userregister.size()-1); i++){
			if((Singleton.userregister.get(i)).equals(user) )
				return i;
		}
		return -1;
	}
	
	public static String[] generate_vector_admin () {
		Admin a1 = null;
		String s = "";
		int arraylist =Singleton.useradmin.size();
		String [] user = new String[arraylist];
		for (int i = 0; i<arraylist; i++) {
			a1 = (Admin) Singleton.useradmin.get(i);
			s=a1.getDNI()+"-----"+a1.getnombre();
			user[i] = s;
		}
		
		return user;
	}
	
	public static String[] generate_vector_client () {
		Client c1 = null;
		String s = "";
		int arraylist =Singleton.userclient.size();
		String [] user = new String[arraylist];
		for (int i = 0; i<arraylist; i++) {
			c1 = (Client) Singleton.userclient.get(i);
			s=c1.getDNI()+"-----"+c1.getnombre();
			user[i] = s;
		}
		
		return user;
	}
	
	public static String[] generate_vector_userregister () {
		User u1 = null;
		String s = "";
		int arraylist =Singleton.userregister.size();
		String [] user = new String[arraylist];
		for (int i = 0; i<arraylist; i++) {
			u1 = (User) Singleton.userregister.get(i);
			s=u1.getDNI()+"-----"+u1.getnombre();
			user[i] = s;
		}
		
		return user;
	}
	
	public static Admin IDadmin () {
		Admin a1 = null;
		String ID = "";
		String [] admin = generate_vector_admin();
		String search = menus.menucombo(admin,languages.getInstance().getProperty("sum"), languages.getInstance().getProperty("sut"));
		if (search != ""){
			for (int i = 0; i<9; i++) {
				ID += search.charAt(i);
			}
			a1 = new Admin (ID);
		}
		return a1;		
	}
	
	public static Client IDclient () {
		Client c1 = null;
		String ID = "";
		String [] Client = generate_vector_client();
		String search = menus.menucombo(Client,languages.getInstance().getProperty("sum"), languages.getInstance().getProperty("sut"));
		if (search != ""){
			for (int i = 0; i<9; i++) {
				ID += search.charAt(i);
			}
			c1 = new Client (ID);
		}
		return c1;		
	}
	
	public static User IDuser () {
		User u1 = null;
		String ID = "";
		String [] User = generate_vector_userregister();
		String search = menus.menucombo(User,languages.getInstance().getProperty("sum"), languages.getInstance().getProperty("sut"));
		if (search != ""){
			for (int i = 0; i<9; i++) {
				ID += search.charAt(i);
			}
			u1 = new User (ID);
		}
		return u1;		
	}
	
	public static void set_adminDNI ( Class_user param){
		int location = -1;
		Admin a1 = null;
		a1 = (Admin) Functions_Users.crear_users_dni(1);
		location = functions_find.find_admin(a1);
		if (location != -1) {
			//JOptionPane.showMessageDialog(null, Language_user.getInstance().getProperty("errorDNI"), Language_user.getInstance().getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		}else {
			param.setDNI(Singleton.DNI);
		}
	}
	
	public static void set_clientDNI ( Class_user param){
		int location = -1;
		Client c1 = null;
		c1 = (Client) Functions_Users.crear_users_dni(3);
		location = functions_find.find_client(c1);
		if (location != -1) {
			//JOptionPane.showMessageDialog(null, Language_user.getInstance().getProperty("errorDNI"), Language_user.getInstance().getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		}else {
			param.setDNI(Singleton.DNI);
		}
	}
	
	public static void set_userregisterDNI (Class_user param){
		int location = -1;
		User u1 = null;
		u1 = (User) Functions_Users.crear_users_dni(0);
		location = functions_find.find_user(u1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "errorDNI","errortitle", JOptionPane.ERROR_MESSAGE);
		}else {
			param.setDNI(Singleton.DNI);
		}
	}
	
	
}
