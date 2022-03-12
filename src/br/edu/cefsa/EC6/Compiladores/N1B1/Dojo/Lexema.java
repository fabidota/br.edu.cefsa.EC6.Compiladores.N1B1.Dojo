package br.edu.cefsa.EC6.Compiladores.N1B1.Dojo;

public class Lexema {
	
	private String posicao;
	private String token;
	private String tipo;
	
	public Lexema(String posicao, String token, String tipo) {
		this.posicao=posicao;
		this.token=token;
		this.tipo=tipo;		
	}
	
	public String getPosicao() {
		return posicao;
	}
	public String getTipo() {
		return tipo;
	}public String getToken() {
		return token;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s  %-20s  %s", this.posicao, this.token, this.tipo);
	}

}
