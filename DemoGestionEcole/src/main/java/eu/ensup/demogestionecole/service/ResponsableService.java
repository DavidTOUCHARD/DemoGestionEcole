package eu.ensup.demogestionecole.service;

import java.util.List;

import eu.ensup.demogestionecole.dao.IResponsableDao;
import eu.ensup.demogestionecole.dao.ResponsableDao;
import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.domaine.Responsable;

public class ResponsableService implements IResponsableService {

	IResponsableDao respdao = new ResponsableDao();

	@Override
	public Etudiant ajouterEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return respdao.insertEtudiant(etudiant);
	}

	@Override
	public Etudiant lireEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return respdao.selectEtudiant(etudiant);
	}

	@Override
	public List<Responsable> lireResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		return respdao.selectResponsable(responsable);
	}

	@Override
	public List<Etudiant> listerEtudiants() {
		// TODO Auto-generated method stub
		return respdao.listEtudiants();
	}

	@Override
	public Etudiant modifierEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return respdao.updateEtudiant(etudiant);
	}

	@Override
	public int supprimerEtudiant(Long idetudiant) {
		// TODO Auto-generated method stub
		return respdao.deleteEtudiant(idetudiant);
	}

}
