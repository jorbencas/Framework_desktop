package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.On_demant;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Singleton;


public class TXT {

	 public static void generatxt() {
		 String PATH = null;
	        try {
	            File file;
	            JFileChooser fileChooser = new JFileChooser();
	            
	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
	            
	            int selection = fileChooser.showSaveDialog(null);
	            if (selection == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                if (!PATH.endsWith(".txt")) {
	                	PATH=PATH+ ".txt";
	                }
	                
	                file = new File(PATH);
	                
	                FileOutputStream FOS=new FileOutputStream(file);
					ObjectOutputStream OOS=new ObjectOutputStream(FOS);
					OOS.writeObject(Singleton.useradmin);
					OOS.close();
	                JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
	            }
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, "errorsave_txt", "errortitle", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    
	
	public static void obri_txt() {
		String PATH = null;
        try {
            File f;
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));

            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File JFC = fileChooser.getSelectedFile();
                PATH = JFC.getAbsolutePath();
                if (!PATH.endsWith(".txt")) {
                	PATH=PATH+ ".txt";
                }
                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			Singleton.useradmin = (ArrayList<Admin>)oi.readObject();
    			oi.close();
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
