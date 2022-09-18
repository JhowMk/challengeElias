package br.com.fiap.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "TB_Usuario", uniqueConstraints = @UniqueConstraint(columnNames = "Email"))
@SequenceGenerator(name = "Usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {
	
	@Id
	@Column(name = "CD_Usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Usuario")
	private Integer CodigoUsuario;
	
	@Column(name = "Nome", nullable = false, length = 50)
	private String NomeUsuario;
	
	@Column(name = "Email", nullable = false, length = 50)
	private String Email;
	
	@Column(name = "Senha", nullable = false, length = 16)
	private String Senha;
	
	@OneToMany(mappedBy = "local")
	private List<VisitasUsuario> visitasUsuario;
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nomeUsuario, String email, String senha) {
		super();
		NomeUsuario = nomeUsuario;
		Email = email;
		Senha = senha;
	}

	public Integer getCodigoUsuario() {
		return CodigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		CodigoUsuario = codigoUsuario;
	}

	public String getNomeUsuario() {
		return NomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
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

	public List<VisitasUsuario> getVisitasUsuario() {
		return visitasUsuario;
	}

	public void setVisitasUsuario(List<VisitasUsuario> visitasUsuario) {
		this.visitasUsuario = visitasUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodigoUsuario == null) ? 0 : CodigoUsuario.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((NomeUsuario == null) ? 0 : NomeUsuario.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		result = prime * result + ((visitasUsuario == null) ? 0 : visitasUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (CodigoUsuario == null) {
			if (other.CodigoUsuario != null)
				return false;
		} else if (!CodigoUsuario.equals(other.CodigoUsuario))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (NomeUsuario == null) {
			if (other.NomeUsuario != null)
				return false;
		} else if (!NomeUsuario.equals(other.NomeUsuario))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		if (visitasUsuario == null) {
			if (other.visitasUsuario != null)
				return false;
		} else if (!visitasUsuario.equals(other.visitasUsuario))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
