package Exercici_9.Classes.Lenguage;

import java.io.IOException;
import java.util.Properties;

import Exercici_9.Classes.Setting;

	public class languages extends Properties{
		
		private static languages instance;
		public String getProperty;
		public languages (){
			//this.idioma = idioma;
		    switch(Setting.getInstance().getLanguage()){
		    case "Valencian":
		    	getProperties("valenciano.properties");
		    	break;
		    case "English":
		        getProperties("english.properties");
		        break;
		    case "Spanish":
		        getProperties("spanish.properties");
		        break;
		    default:
		        getProperties("english.properties");
		    }
		}
		
//		public String getIdioma() {
//			return idioma;
//		}
		
		public static languages getInstance () {
			if (instance==null){
				instance = new languages();
			}
			return instance;
		}

		public void setIdioma() {
			//this.idioma = idioma;
			switch(Setting.getInstance().getLanguage()){
			 case "Valencian":
			    getProperties("valenciano.properties");
			    break;
			case "English":
		        getProperties("english.properties");
		        break;
		    case "Spanish":
		        getProperties("spanish.properties");
		        break;
		    default:
		        getProperties("english.properties");
			}
		}

		public void getProperties(String idioma) {
	        try {
	            this.load( getClass().getResourceAsStream(idioma) );
	        } catch (IOException ex) {
	        }
	    }
		/*
		public static void main(String[] args){
			Language lang = new Language("English");
			System.out.print(lang.getProperty("goodbye"));
			lang.setIdioma("Spanish");
			System.out.print(lang.getProperty("goodbye"));
		}
		*/
	}
