package br.com.fiap.aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.entidades.Usuario;

public class ListarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroUsuario");
		EntityManager em = emf.createEntityManager();


		Query query = em.createQuery("select v from Usuario v");
		
		List<Usuario> usuarios = query.getResultList();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getCodigoUsuario() + " - " 
					+ usuario.getNomeUsuario() + " - " 
					+ usuario.getEmail());
					
		}


		System.out.println("Processo realizado com sucesso!");
		em.close(); // fechando...
		emf.close();
	}

}
