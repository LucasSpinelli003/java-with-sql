package br.com.fiap.banco.model;

public class Produto {
	private String nome;
	private int codigo, qtd;
	private double precoVenda, precoCompra;
	
		
		public Produto() {}
	
		public Produto(String nome, int codigo, int qtd, double precoVenda, double precoCompra) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.qtd = qtd;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
	}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getQtd() {
			return qtd;
		}
		public void setQtd(int qtd) {
			this.qtd = qtd;
		}
		public double getPrecoVenda() {
			return precoVenda;
		}
		public void setPrecoVenda(double precoVenda) {
			this.precoVenda = precoVenda;
		}
		public double getPrecoCompra() {
			return precoCompra;
		}
		public void setPrecoCompra(double precoCompra) {
			this.precoCompra = precoCompra;
		}
}
