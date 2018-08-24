package br.com.db1.type;

public enum TipoTelefone {
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial"),
	REFERENCIA("Refer�ncia"),
	CELULAR("Celular");
	
	private String tipoTelefone;
	TipoTelefone(String tipoTel){
		this.tipoTelefone = tipoTel;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
