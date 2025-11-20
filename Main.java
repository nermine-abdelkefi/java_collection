
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
        //prosit9
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Comptabilité", 10);
        Departement d3 = new Departement(3, "Ressources Humaines", 15);
        Departement d4 = new Departement(2, "Comptabilité", 10); // doublon

        // Ajout
        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4); // ne sera pas ajouté (déjà existant)

        // Affichage
        gestion.afficherDepartement();

        // Recherche
        System.out.println("Recherche 'Comptabilité' : "+ gestion.rechercheDepartement("Comptabilité"));
                System.out.println("Recherche objet d3 : " + gestion.rechercherDepartement(d3));
                //  Suppression
                        gestion.supprimerDepartement(d2);
        gestion.afficherDepartement();

        // Tri bi id
        gestion.trierDepartementParId();

        // Tri par Nom w Nbr d'employés
        gestion.trierDepartementsParNomEtNombreEmployes();
        //*********************************************
        // a partir min prosit 10

      // Création de la structure d’affectation
        AffectationHashMap affect = new AffectationHashMap();

      // Création des dép
        Departement dep1 = new Departement(10, "Info", 25);
        Departement dep2 = new Departement(20, "web", 15);
        Departement dep3 = new Departement(30, "IT", 20);

     // Affectation emp  aux dép
        affect.ajouterEmployeDepartement(e1, dep1);
        affect.ajouterEmployeDepartement(e2, dep2);
        affect.ajouterEmployeDepartement(e3, dep1);
        affect.ajouterEmployeDepartement(e4, dep3);
        affect.ajouterEmployeDepartement(e5, dep1);

    // Test : ajout un emp  déjà affecté
        affect.ajouterEmployeDepartement(e1, dep3);

   // Aff des affectations
        affect.afficherEmployesEtDepartements();

   // Supp d’un emp
        System.out.println("\n supp ta3 e2");
        affect.supprimerEmploye(e2);
        affect.afficherEmployesEtDepartements();

   // Recherche
        System.out.println("\nRech employé e3 : " + affect.rechercherEmploye(e3));
        System.out.println("Recherche département IT : " + affect.rechercherDepartement(dep3));

  // Tri des affectations
        System.out.println("\n--- Tri emp ---");
        System.out.println(affect.trierMap());

    }
}




