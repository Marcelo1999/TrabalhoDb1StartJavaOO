package br.com.db1.type;

public enum Tamanho {
	P("Pequeno"), M("M�dio"), G("Grande");
	
	private String tamanho;
	Tamanho(String tamanhoP){
		this.tamanho = tamanhoP;
	}
	
	public String getTamanho() {
		return tamanho;
	}
}
