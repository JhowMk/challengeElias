package br.com.fiap.entidades;

import java.util.Calendar;

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
@Table(name = "TB_VisitasUsuario")
@SequenceGenerator(name = "visitasUsuario", sequenceName = "SQ_TB_VISITASUSUARIO", allocationSize = 1)
public class VisitasUsuario {
	
	@Id
	@Column(name = "CD_Historico")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visitasUsuario")
	private Integer Historico;
	
	@Column(name = "Data_Visita", nullable = false)
	private Calendar DataVisita;
	
	@Column(name = "Favorito", nullable = false)
	private Integer Favorito;
	
	@ManyToOne
	@JoinColumn(name = "CodigoLocal")
	private Local local;
	
	@ManyToOne
	@JoinColumn(name = "CodigoUsuario")
	private Usuario usuario;

	public VisitasUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitasUsuario(Integer historico, Calendar dataVisita, Integer favorito, Local local, Usuario usuario) {
		super();
		Historico = historico;
		DataVisita = dataVisita;
		Favorito = favorito;
		this.local = local;
		this.usuario = usuario;
	}

	public Integer getHistorico() {
		return Historico;
	}

	public void setHistorico(Integer historico) {
		Historico = historico;
	}

	public Calendar getDataVisita() {
		return DataVisita;
	}

	public void setDataVisita(Calendar dataVisita) {
		DataVisita = dataVisita;
	}

	public Integer getFavorito() {
		return Favorito;
	}

	public void setFavorito(Integer favorito) {
		Favorito = favorito;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataVisita == null) ? 0 : DataVisita.hashCode());
		result = prime * result + ((Favorito == null) ? 0 : Favorito.hashCode());
		result = prime * result + ((Historico == null) ? 0 : Historico.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		VisitasUsuario other = (VisitasUsuario) obj;
		if (DataVisita == null) {
			if (other.DataVisita != null)
				return false;
		} else if (!DataVisita.equals(other.DataVisita))
			return false;
		if (Favorito == null) {
			if (other.Favorito != null)
				return false;
		} else if (!Favorito.equals(other.Favorito))
			return false;
		if (Historico == null) {
			if (other.Historico != null)
				return false;
		} else if (!Historico.equals(other.Historico))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
}
