package br.edu.cefsa.EC6.Compiladores.N1B1.Dojo;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Principal {

	private static Set<String> pr;

	public static void main(String[] args) throws FileNotFoundException {

		// criaListaPr();
		formataStringLeitura();

	}

	public static void criaListaPr() throws FileNotFoundException {
		pr = new HashSet<String>();

		Scanner scanner = new Scanner(new File(
				"C:\\Users\\fabid\\OneDrive\\FTT\\EC6\\Linguagem de Programação II\\Workspace Eclipse\\br.edu.cefsa.EC6.Compiladores.N1B1.Dojo\\bin\\br\\edu\\cefsa\\EC6\\Compiladores\\N1B1\\Dojo\\palavras reservadas js.txt"));
		String texto = "";
		while (scanner.hasNextLine()) {
			texto += scanner.nextLine();// .replace("\n","").replace("\r","") ;
		}
		String[] lista_pr = texto.split(",");
		for (String string : lista_pr) {
			pr.add(string);
			System.out.println(string);
		}

	}

	public static void formataStringLeitura() throws FileNotFoundException {

		Scanner scanner = new Scanner(new File(
				"C:\\Users\\fabid\\OneDrive\\FTT\\EC6\\Linguagem de Programação II\\Workspace Eclipse\\br.edu.cefsa.EC6.Compiladores.N1B1.Dojo\\bin\\br\\edu\\cefsa\\EC6\\Compiladores\\N1B1\\Dojo\\jquery-3.6.0.txt"));
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

	private static void testandoFileInputStream() throws Exception {

		FileInputStream arquivo = new FileInputStream("hello.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(arquivo);
		int c = inputStreamReader.read();

		while (c != -1) {
			System.out.print((char) c);
			c = inputStreamReader.read();
		}
		inputStreamReader.close();
	}

	public void lixo() {

		Lexema l = new Lexema("2", "teste", "variavel");

		// System.out.println(l);

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
