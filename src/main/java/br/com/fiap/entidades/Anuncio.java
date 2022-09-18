package br.com.fiap.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Anuncio")
@SequenceGenerator(name = "anuncio", sequenceName = "SQ_TB_ANUNCIO", allocationSize = 1)
public class Anuncio {
	
	@Id
	@Column(name = "CD_Anuncio")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anuncio")
	private Integer CodigoAnuncio;
	
	@Column(name = "Titulo", length = 60, nullable = false)
	private String Titulo;
	
	@Column(name = "Texto", length = 160, nullable = false)
	private String Texto;
	
	@Column(name = "Imagem")
	private byte Imagem;
	
	@ManyToOne
	@JoinColumn(name = "CodigoLocal")
	private Local local;

	public Anuncio(Integer codigoAnuncio, String titulo, String texto, byte imagem, Local local) {
		super();
		CodigoAnuncio = codigoAnuncio;
		Titulo = titulo;
		Texto = texto;
		Imagem = imagem;
		this.local = local;
	}

	public Anuncio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigoAnuncio() {
		return CodigoAnuncio;
	}

	public void setCodigoAnuncio(Integer codigoAnuncio) {
		CodigoAnuncio = codigoAnuncio;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	public byte getImagem() {
		return Imagem;
	}

	public void setImagem(byte imagem) {
		Imagem = imagem;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodigoAnuncio == null) ? 0 : CodigoAnuncio.hashCode());
		result = prime * result + Imagem;
		result = prime * result + ((Texto == null) ? 0 : Texto.hashCode());
		result = prime * result + ((Titulo == null) ? 0 : Titulo.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
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
		Anuncio other = (Anuncio) obj;
		if (CodigoAnuncio == null) {
			if (other.CodigoAnuncio != null)
				return false;
		} else if (!CodigoAnuncio.equals(other.CodigoAnuncio))
			return false;
		if (Imagem != other.Imagem)
			return false;
		if (Texto == null) {
			if (other.Texto != null)
				return false;
		} else if (!Texto.equals(other.Texto))
			return false;
		if (Titulo == null) {
			if (other.Titulo != null)
				return false;
		} else if (!Titulo.equals(other.Titulo))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		return true;
	}
	
	 
}
