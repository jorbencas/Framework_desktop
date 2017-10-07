package Exercici_9.Utils;

import javax.swing.JOptionPane;

import Exercici_9.Menu;
import Exercici_9.Classes.Lenguage.languages;

public class menus {
	
	// -------------------------------------MENUS-------------------------------------
		//Menu using combobox-------------------------------------
			public static String menucombo(String[] options, String message, String title){
				Object option=null;
				do{
					option=JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
					if (option == null){
						JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errorchar"),  languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
					}
					}while( option == null);
					return option.toString();
			}
		// Menu buttons<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
		
		public static int menu(String[] tipo, String message, String title) {
			int operation = JOptionPane.showOptionDialog(null, message, title, 0, JOptionPane.QUESTION_MESSAGE, null, tipo,
					tipo[0]);
			return operation;
		}
		
		//Menu de confirmacció>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//
		public static boolean confirm() {
			int continuar = 0;
			String [] selection = {languages.getInstance().getProperty("Y"), languages.getInstance().getProperty("N")};
			continuar = menu(selection, languages.getInstance().getProperty("chooseing"), languages.getInstance().getProperty("Conf"));
			boolean confirm = false;
			
			switch(continuar){
			case 0:
				confirm = false;
				break;
			case 1:
				confirm = true;
				break;
			}
				return confirm;
		}
		
		public static void yes_no_opttion() {
			int confirmado = JOptionPane.showConfirmDialog( null, "¿Lo confirmas?");

					if (JOptionPane.OK_OPTION == confirmado)
						JOptionPane.showMessageDialog(null,"Confirmado","Confirmado ...",JOptionPane.INFORMATION_MESSAGE);
					else if (JOptionPane.CANCEL_OPTION == confirmado)
						JOptionPane.showMessageDialog(null,"Cancelado","Cancelado ...",JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,"Saliendo","Saliendo ...",JOptionPane.INFORMATION_MESSAGE);
		}
}
