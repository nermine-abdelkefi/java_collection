import entities.Departement;
import interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {


    // HashSet ne permet pas les doublons et est rapide pour recherche/ajout
    private HashSet<Departement> departements = new HashSet<>();

    //  Ajout un département
    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println(" Département ajouté avec succès !");
        } else {
            System.out.println("Ce département existe déjà !");
        }
    }

    // Rechercher par nom
    @Override
    public boolean rechercheDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    //  Rech par objet
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    // Supp un département
    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println(" Département supprimé avec succès !");
        } else {
            System.out.println("Département introuvable !");
        }
    }

    // Afficher tous les départements
    @Override
    public void afficherDepartement() {
        System.out.println(" Liste des départements :");
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Trier par ID
    @Override
    public void trierDepartementParId() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparingInt(Departement::getId));
        System.out.println("Départements triés par ID :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    // --- Trier par Nom puis par Nombre d'employés ---
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparing(Departement::getNomDepartement)
                .thenComparingInt(Departement::getNombreEmployes));
        System.out.println("Départements triés par Nom et Nombre d'employés :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}
