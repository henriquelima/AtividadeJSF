package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class TesteBean {
	private String nome1;
	private String nome2;
	public String aux;
	
	public String getNome1() {
		return nome1;}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public void trocar(){
		aux = nome1;
		nome1 = nome2;
		nome2 = aux ;
		return ;
	}

}
