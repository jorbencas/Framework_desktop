package Exercici_9.Modules.Users.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import Exercici_9.Menu;
import Exercici_9.Classes.Fecha;
import Exercici_9.Classes.Setting;
import Exercici_9.Classes.Lenguage.languages;

@XStreamAlias("User")
public class User extends Class_user {
	// Attributes
	@XStreamAlias("Productos_de_interes")
	private String Productos_de_interes;
	@XStreamAlias("Promociones")
	private String Promociones;
	@XStreamAlias("numero_de_comentarios")
	private int num_comentarios;
	@XStreamAlias("karma")
	private String karma;
	@XStreamAlias("puntos")
	private int puntos;
	// Methods

		// constructor
	public User (String nombre, String direccion,int cod_postal, String telefono, Fecha fecha_nacimiento,char sexe, String DNI, String Productos_de_interes, String Promociones, int num_comentarios){
		super(nombre, direccion, cod_postal, telefono, fecha_nacimiento, sexe, DNI);
		this.Productos_de_interes = Productos_de_interes;
		this.Promociones = Promociones;
		this.num_comentarios = num_comentarios;
		this.setkarma(calculakarma());
		this.setpuntos(calculapuntos());
	}
	
	public User (String DNI){
		super(DNI);
		}
	
	public String calculakarma(){
		String lang = Setting.getInstance().getLanguage();
		if((lang.equals("Spanish")) || (lang.equals("Valencian")) || (lang.equals("English"))){
			if(this.getnum_comentarios() <= 10){
				karma = languages.getInstance().getProperty("karma2");
			}else if ((this.getnum_comentarios() > 10) && (this.getnum_comentarios() <= 50)){
				karma = languages.getInstance().getProperty("karma1");
			}else if((this.getnum_comentarios() > 50) && (this.getnum_comentarios() <=100)){
				karma = languages.getInstance().getProperty("karmas");
			}else if((this.getnum_comentarios() > 100)  ){
				karma = languages.getInstance().getProperty("karma3");
			}
		}
			return karma;
	}
	
	public int calculapuntos(){
		String karma = this.getkarma();
		if((karma.equals("low")) || (karma.equals("Bajo")) || (karma.equals("Baix"))){
			puntos = 10;
		}else if(karma.equals("medium") || (karma.equals("Medio")) || (karma.equals("Mitja"))){
			puntos = 50;
		}else if(karma.equals("Higth") || (karma.equals("Alto")) || (karma.equals("Alt"))){
			puntos = 100;
		}else if ( (karma.equals("Super Higth")) || (karma.equals("Super Alto")) || (karma.equals("Super Alt"))){
			puntos = 500;
		}
		return puntos;
	}

	// getter
	public String getProductos_de_interes() {
		return Productos_de_interes;
	}
	
	public String getPromociones() {
		return Promociones;
	}
	
	public int getnum_comentarios(){
		return  num_comentarios;
	}
	
	public String getkarma(){
		return karma  = this.calculakarma() ;
	}
	
	public int getpuntos(){
		return puntos = calculapuntos();
	}
	
	// setter
	public void setProductos_de_interes(String Productos_de_interes) {
		this.Productos_de_interes = Productos_de_interes;
	}

	public void setPromociones(String Promociones) {
		this.Promociones = Promociones;
	}

	public void setnum_comentarios(int num_comentarios){
		this.num_comentarios = num_comentarios;
		this.setkarma(calculakarma());
		this.setpuntos(calculapuntos());
	}
	
	public void setkarma(String karma){
		this.karma = calculakarma();
	}	
	
	public void setpuntos( int puntos){
		this.puntos = calculapuntos();
	}
	
	// to_String
	public String to_String() {
		String cad = "";
		cad = cad + (languages.getInstance().getProperty("name3") + this.getnombre() + "\n");
		cad = cad + (languages.getInstance().getProperty("adress3") + this.getdireccion() + "\n");
		cad = cad + (languages.getInstance().getProperty("codepost2") + this.getcod_postal() + "\n");
		cad = cad + (languages.getInstance().getProperty("insertphone3") + this.gettelefono() + "\n");
		cad = cad + (languages.getInstance().getProperty("date_birthday3") + this.getfecha_nacimiento().to_String() + "\n");
		cad = cad + (languages.getInstance().getProperty("age") + this.getedad() + "\n");
		cad = cad + (languages.getInstance().getProperty("sex") + this.getsexe() + "\n");
		cad = cad + (languages.getInstance().getProperty("dni2") + this.getDNI() + "\n");
		cad = cad + (languages.getInstance().getProperty("products_of_interest1") + this.getProductos_de_interes() + "\n");
		cad = cad + (languages.getInstance().getProperty("promotions2") + this.getPromociones() + "\n");
		cad = cad + (languages.getInstance().getProperty("karma") + this.getkarma() + "\n");
		cad = cad + (languages.getInstance().getProperty("points") + this.getpuntos() + "\n");
		return cad;
	}
	
}
