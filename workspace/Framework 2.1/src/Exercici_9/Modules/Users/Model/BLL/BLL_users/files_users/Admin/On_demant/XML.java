package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.On_demant;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Singleton;



public class XML {

    private static final String ENCODING = "UTF-8";
	public static void generaxml() {
		String PATH;

        try {
            OutputStream os = new ByteArrayOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            XStream xstream = new XStream();

            // Annotations.configureAliases(xstream, Asociacion.class);
            String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING
                    + "\"?>\n";
            xstream.toXML(Singleton.useradmin, osw);
            StringBuffer xml = new StringBuffer();
            xml.append(header);
            xml.append(os.toString());

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));

            int seleccion = fileChooser.showSaveDialog(null);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();

                if (!PATH.endsWith(".xml")) {
                    PATH = PATH + ".xml";
                }

                FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(xml.toString());
                fileXml.close();
                osw.close();
                os.close();

                JOptionPane.showMessageDialog(null,
                        "Archivo XML guardado con éxito", "Archivo XML",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al grabar el XML",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
	 public static void obri_xml() {
		 String PATH;

	        try {
	            XStream xstream = new XStream();
	             Annotations.configureAliases(xstream, Admin.class);

	            JFileChooser fileChooser = new JFileChooser();

	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));

	            int seleccion = fileChooser.showOpenDialog(null);

	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                if (!PATH.endsWith(".xml")) {
	                    PATH = PATH + ".xml";
	                }
	                Singleton.useradmin = (ArrayList<Admin>)xstream.fromXML(new FileReader(PATH));

	                JOptionPane.showMessageDialog(null,
	                        "Archivo XML abierto con éxito", "Archivo XML",
	                        JOptionPane.INFORMATION_MESSAGE);
	            }

	        } catch (HeadlessException | FileNotFoundException e) {
	            JOptionPane.showMessageDialog(null, "Error al leer el XML",
	                    "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
}
