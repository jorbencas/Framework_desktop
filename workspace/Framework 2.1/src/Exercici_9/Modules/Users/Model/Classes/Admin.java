package Exercici_9.Modules.Users.Model.Classes;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import Exercici_9.Menu;
import Exercici_9.Classes.Fecha;
import Exercici_9.Classes.Lenguage.languages;
import Exercici_9.Utils.Format;
@XStreamAlias("Admin")
public class Admin extends Class_user  implements Serializable{
	// Attributes
	@XStreamAlias("fecha_de_contratacion")
	private Fecha fecha_contratacion;
	@XStreamAlias("antiguedad")
	private int antiguedad;
	@XStreamAlias("email")
	private String email;
	@XStreamAlias("password")
	private String passwd;
	@XStreamAlias("Salari")
	private float Salari;
	// Methods

	// constructor
	public Admin (String nombre, String direccion, int cod_postal, String telefono, Fecha fecha_nacimiento, String DNI, Fecha fecha_contratacion,  char sexe, String email, String passwd){
	super(nombre, direccion, cod_postal, telefono, fecha_nacimiento, sexe, DNI);
	this.fecha_contratacion = fecha_contratacion;
	this.email = email;
	this.passwd = passwd;
	this.setAntiguedad(CalculaAntiguedad());
	}
	
	public Admin (String DNI){
		super(DNI);
		}
	
	public float calculasalary(){
		if(this.getAntiguedad() <= 10){
			Salari = (float) 1000.654;
		}else if (((this.getAntiguedad() > 10) && (this.getAntiguedad() <= 20))){
			Salari = (float) (1000.567+405.123);
		}else if((( this.getAntiguedad() > 20) && (this.getAntiguedad() <= 30 ))){
			Salari = (float) (1900.123+515.635);
		}else if ((( this.getAntiguedad() > 30) && (this.getAntiguedad() <= 40 ))){
			Salari = (float) (2008.790+548);
		}else if( this.getAntiguedad() >40){
			Salari = (float) (2500.521+1000.48);
		}
		
		return Salari;
	}
	
	 //getter
	public Fecha getfecha_contratacion(){
		return fecha_contratacion;
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
	
	public float getSalari() {
		return Salari = calculasalary();
	}
	
	//setter
	public void setfecha_contratacion(Fecha fecha_contratacion){
		this.fecha_contratacion = fecha_contratacion;
		this.setAntiguedad(CalculaAntiguedad());
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
		this.setSalari(calculasalary());
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void setSalari(float Salari) {
		this.Salari = Salari;
	}
	
	public int CalculaAntiguedad(){
		return antiguedad = fecha_contratacion.RestaFechas();
	}
	
	// to_String
		public String to_String() {
			float moneda = 0.0f;
			String cad = "";
			moneda = this.getSalari();
			cad = cad + (languages.getInstance().getProperty("name3") + this.getnombre() + "\n" );
			cad = cad + (languages.getInstance().getProperty("adress3") + this.getdireccion() + "\n" );
			cad = cad + (languages.getInstance().getProperty("codepost2") + this.getcod_postal() + "\n");
			cad = cad + (languages.getInstance().getProperty("insertphone3") + this.gettelefono()+"\n");
			cad = cad + (languages.getInstance().getProperty("date_birthday3") + this.getfecha_nacimiento().to_String()+"\n");
			cad = cad + (languages.getInstance().getProperty("age") + this.getedad() + "\n");
			cad = cad + (languages.getInstance().getProperty("sex") + this.getsexe() + "\n"); 
			cad = cad + (languages.getInstance().getProperty("dni2") + this.getDNI() + "\n");
			cad = cad + (languages.getInstance().getProperty("date_hiri2") + this.getfecha_contratacion().to_String() + "\n");
			cad = cad + (languages.getInstance().getProperty("career") + this.getAntiguedad() + "\n");
			cad = cad + (languages.getInstance().getProperty("email2") + this.getEmail()  + " \n"); 
			cad = cad + (languages.getInstance().getProperty("pass3") + this.getPasswd() + " \n");
			cad = cad + (languages.getInstance().getProperty("salari") + Format.formatdecimalandcurrency(moneda)+ "\n");
		return cad ;
		}
}
