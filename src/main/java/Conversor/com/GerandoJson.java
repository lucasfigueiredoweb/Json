package Conversor.com;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
public class GerandoJson {
	
	public static void main(String[] args) {
		
		JSONObject jsonObject = new JSONObject();
		
		FileWriter writeFile = null;
		
		jsonObject.put("nome", "Lucas"); 
		jsonObject.put("sobrenome", "Figueiredo");
		jsonObject.put("pais", "Brasil");
		jsonObject.put("estado", "PB");
		
		try{
			writeFile = new FileWriter("arquivo.json");
		    writeFile.write(jsonObject.toString());
			writeFile.close();
			
			} catch(IOException e){
				e.printStackTrace();
				} 
		System.out.println(jsonObject); 
	
		}
	}