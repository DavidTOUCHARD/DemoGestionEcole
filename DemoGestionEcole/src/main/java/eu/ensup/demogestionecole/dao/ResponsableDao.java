package eu.ensup.demogestionecole.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.domaine.Responsable;

public class ResponsableDao implements IResponsableDao {

	EntityManagerFactory emf;
	EntityManager em;

	@Override
	public Etudiant deleteEtudiant(Etudiant etudiant) {
		emf = Persistence.createEntityManagerFactory("demoGestionEcole-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// debuter la transaction
			tx.begin();
			// effectuer l'opération
			em.remove(etudiant);
			// valider la transaction
			tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return etudiant;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return etudiant;
		}
	}

	@Override
	public Etudiant insertEtudiant(Etudiant etudiant) {
		emf = Persistence.createEntityManagerFactory("demoGestionEcole-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// debuter la transaction
			tx.begin();
			// effectuer l'opération
			em.persist(etudiant);
			// valider la transaction
			tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return etudiant;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return etudiant;
		}
	}

	@Override
	public List<Etudiant> listEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant selectEtudiant(Etudiant etudiant) {
		emf = Persistence.createEntityManagerFactory("demoGestionEcole-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// debuter la transaction
			tx.begin();
			// effectuer l'opération
			em.find(null, etudiant);
			// valider la transaction
			tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return etudiant;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return etudiant;
		}
	}

	@Override
	public List<Responsable> selectResponsable(Responsable responsable) {
		emf = Persistence.createEntityManagerFactory("demoGestionEcole-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			Query query = em.createQuery("SELECT r FROM Responsable r WHERE r.nom = ?1 and r.password = ?2");
			query.setParameter(1, responsable.getNom());
			query.setParameter(2, responsable.getPassword());
			List<Responsable> resultList = query.getResultList();
			resultList.forEach(System.out::println);
			// debuter la transaction
			// tx.begin();
			// effectuer l'opération
			// em.find(null, responsable);
			// valider la transaction
			// tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return resultList;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return null;
		}
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant) {
		emf = Persistence.createEntityManagerFactory("demoGestionEcole-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// debuter la transaction
			tx.begin();
			// effectuer l'opération
			em.merge(etudiant);
			// valider la transaction
			tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return etudiant;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return etudiant;
		}
	}

}
