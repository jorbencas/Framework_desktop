package Exercici_9.Modules.Users.Model.BLL.BLL_dummies;

import java.util.Random;
import Exercici_9.Classes.Fecha;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Class_user;
import Exercici_9.Modules.Users.Model.Classes.Client;
import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Utils.menus;

public class Make_dummies {

	public static String DNI() {
		int a =0;
		String DNI = "";
		
		String letter = "TRWAGMYFPDXBNJZSQVHLCKE";
		for(int i = 0; i < 8; i++){
			a = ((int) (Math.random() * 1000)) % 10;
			DNI = DNI + a;
		}

		a=((int)(Math.random() * 1000))%23;
		DNI = DNI + letter.charAt(a);
		return DNI;
	}
	
	public static String nombre (){
		String user = "";
		String[] users = {"vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
	            "jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina",
	            "pepe", "oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria",
	            "elena", "beltran", "pablo", "juanjo"};
		
		int position = (int) (Math.random() * 222) % 10;
		return user = users[position];
	}
	
	public static String passwd (){
		String pass = "";
		String[] passwords = {"vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
	            "jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina",
	            "pepe", "oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria",
	            "elena", "beltran", "pablo", "juanjo"};
		
		int position = (int) (Math.random() * 222) % 10;
		return pass = passwords[position];
	}
	
	public static String direccion (){
		String avatar = "";
		String[] avatars = {"Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76",
	            "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76",
	            "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76",
	            "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76", "Carrer_colau_n76"};
		
		int position = (int) (Math.random() * 222) % 10;
		return avatar = avatars[position];
	}
	
	
	public static String Promociones(){
		String name = "";
		String[] names = {"vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
	            "jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina",
	            "pepe", "oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria",
	            "elena", "beltran", "pablo", "juanjo"};
		
		int position = (int) (Math.random() * 222) % 10;
		return name = names[position];
	}
	
	public static String Productos_de_interes(){
		String surname = "";
		String [] surnames = {"alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
					"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
					"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
					"frances", "gomez", "mico", "ferrandiz", "casanova"};
		
		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}
	
	public static String email (){
		String email = "";
		String[] emails = {"vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
	            "jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina",
	            "pepe", "oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria",
	            "elena", "beltran", "pablo", "juanjo"};
		
		int position = (int) (Math.random() * 222) % 10;
		return email = emails[position]+"@gmail.com";
	}
	
	public static String telefono(){
		String mobilephone = "";
        long time = new java.util.GregorianCalendar().getTimeInMillis();
        Random random = new Random(time);
        while (mobilephone.length() < 9) {
            char c = (char) random.nextInt(255);
            if ((c >= '0' && c <= '9')) {
            	mobilephone += c;
            }
        }
        return mobilephone;
	}
	
	public static Fecha fecha_nacimiento(){
		int day, month,year, year3, position, years2 = 0, Year = 0;

		String [] years = {"19", "19"};
		 day = (int) (Math.random() * (1 - 31) + 31);
		 month = (int) (Math.random() * (1 - 12) + 12);
		 year3 = (int) (Math.random() * (45 - 98) + 98);
		 position = (int) (Math.random() * 222) % 2;
		String year2 = years[position]+year3;
		year = Integer.parseInt(year2);
		
		return new Fecha(day, month, year);
	}
	
	public static int cod_postal(){
		String cad = "";
        long time = new java.util.GregorianCalendar().getTimeInMillis();
        Random random = new Random(time);
        while (cad.length() < 5) {
            char c = (char) random.nextInt(255);
            if ((c >= '0' && c <= '5')) {
                cad += c;
            }
        }
        int codpost = Integer.parseInt(cad);
        return codpost;
	}
	
	
	public static Fecha fecha_contratacion(){
		int day = 0, month = 0,year = 0, year3, position, Year= 0;
			
	String [] years = {"20", "20"};
	day = (int) (Math.random() * (1 - 31) + 31);
	month = (int) (Math.random() * (1 - 12) + 12);
	year3 = (int) (Math.random() * (0 - 16) + 16);
	position = (int) (Math.random() * 222) % 2;
	String year2 = years[position]+year3;
	year = Integer.parseInt(year2);
	System.out.println(year);
			
		Year = 2000;
		year = Year+year3;
			
		return new Fecha(day, month, year);
	}

	public static float salary (){
		float salary = (float) (Math.random() * (600 - 2000) + 2000);
		return (float) Math.rint(salary * 100) / 100;
	}
	
	public static Fecha fecha_de_alta(){
		int day = 0, month = 0,year = 0, year3, position, Year= 0;
		
		String [] years = {"20", "20"};
		day = (int) (Math.random() * (1 - 31) + 31);
		month = (int) (Math.random() * (1 - 12) + 12);
		year3 = (int) (Math.random() * (0 - 16) + 16);
		position = (int) (Math.random() * 222) % 2;
		String year2 = years[position]+year3;
		year = Integer.parseInt(year2);
		System.out.println(year);
				
			Year = 2000;
			year = Year+year3;
		
		return new Fecha(day, month, year);
	}
	
	public static char sexe(){
			char state;
			char [] states = {'H','M'};
			
			int position = (int) (Math.random() * 222) % 2;
			return state = states[position];
	}
	
	public static int num_compras(){
		int point = (int) (Math.random() * (5 - 90) + 90);
		return (int) Math.rint(point * 100) / 100;
	}
	
	public static int num_comentarios(){
		int point = (int) (Math.random() * (5 - 90) + 90);
		return (int) Math.rint(point * 100) / 100;
	}
	
	/* BUILDER
	 * 
	 */
	public static void makedummies_admin () {
		Singleton.useradmin.clear();
		for (int i=0; i<5; i++) {
			Admin a1 = new Admin (nombre(), direccion(), cod_postal(), telefono(), fecha_nacimiento(), DNI(), fecha_contratacion(), sexe(), email(), passwd());
			Singleton.useradmin.add(a1);
		}
	}
	
	public static void makedummies_client () {
		Singleton.userclient.clear();
		for (int i=0; i<5; i++) {
			Client c1 = new Client(nombre(), direccion(), cod_postal(), telefono(), fecha_nacimiento(), sexe(), email(), passwd(), DNI(), fecha_de_alta(), Promociones(), num_compras());
			Singleton.userclient.add(c1);
		}
	}
	
	public static void makedummies_userregister () {
		Singleton.userregister.clear();
		for (int i=0; i<5; i++) {
			User u1 = new User(nombre(), direccion(), cod_postal(), telefono(), fecha_nacimiento(), sexe(), DNI(), Productos_de_interes(), Promociones(), num_comentarios());
			Singleton.userregister.add(u1);
		}
	}
	
	//Update
	
	public static Class_user update_users_generic(Class_user u) {
		// Cambiem les dades del Normal
		if (u instanceof User) {
			String[] tipo = { languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("adress2"),	languages.getInstance().getProperty("codepost1"), languages.getInstance().getProperty("insertphone2"),languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("sex2"),languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("products_of_interest2"),languages.getInstance().getProperty("promotions1"), languages.getInstance().getProperty("numcoments2") };
			String field = menus.menucombo(tipo, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
			switch (field) {
			case "Nombre":
			case "Name":
			case "Nom":
				((User) u).setnombre(nombre());
				break;
			case "Dirección":
			case "Adress":
			case "Direcció":
				((User) u).setdireccion(direccion());
				break;
			case "codigo postal":
			case "postal code":
			case "Códig postal":
				((User) u).setcod_postal(cod_postal());
				break;
			case "Phone number":
			case "Numero de Telefono":
			case "Numero de Telefon":
				((User) u).settelefono(telefono());
				break;
			case "Fecha de nacimiento":
			case "Date birthday":
			case "Data de naixement":
				((User) u).setfecha_nacimiento(fecha_nacimiento());
				break;
			case "Sexe":
			case "Sexo":
			case "Sex":
				((User) u).setsexe(sexe());
				break;
			case "DNI":
				((User) u).setDNI(DNI());
				break;
			case "Producto de interes":
			case "Product of interest":
			case "Producte d'interes":
				((User) u).setProductos_de_interes(Productos_de_interes());
				break;
			case "Promocion":
			case "Promotion":
			case "Promocció":
				((User) u).setPromociones(Promociones());
				break;
			case "Number of coments":
			case "Numero de comentarios":
			case "Numero de Comentaris":
				((User) u).setnum_comentarios(num_comentarios());
				break;
			}// end switch case
		} // end casting

		// Cambiem les dades del Administrador
		if (u instanceof Admin) {
			String[] tipo = { languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("adress2"),	languages.getInstance().getProperty("codepost1"), languages.getInstance().getProperty("insertphone2"),languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("sex2"),	languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("date_hiri1"), languages.getInstance().getProperty("email1"),languages.getInstance().getProperty("pass2") };
			String field = menus.menucombo(tipo, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
			switch (field) {
			case "Nombre":
			case "Name":
			case "Nom":
				((Admin) u).setnombre(nombre());
				break;
			case "Dirección":
			case "Adress":
			case "Direcció":
				((Admin) u).setdireccion(direccion());
				break;
			case "Codigo postal":
			case "Postal code":
			case "Códig postal":
				((Admin) u).setcod_postal(cod_postal());
				break;
			case "Phone Number":
			case "Numero de Telefono":
			case "Numero de Telefon":
				((Admin) u).settelefono(telefono());
				break;
			case "Fecha de nacimiento":
			case "Date birthday":
			case "Data de naixement":
				((Admin) u).setfecha_nacimiento(fecha_nacimiento());
				break;
			case "Sexe":
			case "Sexo":
			case "Sex":
				((Admin) u).setsexe(sexe());
				break;
			case "DNI":
				((Admin) u).setDNI(DNI());
				break;
			case "Date of hiring":
			case "Fecha de contratacción":
			case "Data de Contractacció":
				((Admin) u).setfecha_contratacion(fecha_contratacion());
				break;
			case "Email":
			case "Correo electronico":
			case "Correu electronic":
				((Admin) u).setEmail(email());
				break;
			case "Password":
			case "Contraseña":
			case "Contrasenya":
				((Admin) u).setPasswd(passwd());
				break;
			}// end switch case
		} // end casting

		// Cambiem les dades del Client
		if (u instanceof Client) {
			String[] tipo = { languages.getInstance().getProperty("name2"), languages.getInstance().getProperty("adress2"),languages.getInstance().getProperty("codepost1"), languages.getInstance().getProperty("insertphone2"),languages.getInstance().getProperty("date_birthday2"), languages.getInstance().getProperty("sex2"),languages.getInstance().getProperty("dni"), languages.getInstance().getProperty("date_regist1"),languages.getInstance().getProperty("email1"), languages.getInstance().getProperty("pass2"),languages.getInstance().getProperty("promotions1"), languages.getInstance().getProperty("numcomp1") };
			String field = menus.menucombo(tipo, languages.getInstance().getProperty("choose_an_option"),languages.getInstance().getProperty("exercisemenu"));
			switch (field) {
			case "Nombre":
			case "Name":
			case "Nom":
				((Client) u).setnombre(nombre());
				break;
			case "Dirección":
			case "Adress":
			case "Direcció":
				((Client) u).setdireccion(direccion());
				break;
			case "codigo postal":
			case "postal code":
			case "Códig postal":
				((Client) u).setcod_postal(cod_postal());
				break;
			case "Phone Number":
			case "Numero de Telefono":
			case "Numero de Telefon":
				((Client) u).settelefono(telefono());
				break;
			case "Fecha de nacimiento":
			case "Date birthday":
			case "Data de naixement":
				((Client) u).setfecha_nacimiento(fecha_nacimiento());
				break;
			case "Sexe":
			case "Sexo":
			case "Sex":
				((Client) u).setsexe(sexe());
				break;
			case "DNI":
				((Client) u).setDNI(DNI());
				break;
			case "Date of registration":
			case "Fecha de alta":
			case "Data de alta":
				((Client) u).setFecha_de_alta(fecha_de_alta());
				break;
			case "Email":
			case "Correo electronico":
			case "Correu electronic":
				((Client) u).setEmail(email());
				break;
			case "Password":
			case "Contraseña":
			case "Contrasenya":
				((Client) u).setPasswd(passwd());
				break;
			case "Number of purchases":
			case "Numero de compras":
			case "Numero de compres":
				((Client) u).setnum_compras(num_compras());
				break;
			case "Promocion":
			case "Promotion":
			case "Promocció":
				((Client) u).setPromociones(Promociones());
				break;
			}// end switch case
		} // end casting

		return u;
	}


}
