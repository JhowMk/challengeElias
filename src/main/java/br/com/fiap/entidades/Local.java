package br.com.fiap.entidades;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "TB_Local", uniqueConstraints = @UniqueConstraint(columnNames = "Cnpj"))
@SequenceGenerator(name = "Local", sequenceName = "SQ_TB_LOCAL", allocationSize = 1)
public class Local {
	
	@Id
	@Column(name = "CD_Local")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Local")
	private Integer CodigoLocal;
	
	@Column(name = "Nome", nullable = false, length = 50)
	private String Nome;
	
	@Column(name = "Email", nullable = false, length = 50)
	private String Email;
	
	@Column(name = "Senha", nullable = false, length = 16)
	private String Senha;
	
	@Column(name = "Coordenada_Local", nullable = false, length = 5)
	private String CoordenadaLocal;
	
	@Column(name = "SaldoCarteira", nullable = false, length = 16)
	private BigDecimal SaldoCarteira;
	
	@Column(name = "CNPJ", nullable = false, length = 18)
	private String Cnpj;
	
	@OneToMany(mappedBy = "local")
	private List <Anuncio> anuncio;
	
	@OneToMany(mappedBy = "local")
	private List<VisitasUsuario> visitasUsuario;
	
	@OneToOne(mappedBy = "cdLocal")
	private LoginLocal loginLocal;
	
	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigoLocal() {
		return CodigoLocal;
	}

	public void setCodigoLocal(Integer codigoLocal) {
		CodigoLocal = codigoLocal;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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

	public String getCoordenadaLocal() {
		return CoordenadaLocal;
	}

	public void setCoordenadaLocal(String coordenadaLocal) {
		CoordenadaLocal = coordenadaLocal;
	}

	public BigDecimal getSaldoCarteira() {
		return SaldoCarteira;
	}

	public void setSaldoCarteira(BigDecimal saldoCarteira) {
		SaldoCarteira = saldoCarteira;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public List<Anuncio> getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(List<Anuncio> anuncio) {
		this.anuncio = anuncio;
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
		result = prime * result + ((Cnpj == null) ? 0 : Cnpj.hashCode());
		result = prime * result + ((CodigoLocal == null) ? 0 : CodigoLocal.hashCode());
		result = prime * result + ((CoordenadaLocal == null) ? 0 : CoordenadaLocal.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((SaldoCarteira == null) ? 0 : SaldoCarteira.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		result = prime * result + ((anuncio == null) ? 0 : anuncio.hashCode());
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
		Local other = (Local) obj;
		if (Cnpj == null) {
			if (other.Cnpj != null)
				return false;
		} else if (!Cnpj.equals(other.Cnpj))
			return false;
		if (CodigoLocal == null) {
			if (other.CodigoLocal != null)
				return false;
		} else if (!CodigoLocal.equals(other.CodigoLocal))
			return false;
		if (CoordenadaLocal == null) {
			if (other.CoordenadaLocal != null)
				return false;
		} else if (!CoordenadaLocal.equals(other.CoordenadaLocal))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (SaldoCarteira == null) {
			if (other.SaldoCarteira != null)
				return false;
		} else if (!SaldoCarteira.equals(other.SaldoCarteira))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		if (anuncio == null) {
			if (other.anuncio != null)
				return false;
		} else if (!anuncio.equals(other.anuncio))
			return false;
		if (visitasUsuario == null) {
			if (other.visitasUsuario != null)
				return false;
		} else if (!visitasUsuario.equals(other.visitasUsuario))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
