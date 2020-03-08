package eu.ensup.demogestionecole.dao;

import java.util.List;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.domaine.Responsable;

public interface IResponsableDao {

	public int deleteEtudiant(Long idetudiant);

	public Etudiant insertEtudiant(Etudiant etudiant);

	public List<Etudiant> listEtudiants();

	public Etudiant selectEtudiant(Etudiant etudiant);

	public List<Responsable> selectResponsable(Responsable responsable);

	public Etudiant updateEtudiant(Etudiant etudiant);

}
