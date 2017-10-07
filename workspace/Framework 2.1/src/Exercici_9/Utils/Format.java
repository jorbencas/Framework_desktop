package Exercici_9.Utils;

import java.text.DecimalFormat;
import Exercici_9.Menu;
import Exercici_9.Classes.Setting;

public class Format {

	 public static String formatdecimalandcurrency(float moneda) {
		String format = "";
		float monedas = 0.0f;
			
		switch (Setting.getInstance().getCurrency_config()) {
		case '$':
			switch (Setting.getInstance().getDecimals_config()){
			case 1:
				// 1 decimal
				monedas = moneda*1.0844f;
				format = Format.format1decimal(monedas);
			break;
			case 2:
				// 2 decimals
				monedas = moneda*1.0844f;
				format = Format.format2decimal(monedas); 
				break;
			case 3:
				// 3 decimals
				monedas = moneda*1.0844f;
				format = Format.format3decimal(monedas); 
				break;
			}
			format = "$" + format;
			break;
		case '£':
			if (Setting.getInstance().getDecimals_config() == 1) {
				// 1 decimal
				monedas = moneda*0.72686f;
				format = Format.format1decimal(monedas);
			} else if (Setting.getInstance().getDecimals_config() == 2) {
				// 2 decimals
				monedas = moneda*0.72686f;
				format = Format.format2decimal(monedas); 
			} else if (Setting.getInstance().getDecimals_config() == 3) {
				// 3 decimals
				monedas = moneda*0.72686f;
				format = Format.format3decimal(monedas); 
			}
			format = '£' + format;
			break;
		case '€':
			if (Setting.getInstance().getDecimals_config() == 1) {
				// 1 decimal
				format = Format.format1decimal(moneda);
			} else if (Setting.getInstance().getDecimals_config() == 2) {
				// 2 decimals
				format = Format.format2decimal(moneda); 
			} else if (Setting.getInstance().getDecimals_config() == 3) {
				// 3 decimals
				format = Format.format3decimal(moneda); 
			}
			format = format + "€";
			break;
		}
					
			return format;
		}
	 
	 public static String format1decimal(float number) {
			DecimalFormat nformat = new DecimalFormat(".0");
			return nformat.format(number);
		}

		public static String format2decimal(float number) {
			DecimalFormat nformat = new DecimalFormat(".00");
			return nformat.format(number);
		}

		public static String format3decimal(float number) {
			DecimalFormat nformat = new DecimalFormat(".000");
			return nformat.format(number);
		}
		
}
