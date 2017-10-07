package Exercici_9.Classes;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import Exercici_9.Menu;

@XStreamAlias("Fecha")
public class Fecha implements Serializable{
	// attributes
	@XStreamAlias("fecha")
	private String fecha;
	@XStreamAlias("day")
	private int day;
	@XStreamAlias("month")
	private int month;
	@XStreamAlias("year")
	private int year;
	 
	public Fecha(String introducefecha) {

		String[] datearray = new String[3];
		switch (Setting.getInstance().getDate_config()) {
		case "DD/MM/YYYY":
			datearray = introducefecha.split("/");
			this.day = Integer.parseInt(datearray[0]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[2]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "DD-MM-YYYY":
			datearray = introducefecha.split("-");
			this.day = Integer.parseInt(datearray[0]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[2]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "YYYY/MM/DD":
			datearray = introducefecha.split("/");
			this.day = Integer.parseInt(datearray[2]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[0]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "YYYY-MM-DD":
			datearray = introducefecha.split("-");
			this.day = Integer.parseInt(datearray[2]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[0]);
			this.fecha = day + "/" + month + "/" + year;
			break;
		}
	}
	
	public Fecha (int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		this.fecha=day+"/"+month+"/"+year;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
		this.fecha = (day + "/" + this.month + "/" + this.year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
		this.fecha = (this.day + "/" + month + "/" + this.year);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
		this.fecha = (this.day + "/" + this.month + "/" + year);
	}

	public String getfecha() {
		return fecha;
	}
	
	public String CalendartoString (Calendar fecha) {
		int day, month, year;
		String dateS="", dateS2="XX/XX/XX";
	
		try {
		day=fecha.get(Calendar.DATE);
		month=(fecha.get(Calendar.MONTH)+1);
		year=fecha.get(Calendar.YEAR);
		dateS=day+"/"+month+"/"+year;
		}catch(Exception e) {
			return dateS2;
		}
		
		return dateS;
	}
	
	public Calendar StringtoCalendar () {
		Calendar date = Calendar.getInstance();

		try {
			date.set(this.getYear(), this.getMonth(), this.getDay());
		} catch (Exception e) {
			return date;

		}

		return date;
	}
	

	public int restarFechaSistema () {
		int anyo1;
		int anyo2;
		Calendar fecha1 = Calendar.getInstance();
		Calendar fecha2 = this.StringtoCalendar();

		anyo1 = fecha1.get(Calendar.YEAR);
		anyo2 = fecha2.get(Calendar.YEAR);

		return (anyo1 - anyo2);
	}
	
	public int restar2Fechas (Fecha fecha2) {
		int anyo1;
		int anyo2;
		Calendar fecha1 = this.StringtoCalendar();
		Calendar fecha2Calen = fecha2.StringtoCalendar();

		anyo1 = fecha1.get(Calendar.YEAR);
		anyo2 = fecha2Calen.get(Calendar.YEAR);

		return (anyo2 - anyo1);

	}
	
	public int comparaFechas (Fecha fecha2) {
		Calendar date1 = null;
		Calendar date2 = null;
		
		date2 = fecha2.StringtoCalendar();
		date1 = this.StringtoCalendar();
	
		if ( date1.before(date2) ) {//si la data de 1 es anterior a la data2, retorna 1	
			return 1;
		}
		else if ( date1.after(date2) ) {//si la data1 es posterior a la data2, retornara un 2		
			return 2;
		}
		else//si les 2 dates, son iguals, retornara 0		
			return 3;

	}
	
	public boolean compara_datos(int edad, int antiguedad) {
		boolean bo = false;
		int edadv = 0;
		edadv = edad - antiguedad;
		if (edadv < 18) {
			bo = false;
			JOptionPane.showMessageDialog(null, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			bo = true;
		}
		return bo;
	}
	
	public int RestaFechas () {
		int leastyear=0, year=0, completeyear=0, cont=0;
		long days=0;
		GregorianCalendar cal1 = new GregorianCalendar ();
		GregorianCalendar cal2 = new GregorianCalendar ();
	
		cal1.set(this.getYear(), this.getMonth()-1, this.getDay());
		long day = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		days = day / (1000 * 60 * 60 * 24); //convert to days
		for (int i=cal1.get(Calendar.YEAR)+1; i<=cal2.get(Calendar.YEAR); i++) {
			if (cal1.isLeapYear(i)) {
                cont++;// cuento el nº de años bisiestos entre las fechas
                i = i + 3;
		}
		}
		
		leastyear=cont*366;
		year=(int)days-leastyear;
		completeyear=year/365;
		completeyear=completeyear+cont;
		
		return completeyear;
	}
	
	public void setfecha(String introducefecha) {
		String[] datearray = new String[3];
		switch (Setting.getInstance().getDate_config()) {
		case "DD/MM/YYYY":
			datearray = introducefecha.split("/");
			this.day = Integer.parseInt(datearray[0]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[2]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "DD-MM-YYYY":
			datearray = introducefecha.split("-");
			this.day = Integer.parseInt(datearray[0]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[2]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "YYYY/MM/DD":
			datearray = introducefecha.split("/");
			this.day = Integer.parseInt(datearray[2]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[0]);
			this.fecha = day + "/" + month + "/" + year;
			break;

		case "YYYY-MM-DD":
			datearray = introducefecha.split("-");
			this.day = Integer.parseInt(datearray[2]);
			this.month = Integer.parseInt(datearray[1]);
			this.year = Integer.parseInt(datearray[0]);
			this.fecha = day + "/" + month + "/" + year;
			break;
		}
	}

	// metodo per a validar una fecha
	public boolean validaFecha() {

		boolean valido = false;

		int day = this.getDay();
		int month = this.getMonth();
		int year = this.getYear();

		if ((year > 1930) && (year < 2090)) {
			if ((month >= 1) && (month <= 12)) {
				switch (month) {
				case 1: // Enero
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 2: // Febrero

					if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0)))
							&& (day > 0) && (day <= 29))
						valido = true; // Año Bisiesto
					else if ((day > 0) && (day <= 28))
						valido = true;
					break;
				case 3: // Marzo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 4: // Abril
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 5: // Mayo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 6: // Junio
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 7: // Julio
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 8: // Agosto
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 9: // Septiembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 10: // Octubre
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 11: // Noviembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 12: // Diciembre

					if ((day > 0) && (day <= 31))
						valido = true;
					break;

				default:
					valido = false;
				}
			} else
				valido = false;
		} else
			valido = false;
		return valido;
	}

	// toString

	public String to_String() {
		String cad = "";
		switch (Setting.getInstance().getDate_config()) {
		case "DD/MM/YYYY":
			cad = String.format("%02d", this.getDay()) + "/" + String.format("%02d", this.getMonth()) + "/"
					+ this.getYear();
			break;
		case "DD-MM-YYYY":
			cad = String.format("%02d", this.getDay()) + "-" + String.format("%02d", this.getMonth()) + "-"
					+ this.getYear();
			break;
		case "YYYY/MM/DD":
			cad = this.getYear() + "/" + String.format("%02d", this.getMonth()) + "/"
					+ String.format("%02d", this.getDay());
			break;
		case "YYYY-MM-DD":
			cad = this.getYear() + "-" + String.format("%02d", this.getMonth()) + "-"
					+ String.format("%02d", this.getDay());
			break;
			default:
				cad = String.format("%02d", this.getDay()) + "/" + String.format("%02d", this.getMonth()) + "/"
						+ this.getYear();
				break;
		}
		return cad;
	}

}