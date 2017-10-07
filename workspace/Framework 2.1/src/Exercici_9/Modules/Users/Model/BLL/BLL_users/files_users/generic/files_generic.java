package Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.generic;

import Exercici_9.Menu;
import Exercici_9.Classes.Setting;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.Default.A_JSON;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.Default.A_TXT;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.Default.A_XML;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.On_demant.JSON;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.On_demant.TXT;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Admin.On_demant.XML;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.Default.c_json;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.Default.c_txt;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.Default.c_xml;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.On_demant.C_JSON;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.On_demant.C_TXT;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Client.On_demant.C_XML;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.Default.n_json;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.Default.n_txt;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.Default.n_xml;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.On_demant.N_JSON;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.On_demant.N_TXT;
import Exercici_9.Modules.Users.Model.BLL.BLL_users.files_users.Normal.On_demant.N_XML;
import Exercici_9.Utils.file_setting.s_json;

public class files_generic {
	// ---------------------------------------------------Auto-----------------------------------------------//
	public static void files_open_auto() {
		A_XML.obri_xml_default();
		A_JSON.obri_json_auto();
		A_TXT.obri_txt_auto();
		c_json.obri_json_auto();
		c_txt.obri_txt_auto();
		c_xml.obri_xml_auto();
		n_json.obri_json_auto();
		n_txt.obri_txt_auto();
		n_xml.obri_xml_default();
		s_json.openjson_config();
	}

	public static void files_save_auto() {
		A_XML.genera_xml_auto();
		A_TXT.gernera_txt_auto();
		A_JSON.genera_json_auto();
		n_json.genera_json_auto();
		n_txt.gernera_txt_auto();
		n_xml.genera_xml_auto();
		c_json.genera_json_auto();
		c_txt.gernera_txt_auto();
		c_xml.genera_xml_auto();
		s_json.savejson_config();
	}

	// ---------------------------------------------------On demant-----------------------------------------------//
	public static void files_open_on_demant(int i) {

		if (Setting.getInstance().getFile().equals("json")) {
			if (i == 0) {
				N_JSON.obri_json();
			} else if (i == 1) {
				JSON.obri_json();
			} else if (i == 2) {
				C_JSON.obri_json();
			}
		} else if (Setting.getInstance().getFile().equals("xml")) {
			if (i == 0) {
				N_XML.obri_xml();
			} else if (i == 1) {
				XML.obri_xml();
			} else if (i == 2) {
				C_XML.obri_xml();
			}
		} else if (Setting.getInstance().getFile().equals("txt")) {
			if (i == 0) {
				N_TXT.obri_txt();
			} else if (i == 1) {
				TXT.obri_txt();
			} else if (i == 2) {
				C_TXT.obri_txt();
			}
		}
	}

	public static void files_save_on_demant(int i) {
		if (Setting.getInstance().getFile().equals("json")) {
			if (i == 0) {
				N_JSON.generajson();
			} else if (i == 1) {
				JSON.generajson();
			} else if (i == 2) {
				C_JSON.generajson();
			}
		} else if (Setting.getInstance().getFile().equals("xml")) {
			if (i == 0) {
				N_XML.generaxml();
			} else if (i == 1) {
				XML.generaxml();
			} else if (i == 2) {
				C_XML.generaxml();
			}
		} else if (Setting.getInstance().getFile().equals("txt")) {
			if (i == 0) {
				N_TXT.generatxt();
			} else if (i == 1) {
				TXT.generatxt();
			} else if (i == 2) {
				C_TXT.generatxt();
			}
		}
	}
}
