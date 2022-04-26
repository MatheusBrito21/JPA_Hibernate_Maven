package visao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Programa {
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulaJPA_Maven");
		EntityManager em = emf.createEntityManager();
		
		Usuario u1 = new Usuario("Steve Rogers", "cap@gmail.com");
		Usuario u2 = new Usuario("Tony Stark", "tony@gmail.com");
		Usuario u3 = new Usuario("Bruce Banner", "hulk@gmail.com");
		Usuario u4 = new Usuario("Thor", "strg_avenger@gmail.com");

		em.getTransaction().begin();
		em.persist(u1);
		em.persist(u2);
		em.persist(u3);
		em.persist(u4);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("Pronto!!!");
	}
}
