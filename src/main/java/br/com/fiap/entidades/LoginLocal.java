package br.com.fiap.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Login_Local")
public class LoginLocal implements Serializable{
	
	@Column(name = "Email", nullable = false, length = 50)
	private String Email;
	
	@Column(name = "Senha", nullable = false, length = 16)
	private String Senha;
	
	@Column(name = "CNPJ", nullable = false, length = 18)
	private String Cnpj;
	
	@Id
	@OneToOne
	@JoinColumn(name = "CodigoLocal")
	private Local cdLocal;

	public LoginLocal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginLocal(String email, String senha, String cnpj, Local cdLocal) {
		super();
		Email = email;
		Senha = senha;
		Cnpj = cnpj;
		this.cdLocal = cdLocal;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public Local getCdLocal() {
		return cdLocal;
	}

	public void setCdLocal(Local cdLocal) {
		this.cdLocal = cdLocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cnpj == null) ? 0 : Cnpj.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		result = prime * result + ((cdLocal == null) ? 0 : cdLocal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginLocal other = (LoginLocal) obj;
		if (Cnpj == null) {
			if (other.Cnpj != null)
				return false;
		} else if (!Cnpj.equals(other.Cnpj))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		if (cdLocal == null) {
			if (other.cdLocal != null)
				return false;
		} else if (!cdLocal.equals(other.cdLocal))
			return false;
		return true;
	}
	
	
}
