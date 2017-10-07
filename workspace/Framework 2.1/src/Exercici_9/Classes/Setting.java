package Exercici_9.Classes;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.generic.files_generic;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Utils.functions_conf;
import Exercici_9.Utils.functions_theme;


@XStreamAlias("Setting")
public class Setting {
	@XStreamAlias("language")
	private String language;
	@XStreamAlias("currency_config")
		private char currency_config;
	@XStreamAlias("date_config")
		private String date_config;
	@XStreamAlias("decimals_config")
		private int decimals_config;
	@XStreamAlias("dummies")
		private boolean dummies;
	@XStreamAlias("files")
		private String files;
	@XStreamAlias("theme")
		private String theme;
	@XStreamAlias("instance")
		private static Setting instance;
		
		public Setting(String language, String date_config, String language_config, char currency_config, int decimals_config, boolean dummies, String files) {
			super();
			this.language = language;
			this.date_config = date_config;// dd/mm/yyyy dd-mm-yyyy
			this.currency_config = currency_config;
			this.decimals_config = decimals_config;
			this.dummies = dummies;
			this.files = files;
		}
		
		public Setting() {
			super();
			this.language = "English";
			this.date_config ="DD/MM/YYYY";
			this.currency_config = '€';
			this.decimals_config = 2;
			this.dummies = false;
			this.files = "json";
			this.theme = "GTK";
		}
		
		public static Setting getInstance () {
			if (instance == null){
				instance = new Setting();

				functions_theme.theme();
				languages.getInstance();
				
				Singleton.useradmin = new ArrayList <Admin> ();
				Singleton.userclient = new ArrayList <Client> ();
				Singleton.userregister = new ArrayList <User> ();
				
				files_generic.files_open_auto();
				functions_conf.dummies();
			}
			return instance;
		}
		
		public String getTheme() {
			return theme;
		}

		public void setTheme(String theme) {
			this.theme = theme;
			functions_theme.theme();
			System.out.println(theme);
		}

		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
			languages.getInstance().setIdioma();
		}
		
		public String getFile() {
			return files;
		}
		
		public void setFile(String files) {
			this.files = files;
		}
		
		public String getDate_config() {
			return date_config;
		}
		
		public void setDate_config(String date_config) {
			this.date_config = date_config;
		}
		
		public char getCurrency_config() {
			return currency_config;
		}
		
		public void setCurrency_config(char currency_config) {
			this.currency_config = currency_config;
		}
		
		public int getDecimals_config() {
			return decimals_config;
		}
		
		public void setDecimals_config(int decimals_config) {
			this.decimals_config = decimals_config;
		}
		
		public boolean getdummies(){
			return dummies;
		}
		
		public  void setdummies(boolean dummies){
			 this.dummies = dummies;
		}

		@Override
		public String toString() {
			return "Setting [language=" + language + ", currency_config=" + currency_config + ", date_config="
					+ date_config + ", decimals_config=" + decimals_config + ", dummies=" + dummies + ", files=" + files
					+ ", theme=" + theme + "]";
		}
		
		
}


