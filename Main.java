
import entities.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(1, "ahmed", "Ahmed", "Informatique", 3);
        Employe e2 = new Employe(2, "Tounsi", "Sami", "RH", 2);
        Employe e3 = new Employe(3, "Abdlkefi", "Nermine", "Informatique", 1);
        Employe e4 = new Employe(4, "Louati", "Islem", "Finance", 4);
        Employe e5 = new Employe(5, "Zaghdoudi ", "Roua", "Informatique", 2);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        // Affichage
        societe.displayEmploye();

        // Recherche
        System.out.println("\n Recherche par nom (Louati) : " + societe.rechercherEmploye("Louati"));

        // Suppression
        societe.supprimerEmploye(e2);

        // Tri par ID
        societe.trierEmployeParId();

        // Tri personnalisé
        societe.trierEmployeParNomDépartementEtGrade();

        // Recherche avancée par département
        List<Employe> infoDept = societe.rechercherParDepartement("Informatique");
        System.out.println("\n  Employés du département Informatique :");
        for (Employe e : infoDept) {
            System.out.println(e);
        }
    }
}
