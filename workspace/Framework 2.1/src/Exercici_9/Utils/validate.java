package Exercici_9.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Exercici_9.Menu;
import Exercici_9.Classes.Setting;

public class validate {
	private static final String Expresion_nombre="^[a-zA-Z\\s]*$";
	private static final String Expresion_direccion="^[a-zA-Z]+_[a-zA-Z]+_[n]+[0-9]*$";
	private static final String Expresion_codigo_postal="^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String Expresion_telefono="^[+34]{3}+[0-9]{9}$";
	private static final String Expresion_dni="^[0-9]{8}+[A-Z]$";
	private static final String Expresion_email="^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,3})$";
	private static final String pattern_date1 = "^[0-9]{2}[/][0-9]{2}[/][0-9]{4}$";
	private static final String pattern_date2 = "^[0-9]{2}[-][0-9]{2}[-][0-9]{4}$";
	private static final String pattern_date3 = "^(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$";
	private static final String pattern_date4 = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	private static final String Expresion_puntos="^[0-9]{1,3}$";
	private static final String Expresion_password="^(?=.{8,})(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";

	//validar nombre
			public static boolean v_nombre(String nombre){
		        Pattern pattern=Pattern.compile(Expresion_nombre);
		        Matcher matcher = pattern.matcher(nombre);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
	
	//validar direccion
			public static boolean v_direccion(String direccion){
		        Pattern pattern=Pattern.compile(Expresion_direccion);
		        Matcher matcher = pattern.matcher(direccion);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
	
	//validar telefono
			public static boolean v_telefono(String telefono){
		        Pattern pattern=Pattern.compile(Expresion_telefono);
		        Matcher matcher = pattern.matcher(telefono);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
			
	//Valida un DNI
			public static boolean v_dni(String dni){
		        Pattern pattern=Pattern.compile(Expresion_dni);
		        Matcher matcher = pattern.matcher(dni);
				if(matcher.matches()){
					boolean val = true;
					String dni2 = "", caracteres="TRWAGMYFPDXBNJZSQVHLCKET";
					int dni1 = 0, modulo = 0;
						for(int i=0; i<8; i++)
							dni2 += dni.charAt(i);			
						char letra = dni.charAt(8);			
							dni1 = Integer.parseInt(dni2);
						    	modulo= dni1 % 23;
						    		char let = caracteres.charAt(modulo);
								    	if(let == letra)
								    		val = true;
								    	else
								    		val = false;
					return val;
				  }//end if
			    return false;
			  }
			
	//validar email
			public static boolean v_email(String email){
		        Pattern pattern=Pattern.compile(Expresion_email);
		        Matcher matcher = pattern.matcher(email);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
	
	//validar edad
			public static boolean v_puntos(String puntos){
		        Pattern pattern=Pattern.compile(Expresion_puntos);
		        Matcher matcher = pattern.matcher(puntos);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
			
	//validar codigo_postal
			public static boolean v_c_p(String codigo_postal){
		        Pattern pattern=Pattern.compile(Expresion_codigo_postal);
		        Matcher matcher = pattern.matcher(codigo_postal);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }
	
	
	//validar fecha
			public static boolean date (String fecha) {
				String s="";
				switch (Setting.getInstance().getDate_config()) {
					case "DD/MM/YYYY":
						s = pattern_date1;
						break;
					case "DD-MM-YYYY":
						s = pattern_date2;
						break;
					case "YYYY/MM/DD":
						s = pattern_date3;
						break;
					case "YYYY-MM-DD":
						s = pattern_date4;
						break;
				}	
				return fecha.matches(s);
			}
	
	//valida password
			public static boolean v_password(String password){
		        Pattern pattern=Pattern.compile(Expresion_password);
		        Matcher matcher = pattern.matcher(password);
				if(matcher.matches()){
				return true;
				  } 
			    return false; 
			  }

}
