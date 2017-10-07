package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.Default;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import Exercici_9.Modules.Users.Model.Classes.User;
import Exercici_9.Modules.Users.Model.Classes.Singleton;


public class n_json {

	public static void genera_json_auto() {

		String PATH = null;
		User a1 = null;

		if (Singleton.userclient.size() > 0) {
		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("User", User.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/Exercici_9/Modules/Users/Model/file_users/Normal/files/User.json";

			Gson gson = new Gson();
			String json = gson.toJson(Singleton.userregister);
			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
		} 
	}

	public static void obri_json_auto() {
		String PATH = null;
		User e1 = null;

		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("User", User.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/Exercici_9/Modules/Users/Model/file_users/Normal/files/User.json";

			Singleton.userregister.clear();

			JsonReader lector = new JsonReader(new FileReader(PATH));
			JsonParser parseador = new JsonParser();
			JsonElement raiz = parseador.parse(lector);

			Gson json = new Gson();
			JsonArray lista = raiz.getAsJsonArray();
			for (JsonElement elemento : lista) {
				e1 = json.fromJson(elemento, User.class);
				Singleton.userregister.add(e1);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
