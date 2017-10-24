package br.com.greenMille.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
	private Long id;
    private String nome;
    private String email;
	
	
    public Users(Long id, String nome, String email) {
	    this.id = id;
	    this.nome = nome;
	    this.email = email;
	}

	
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	  
	

}
