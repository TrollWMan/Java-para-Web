package br.com.unimontes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "usu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Column(name = "usu_nome", length = 50)
	private String nome;

	@NotNull
	@Column(name = "usu_senha", length = 20)
	private String senha;

	@NotNull
	@Column(name = "usu_dataCadastro", columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Column(name = "usu_descricao", length = 100)
	private String descricao;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}