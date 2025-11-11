package entities;
import interfaces.IGestion;
import interfaces.IRechercheAvancee;
import java.util.*;
public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employé ajouté : " + e.getNom());
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (employes.remove(e)) {
            System.out.println(" Employé supprimé : " + e.getNom());
        } else {
            System.out.println("Employé introuvable !");
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("\n Liste des employés :");
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
        System.out.println("\n Employés triés par ID :");
        displayEmploye();
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom));

        System.out.println("\n  Employés triés par Département, Grade et Nom :");
        displayEmploye();
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
