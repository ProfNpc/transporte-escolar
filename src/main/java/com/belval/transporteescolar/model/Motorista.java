package com.belval.transporteescolar.model;

public class Motorista {
	
	private int id;
	private String nome;
	private double cpf;
	private double cnh;
	
	public Motorista(int id, String nome, double cpf, double cnh) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
	}

	public Motorista() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getcpf() {
		return cpf;
	}

	public void setcpf(double cpf) {
		this.cpf = cpf;
	}

	public double getcnh() {
		return cnh;
	}

	public void setcnh(double cnh) {
		this.cnh = cnh;
	}
	
	
	
	

}