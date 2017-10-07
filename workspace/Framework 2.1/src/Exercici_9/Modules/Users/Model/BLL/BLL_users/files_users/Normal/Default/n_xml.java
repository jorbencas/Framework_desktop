package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.Default;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;

import Exercici_9.Modules.Users.Model.Classes.Singleton;
import Exercici_9.Modules.Users.Model.Classes.User;

public class n_xml {

	 private static final String ENCODING = "UTF-8";
	public static void genera_xml_auto (){
		 String PATH = null;

	     try {
	         PATH = new java.io.File(".").getCanonicalPath()
	                 + "/src/Exercici_9/Modules/Users/Model/file_users/Normal/files/User.xml";
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	     if (Singleton.userregister.size() > 0) {
	     try {
	         OutputStream os = new ByteArrayOutputStream();
	         OutputStreamWriter osw = new OutputStreamWriter(os);
	         XStream xstream = new XStream();

	         Annotations.configureAliases(xstream, User.class);
	         String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING+ "\"?>\n";
	         xstream.toXML(Singleton.userregister, osw);
	         StringBuffer xml = new StringBuffer();
	         xml.append(header);
	         xml.append(os.toString());

	         FileWriter fileXml = new FileWriter(PATH);
	         fileXml.write(xml.toString());
	         fileXml.close();
	         osw.close();
	         os.close();
	     } catch (IOException e) {
	         // JOptionPane.showMessageDialog(null, "Error al grabar el XML",
	         // "Error", JOptionPane.ERROR_MESSAGE);
	     }
		} else {
			File path = new File(PATH);
		}
	}
	
	public static void obri_xml_default(){
		 String PATH;

	        try {
	            XStream xstream = new XStream();
	            Annotations.configureAliases(xstream, User.class);

	            PATH = new java.io.File(".").getCanonicalPath()
	                    + "/src/Exercici_9/Modules/Users/Model/file_users/Normal/files/User.xml";

	            File path = new File(PATH);

	            if (path.exists()) {
	               Singleton.userregister = (ArrayList<User>) xstream .fromXML(new FileReader(PATH));
	            }

	        } catch (IOException e) {
	            // JOptionPane.showMessageDialog(null, "Error al leer el XML",
	            // "Error", JOptionPane.ERROR_MESSAGE);
	        }
	}
}
