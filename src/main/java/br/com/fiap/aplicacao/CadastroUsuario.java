package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entidades.Usuario;

public class CadastroUsuario {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroUsuario");
		EntityManager em = emf.createEntityManager();
		
		//Usuario usuario = new Usuario("Caio Novaes", "caionovaes@email.com", "123456");
		Usuario usuario2 = new Usuario("Nicolas Cunha", "nicolascunha@email.com", "789012");

		
		try {
			em.persist(usuario2);
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
