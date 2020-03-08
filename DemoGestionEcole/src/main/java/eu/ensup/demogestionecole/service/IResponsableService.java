package eu.ensup.demogestionecole.service;

import java.util.List;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.domaine.Responsable;

public interface IResponsableService {

	public Etudiant ajouterEtudiant(Etudiant etudiant);

	public Etudiant lireEtudiant(Etudiant etudiant);

	public List<Responsable> lireResponsable(Responsable responsable);

	public List<Etudiant> listerEtudiants();

	public Etudiant modifierEtudiant(Etudiant etudiant);

	public int supprimerEtudiant(Long idetudiant);
}
