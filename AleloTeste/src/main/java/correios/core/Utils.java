package correios.core;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import constants.Globals;

public class Utils {

	public static void gravarDados(String data) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(Globals.PATH, true));
		writer.append(' ');
		writer.append(data);
		writer.close();
	}

	public static String obterDadosChave(String chave) {
		return Globals.DADOS_CEP.get(chave).toString();
	}
	
	public static void lerJson() throws java.io.IOException, ParseException, org.json.simple.parser.ParseException {

		JSONObject obj;
		JSONParser parser = new JSONParser();
		FileReader f = null;
		f = new FileReader(Globals.PATH);
		obj = (JSONObject) parser.parse(f);
		Globals.DADOS_CEP = obj;
	}

}