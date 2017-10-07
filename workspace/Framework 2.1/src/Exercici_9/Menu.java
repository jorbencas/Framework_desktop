package Exercici_9;

import javax.swing.JOptionPane;
import Exercici_9.Menu;
import Exercici_9.Utils.functions_conf;
import Exercici_9.Utils.menus;
import Exercici_9.Classes.Setting;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.BLL.BLL_dummies.Make_dummies;
import Exercici_9.Modules.Users.Model.BLL.BLL_dummies.CRUD_dummies.functions_delete_dummies;
import Exercici_9.Modules.Users.Model.BLL.BLL_dummies.CRUD_dummies.functions_read_dummies;
import Exercici_9.Modules.Users.Model.BLL.BLL_dummies.CRUD_dummies.functions_update_dummies;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_create;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_delete;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_order;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_read;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.CRUD.functions_update;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.generic.files_generic;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.User;

//Aquest es el menu i submenus principals  del nostre framework.
public class Menu {

	public static void main(String[] args) {
		int option = 0, option1 = 0, option2 = 0, option3 = 0, option4 = 0, option5 = 0;
		User u1 = null;
		Admin u2 = null;
		Client u3 = null;
		Setting.getInstance();

		// Start the application.
		do {
			String[] tipo = { languages.getInstance().getProperty("registered_user"),languages.getInstance().getProperty("admin"), languages.getInstance().getProperty("client"),languages.getInstance().getProperty("config")};
			String[] tipo1 = { languages.getInstance().getProperty("c"), languages.getInstance().getProperty("r"),languages.getInstance().getProperty("u"), languages.getInstance().getProperty("d"), "Open", "Save", languages.getInstance().getProperty("order"),languages.getInstance().getProperty("exit") };
			option = menus.menu(tipo, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
			if (option == -1) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("exit1"),languages.getInstance().getProperty("exit2"), JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("goodbye"),languages.getInstance().getProperty("goodbye2"), JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				switch (option) {
// Usuari normal
				case 0:
					do {
						option1 = menus.menu(tipo1, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
						if (option1 == -1) {
							JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("exit1"),languages.getInstance().getProperty("exit2"), JOptionPane.INFORMATION_MESSAGE);
						} else {
							switch (option1) {
							case 0:// creacio del usuari
								if (Setting.getInstance().getdummies() == true) {
									Make_dummies.makedummies_userregister();								
								} else if (Setting.getInstance().getdummies() == false) {
									functions_create.create_user_normal(u1);
								} // end else if
								break;
							case 1:// imprimeix per pantalla les dades del usuari
								if (Setting.getInstance().getdummies() == true) {
									functions_read_dummies.read_usernormal_dummies(u1);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_read.read_usernormal(u1);
								} // end else if
								break;
							case 2:// Actualitza les dades del usuari
								if (Setting.getInstance().getdummies() == true) {
									functions_update_dummies.update_usernormal_dummies(u1);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_update.update_usernormal(u1);
								} // end else if
								break;
							case 3:// Elimina el usuari
								boolean continuar = menus.confirm();
								if (continuar == true) {
									break;
								} else {
									if (Setting.getInstance().getdummies() == true) {
										functions_delete_dummies.delete_usernormal_dummies(u1);
									} else if (Setting.getInstance().getdummies() == false) {
										functions_delete.delete_usernormal(u1);
									} // end else if
								} // end else
								break;
							case 4:// obrir dades per defecte
								files_generic.files_open_on_demant(0);
								break;
							case 5:// Guardar dades per defecte
								files_generic.files_save_on_demant(0);
								break;
							case 6://order
								functions_order.change_orderuser();
								break;
							}// switch (option)
						} // end else
					} while (option1 != 7);
					break;
// usuari administrador
				case 1:
					do {
						option2 = menus.menu(tipo1, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
						if (option2 == -1) {
							JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("exit1"),languages.getInstance().getProperty("exit2"), JOptionPane.INFORMATION_MESSAGE);
						} else {
							switch (option2) {
							case 0:// creacio del usuari.
								if (Setting.getInstance().getdummies() == true) {
									Make_dummies.makedummies_admin();
								} else if (Setting.getInstance().getdummies() == false) {
									functions_create.create_user_admin(u2);
								} // end else if
								break;
							case 1:// imprimeix per pantalla les dades del usuari
								if (Setting.getInstance().getdummies() == true) {
									functions_read_dummies.read_admin_dummies(u2);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_read.read_admin(u2);
								} // end else if
								break;
							case 2:// Actualitza les dades del usuari.
								if (Setting.getInstance().getdummies() == true) {
									functions_update_dummies.update_admin_dummies(u2);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_update.update_admin(u2);
								} // end else if
								break;
							case 3:// Elimina el usuari.
								boolean continuar = menus.confirm();
								if (continuar == true) {
									break;
								} else {
									if (Setting.getInstance().getdummies() == true) {
										functions_delete_dummies.delete_admin_dummies(u2);
									} else if (Setting.getInstance().getdummies() == false) {
										functions_delete.delete_admin(u2);
									} // end else if
								} // end else
								break;
							case 4:// obrir dades per defecte
								files_generic.files_open_on_demant(1);
								break;
							case 5:// Guardar dades per defecte
								files_generic.files_save_on_demant(1);
								break;
							case 6://order
								functions_order.change_orderadmin();
								break;
							}// switch (option)
						} // end else
					} while (option2 != 7);
					break;
// Usuari client
				case 2:
					do {
						option3 = menus.menu(tipo1, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
						if (option3 == -1) {
							JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("exit1"),languages.getInstance().getProperty("exit2"), JOptionPane.INFORMATION_MESSAGE);
						} else {
							switch (option3) {
							case 0:// creacio del usuari.
								if (Setting.getInstance().getdummies() == true) {
									Make_dummies.makedummies_client();
								} else if (Setting.getInstance().getdummies() == false) {
									functions_create.create_user_client(u3);
								} // end else if
								break;
							case 1:// imprimeix per pantalla les dades del usuari
								if (Setting.getInstance().getdummies() == true) {
									functions_read_dummies.read_client_dummies(u3);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_read.read_client(u3);
								} // end else if
								break;
							case 2:// Actualitza les dades del usuari.
								if (Setting.getInstance().getdummies() == true) {
									functions_update_dummies.update_client_dummies(u3);
								} else if (Setting.getInstance().getdummies() == false) {
									functions_update.update_client(u3);
								} // end else if
								break;
							case 3:// Elimina el usuari.
								boolean continuar = menus.confirm();
								if (continuar == true) {
									break;
								} else {
									if (Setting.getInstance().getdummies() == true) {
										functions_delete_dummies.delete_client_dummies(u3);
									} else if (Setting.getInstance().getdummies() == false) {
										functions_delete.delete_client(u3);
									} // end else if
								} // end else
								break;
							case 4:// obrir dades per defecte
								files_generic.files_open_on_demant(2);
								break;
							case 5:// Guardar dades per defecte
								files_generic.files_save_on_demant(2);
								break;
							case 6://order
								functions_order.change_orderclient();
								break;
							}// switch (option)
						} // end else
					} while (option3 != 7);
					break;
// Settings menu
				case 3:
					do {
						String[] tipo2 = { languages.getInstance().getProperty("lang"),languages.getInstance().getProperty("date"),languages.getInstance().getProperty("currency"),languages.getInstance().getProperty("decimals"),languages.getInstance().getProperty("moresettings"), languages.getInstance().getProperty("exit")};
						option4 = menus.menu(tipo2, languages.getInstance().getProperty("config2"),languages.getInstance().getProperty("exercisemenu"));
						if (option == -1) {
							JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("exit1"),languages.getInstance().getProperty("exit2"), JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("goodbye"),languages.getInstance().getProperty("goodbye2"), JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						} else {
							switch (option4) {
							case 0:
								// menu lenguajes
								functions_conf.language();
								break;
							case 1:
								// menu_format_date
								functions_conf.date();
								break;
							case 2:
								// menu_currency
								functions_conf.currency();
								break;
							
							case 3:
								// menu_decimal
								functions_conf.decimal();
								break;
							case 4:
								do{
									String[] tipo3 = {languages.getInstance().getProperty("Themetittle"),"Dummies",languages.getInstance().getProperty("files"), languages.getInstance().getProperty("default"),languages.getInstance().getProperty("exit")};
									option5 = menus.menu(tipo3, languages.getInstance().getProperty("config2"),languages.getInstance().getProperty("exercisemenu"));
									switch (option5) {
									case 0:
										// menu theme
										functions_conf.theme();
										break;
									case 1:
										// menu dummies
										functions_conf.dummies();
										break;
									case 2:
										// menu files
										functions_conf.file();
										break;
									case 3:
										// menu default settings
										functions_conf.defautlSettings();
										break;
									}
								}while(option5 != 4);
								break;
							}// end switch case
						} // end else
					} while (option4 != 5);
					break;
				}// end main switch (option)
			} // end main else
			files_generic.files_save_auto();
		} while (option != 5);
	}
}