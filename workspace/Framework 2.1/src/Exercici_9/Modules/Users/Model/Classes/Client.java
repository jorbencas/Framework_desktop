package Exercici_9.Modules.Users.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import Exercici_9.Menu;
import Exercici_9.Classes.Fecha;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Utils.Format;

@XStreamAlias("Client")
public class Client extends Class_user {
	// Attributes
	@XStreamAlias("fecha_de_alta")
	private Fecha fecha_de_alta;
	@XStreamAlias("antiguedad")
	private int antiguedad;
	@XStreamAlias("email")
	private String email;
	@XStreamAlias("password")
	private String passwd;
	@XStreamAlias("Descuentos")
	private float Descuentos;
	@XStreamAlias("Promociones")
	private String Promociones;
	@XStreamAlias("numero_compras")
	private int num_compras;
	// Methods

		// constructor
	public Client(String nombre, String direccion, int cod_postal, String telefono, Fecha fecha_nacimiento, char sexe, String email, String passwd, String DNI, Fecha fecha_de_alta, String Promociones, int num_compras){
		super(nombre, direccion, cod_postal, telefono, fecha_nacimiento, sexe, DNI);
		this.fecha_de_alta = fecha_de_alta;
		this.email = email;
		this.passwd = passwd;
		this.Promociones = Promociones;
		this.num_compras = num_compras;
		this.setAntiguedad(CalculaAntiguedad());
		this.setDescuentos(Calculadescuentos());
	}
	
	public Client (String DNI){
		super(DNI);
		}
	
	
	public float Calculadescuentos(){
		if(this.getnum_compras() <= 10 ){
			Descuentos = (float) 20.62;
		}else if (((this.getnum_compras() > 10) && (this.getnum_compras() <= 20))){
			Descuentos = (float) 40.487;
		}else if (((this.getnum_compras() > 20) && (this.getnum_compras() <= 30))){
			Descuentos = (float) 60.125;
		}else if (this.getnum_compras() > 30){
			Descuentos = (float) 80.968;
		}
		return Descuentos;
	}

	// getter
	public Fecha getFecha_de_alta() {
		return fecha_de_alta;
	}
	
	public int getAntiguedad() {
		return antiguedad = CalculaAntiguedad();
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public float getDescuentos() {
		return Descuentos = Calculadescuentos();
	}
	
	public String getPromociones() {
		return Promociones;
	}
	
	public int getnum_compras() {
		return num_compras;
	}
	
	// setter
	public void setFecha_de_alta(Fecha fecha_de_alta) {
		this.fecha_de_alta = fecha_de_alta;
		this.setAntiguedad(CalculaAntiguedad());
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void setDescuentos(float Descuentos) {
		this.Descuentos = this.Calculadescuentos();
	}

	public void setPromociones(String Promociones) {
		this.Promociones = Promociones;
	}
	
	public void setnum_compras(int num_compras) {
		this.num_compras = num_compras;
		this.setDescuentos(Calculadescuentos());
	}
	
	public int CalculaAntiguedad(){
		return antiguedad = fecha_de_alta.RestaFechas();
	}
	

	// to_String
	public String to_String() {
		float moneda = 0.0f;
		String cad = "";
		moneda = this.getDescuentos();
		cad = cad + (languages.getInstance().getProperty("name3") + this.getnombre() + "\n" );
		cad = cad + (languages.getInstance().getProperty("adress3") + this.getdireccion() + "\n" );
		cad = cad + (languages.getInstance().getProperty("codepost2") + this.getcod_postal() + "\n");
		cad = cad + (languages.getInstance().getProperty("insertphone3")+ this.gettelefono()+"\n");
		cad = cad + (languages.getInstance().getProperty("date_birthday3") + this.getfecha_nacimiento().to_String() + "\n");
		cad = cad + (languages.getInstance().getProperty("age") + this.getedad() + "\n");
		cad = cad + (languages.getInstance().getProperty("sex") + this.getsexe() + "\n"); 
		cad = cad + (languages.getInstance().getProperty("dni2") + this.getDNI()+ "\n");
		cad = cad + (languages.getInstance().getProperty("date_regist2") + this.getFecha_de_alta().to_String() + "\n");
		cad = cad + (languages.getInstance().getProperty("career") + this.getAntiguedad() + "\n");
		cad = cad + (languages.getInstance().getProperty("email2") + this.getEmail()  + " \n"); 
		cad = cad + (languages.getInstance().getProperty("pass3") + this.getPasswd() + " \n");
		cad = cad + (languages.getInstance().getProperty("discounts") + Format.formatdecimalandcurrency(moneda) + "\n");
		cad = cad + (languages.getInstance().getProperty("promotions2") + this.getPromociones()+ "\n");
	return cad ;
	}
	
}
