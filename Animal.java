package Atividade0210;

public class Animal {
	private String cor;
	private float tamanho;

	public Animal () {
	}
	public Animal (float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
}
