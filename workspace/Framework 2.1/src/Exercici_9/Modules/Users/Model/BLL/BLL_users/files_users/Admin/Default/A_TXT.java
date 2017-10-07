package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.Default;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Exercici_9.Modules.Users.Model.Classes.Admin;
import Exercici_9.Modules.Users.Model.Classes.Singleton;

public class A_TXT {

	public static void gernera_txt_auto(){
String PATH = null;
        
        try {
            PATH = new java.io.File(".").getCanonicalPath()
                    + "/src/Exercici_9/Modules/Users/Model/file_users/Admin/files/Admin.txt";
        } catch (IOException e) {
            e.printStackTrace();
        }

		if (Singleton.useradmin.size() > 0) {
	        try {
	            File file;
	            
	            file = new File(PATH);
	            
	            FileOutputStream FOS=new FileOutputStream(file);
				ObjectOutputStream OOS=new ObjectOutputStream(FOS);
				OOS.writeObject(Singleton.useradmin);
				OOS.close();
	            
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null,"errorsave_txt", "errortitle", JOptionPane.ERROR_MESSAGE);
	        }
        } 
	}
	public static void obri_txt_auto (){
		String PATH = null;
        try {
            File file;
            PATH = new java.io.File(".").getCanonicalPath()
                    + "/src/Exercici_9/Modules/Users/Model/file_users/Admin/files/Admin.txt";
            file = new File(PATH);
            
            FileInputStream FIS=new FileInputStream(file);
    		ObjectInputStream OIS=new ObjectInputStream(FIS);
    		Singleton.useradmin = (ArrayList<Admin>)OIS.readObject();
    		OIS.close();
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "erroropen_txt", "errortitle", JOptionPane.ERROR_MESSAGE);
        }
	}
	
}
