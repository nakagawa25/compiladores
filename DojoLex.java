package ftt.ec;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* DOJO - Analisador Léxico - Compiladores
 * Limpar arquivo e criar tabela de lexemas
 * 
 * Aluno:
 * Lucas Nakagawa
 * 
 */

public class DojoLex {

	public static void main(String[] args) throws IOException {
		// TODO Criar tabela de lexemas
		
		//System.getProperty("user.dir");
		
		File file = new File("D:\\Documentos\\Termomecanica\\Engenharia de Computação - 6\\Compiladores\\FTT-DOJO-Compiladores-2019-1-master\\src\\ftt\\ec\\jquery-3.4.1.js");
		  
		BufferedReader br = new BufferedReader(new FileReader(file));
		  
		String st;
		String full = "";
		  
		  
		while ((st = br.readLine()) != null) {
			  
			if(st.trim().startsWith("//")) continue;
			
			full += st.trim() + " ";
			 
		}
		  
		full = full.replaceAll("/\\*.+\\*/", "");

		FileWriter arquivo = new FileWriter("D:\\Documentos\\saida.txt");
		PrintWriter gravadorArquivo = new PrintWriter(arquivo);

		gravadorArquivo.printf(full);
		arquivo.close();
	}
}
