package Conversor.com;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
public class GerandoJson {
	
	public static void main(String[] args) {
		
		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();
		
		FileWriter writeFile = null;
		
		//Armazenando dados em JSON
		jsonObject.put("nome", "Lucas"); 
		jsonObject.put("sobrenome", "Figueiredo");
		jsonObject.put("pais", "Brasil");
		jsonObject.put("estado", "PB");
		
		try{
			//Declarando um escritor
			writeFile = new FileWriter("arquivo.json");
			//Escreve no arquivo conteudo do Objeto JSON
		    writeFile.write(jsonObject.toString());
			writeFile.close();
			
			} catch(IOException e){
				e.printStackTrace();
				} 
		//Imprime na tela o Objeto JSON para visualização
		System.out.println(jsonObject); 
	
		}
	}