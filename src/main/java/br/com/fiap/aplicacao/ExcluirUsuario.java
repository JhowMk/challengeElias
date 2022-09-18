package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entidades.Usuario;

public class ExcluirUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroUsuario");
		EntityManager em = emf.createEntityManager();
		
		
		Usuario usuario = em.find(Usuario.class, 1L);
		
		try {
			em.remove(usuario);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		System.out.println("Processo realizado com sucesso!");
		em.close();
		emf.close();
	
	}

}
