package Exercici_9.Utils.file_setting;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import Exercici_9.Classes.Setting;

public class s_json {

	public static void savejson_config() {
        String PATH = null;
	     
        try {
            PATH = new java.io.File(".").getCanonicalPath()
                    + "/src/Exercici_9/files_config/config.json";
        } catch (IOException e) {
            e.printStackTrace();
        }
        
	    try {
		    XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
		    xstreamjson.setMode(XStream.NO_REFERENCES);
		    xstreamjson.alias("Setting", Setting.class);
		    Gson gson = new Gson();
		    String json = gson.toJson(Setting.getInstance());
		    FileWriter fileXml = new FileWriter(PATH);
		    fileXml.write(json.toString());
		    fileXml.close();
		    
		    
	    } catch (Exception e) {
	     	//JOptionPane.showMessageDialog(null, "errorsave_json", "errortitle", JOptionPane.ERROR_MESSAGE);
	    }
	}
	
	public static void openjson_config() {
    	String PATH = null;
    	Setting config = null;
    	
        try {
        	XStream xstream = new XStream(new JettisonMappedXmlDriver());
	        xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Setting", Setting.class);
			
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/Exercici_9/files_config/config.json";
	        
	        JsonReader reader = new JsonReader(new FileReader(PATH));
	        JsonParser parser = new JsonParser();
	        JsonElement root = parser.parse(reader);
	        
	        Gson json = new Gson();
	        config = json.fromJson(root,Setting.class);
	       Setting.getInstance().setCurrency_config(config.getCurrency_config());
	       Setting.getInstance().setDate_config(config.getDate_config());
	       Setting.getInstance().setDecimals_config(config.getDecimals_config());
	       Setting.getInstance().setFile(config.getFile());
	       Setting.getInstance().setLanguage(config.getLanguage());
	       Setting.getInstance().setTheme(config.getTheme());
	        
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "erroropen_json","errortitle", JOptionPane.ERROR_MESSAGE);
        }
    }
}
