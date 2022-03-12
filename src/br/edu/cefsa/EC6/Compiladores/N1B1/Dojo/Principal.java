package br.edu.cefsa.EC6.Compiladores.N1B1.Dojo;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.*;

public class Principal {

	private static Set<String> prs;
	private static Set<Lexema> objs;
	private static Set<Lexema> tokens;
	private static final String arquivoPR = "palavras reservadas js_semvar.txt";
	private static final String arquivoLeituraJS = "jquery-3.6.0.txt";
	private static final String arquivoSaida = "lexemas.lex";

	public static void main(String[] args) {

		try {
			tokens = new HashSet<Lexema>();
			criaListaPr();
			// formataStringLeitura();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void criaListaPr() throws FileNotFoundException {
		prs = new HashSet<String>();

		Scanner scanner = new Scanner(new File(arquivoPR));
		String texto = "";
		while (scanner.hasNextLine()) {
			texto += scanner.nextLine();// .replace("\n","").replace("\r","") ;
		}
		String[] lista_pr = texto.split(",");
		for (String string : lista_pr) {
			prs.add(string);
			System.out.println(string);
		}

	}

	public static void formataStringLeitura() throws FileNotFoundException {

		Scanner scanner = new Scanner(new File(arquivoLeituraJS));
		String allString = "";

		String actualLine = "";

		while (scanner.hasNextLine()) {

			actualLine = scanner.nextLine();

			if (!actualLine.trim().startsWith("//"))
				allString += actualLine;
		}

		allString = allString.replace("\r", "").replace("\n", "");

		System.out.println(allString);

	}

	private static void gravaDados() throws Exception {

		FileWriter fw = new FileWriter(arquivoSaida, StandardCharsets.UTF_8);
		BufferedWriter escreveArquivo = new BufferedWriter(fw);

		for (Lexema lexema : tokens) {
			escreveArquivo.write(lexema.toString());
			escreveArquivo.newLine();
			escreveArquivo.flush();
		}
		escreveArquivo.close();
	}

	public void lixo() throws Exception {

		Lexema l = new Lexema(2L, "teste", Tipo.VARIAVEL);
		System.out.println(l);

		
		tokens.add(new Lexema(1L, "teste", Tipo.VARIAVEL));
		tokens.add(new Lexema(2L, "2.5f", Tipo.FLOAT));
		tokens.add(new Lexema(85L, "if", Tipo.PALAVRARESERVADA));
		gravaDados();
		
		/*
		 * varredura antiga while (scanner.hasNextLine()) { allString +=
		 * scanner.nextLine();//.replace("\n","").replace("\r","") ; }
		 * 
		 * 
		 * 
		 * allString = allString.replace("\r", "");
		 * 
		 * System.out.println(allString);
		 */
	}

}
