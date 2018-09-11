package com.luis.backend.dto;

import com.luis.backend.domain.Competencia;

public class CompetenciaDTO {

	private Integer id;
	private String nome;


	public CompetenciaDTO() {

	}

	public CompetenciaDTO(Competencia obj) {

	}
	
	public CompetenciaDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
