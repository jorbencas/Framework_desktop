package Exercici_9.Utils;

import javax.swing.JOptionPane;

import Exercici_9.Menu;
import Exercici_9.Classes.Lenguage.languages;

public class functions {
	// -------------------------------------INT-------------------------------------
	// Function that ask for a number to the user and return an integer
	// -------------------------------------
	public static int v_int(String message, String title) {
		int num = 0;
		String s;
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errorint"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
					correcto = false;
				} else {
					num = Integer.parseInt(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty(""), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		System.out.println("You have put the number" + num);

		return num;
	}

	// -------------------------------------FLOAT-------------------------------------
	// Function that ask for a number to the user and return a float

	public static float v_float(String message, String title) {
		String s = "";
		float num = 0.0f;
		boolean correct = false;

		do {
			try {
				s = JOptionPane.showInputDialog(null, "Can you put the first number ?", "First Number",JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errorfloat"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
					correct = false;
				} else {
					num = Float.parseFloat(s);
					correct = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errorfloat"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);
		System.out.println("You have put the  number" + num);

		return num;
	}

	// -------------------------------------CHAR---------------------------------------------
	/// Function that ask for a char to the user and return
	// -------------------------------------
	public static char v_char(String message, String title) {
		char c = 0;
		String s;
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errochar"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
					correcto = false;
				} else {
					c = s.charAt(0);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errochar"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		System.out.println("You have put a char " + c);

		return c;
	}

	// -------------------------------------STRING-------------------------------------
	/// Function that ask for a string and return it
	// -------------------------------------

	public static String v_String(String message, String title) {
		String s = "";
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				correcto = true;
				if (s == null) {
					JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errostring"), languages.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
					correcto = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, languages.getInstance().getProperty("errostring"), languages.getInstance().getProperty("error"),JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		System.out.println("You have put a string " + s);

		return s;

	}
	
}
